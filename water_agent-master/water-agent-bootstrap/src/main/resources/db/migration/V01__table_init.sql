# --CREATE NEW DATABASE
CREATE DATABASE water_agent;

DROP TABLE IF EXISTS `audit`;
DROP TABLE IF EXISTS `category`;
DROP TABLE IF EXISTS `customer`;
DROP TABLE IF EXISTS `employee`;
DROP TABLE IF EXISTS `order`;
DROP TABLE IF EXISTS `order_detail`;
DROP TABLE IF EXISTS `product`;
DROP TABLE IF EXISTS `product_warehouse`;
DROP TABLE IF EXISTS `supplier`;
DROP TABLE IF EXISTS `supplier_category`;
DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `warehouse`;


# --1.create table pet
DROP TABLE IF EXISTS `tbl_pet`;

CREATE TABLE `tbl_pet`
(
    `pet_id`          int(11)      NOT NULL AUTO_INCREMENT,
    `pet_description` varchar(100) NOT NULL,
    `pet_category_id` int(11)      NOT NULL,
    `pet_images`      varchar(100) NOT NULL,
    `pet_status`      int(1)       NOT NULL,
    PRIMARY KEY (`pet_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --2.create table pet category
DROP TABLE IF EXISTS `tbl_pet_category`;

CREATE TABLE `tbl_pet_category`
(
    `pet_category_id`     int(11)     NOT NULL AUTO_INCREMENT,
    `pet_category_name`   varchar(50) NOT NULL,
    `pet_category_status` int(1)      NOT NULL,
    PRIMARY KEY (`pet_category_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --3.create table pet product size
DROP TABLE IF EXISTS `tbl_pet_product_size`;

CREATE TABLE `tbl_pet_product_size`
(
    `pet_product_size_id`     int(11)     NOT NULL AUTO_INCREMENT,
    `pet_product_size_name`   varchar(30) NOT NULL,
    `pet_product_size_status` int(1)      NOT NULL,
    `pet_product_id`          int(11)     NOT NULL,
    PRIMARY KEY (`pet_product_size_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --4.create table vendor (or supplier)
DROP TABLE IF EXISTS `tbl_vendor`;

CREATE TABLE `tbl_vendor`
(
    `company_id`             int(11)      NOT NULL,
    `company_name`           varchar(50)  NOT NULL,
    `company_contact_person` varchar(50)  NOT NULL,
    `company_email`          varchar(30)  NOT NULL,
    `company_contact_number` varchar(15)  NOT NULL,
    `company_website`        varchar(30)  NOT NULL,
    `company_profile`        varchar(250) NOT NULL,
    `vendor_status`          int(1)       NOT NULL,
    PRIMARY KEY (`company_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --5.create table pet product category
DROP TABLE IF EXISTS `tbl_pet_product_category`;

CREATE TABLE `tbl_pet_product_category`
(
    `product_category_id`     int(11)     NOT NULL AUTO_INCREMENT,
    `product_category_name`   varchar(50) NOT NULL,
    `product_category_status` int(1)      NOT NULL,
    PRIMARY KEY (`product_category_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --6.create table pet product images
DROP TABLE IF EXISTS `tbl_pet_product_images`;

CREATE TABLE `tbl_pet_product_images`
(
    `pet_product_images_id`     int(11)      NOT NULL AUTO_INCREMENT,
    `pet_product_images_link`   varchar(300) NOT NULL,
    `pet_product_images_status` int(1)       NOT NULL,
    `pet_product_id`            int(11)      NOT NULL,
    PRIMARY KEY (`pet_product_images_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --7.create table order status
DROP TABLE IF EXISTS `tbl_order_status`;

CREATE TABLE `tbl_order_status`
(
    `order_status_id`   int(1)      NOT NULL AUTO_INCREMENT,
    `order_status_name` varchar(50) NOT NULL,
    `order_status_date` DATE        not null,
    PRIMARY KEY (`order_status_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --8.create table payment method
DROP TABLE IF EXISTS `tbl_payment_method`;

CREATE TABLE `tbl_payment_method`
(
    `payment_method_id`   int(11)      NOT NULL AUTO_INCREMENT,
    `payment_method_name` varchar(100) NOT NULL,
    `status`              INT(1)       NOT NULL,
    PRIMARY KEY (`payment_method_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --9.create table customer shipping address
DROP TABLE IF EXISTS `tbl_customer_shipping_address`;

CREATE TABLE `tbl_customer_shipping_address`
(
    `customer_shipping_address_id` int(11)      NOT NULL AUTO_INCREMENT,
    `shipping_address`             varchar(100) NOT NULL,
    `status`                       INT(1)       NOT NULL,
    `customer_id`                  INT(11)      NOT NULL,
    PRIMARY KEY (`customer_shipping_address_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --10.create table customer
DROP TABLE IF EXISTS `tbl_customer`;

CREATE TABLE `tbl_customer`
(
    `customer_id`       int(11)      NOT NULL AUTO_INCREMENT,
    `permanent_address` varchar(100) NOT NULL,
    `user_id`           INT(11)      NOT NULL,
    PRIMARY KEY (`customer_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --11.create table customer cart
DROP TABLE IF EXISTS `tbl_customer_cart`;

CREATE TABLE `tbl_customer_cart`
(
    `customer_cart_id`     int(11) NOT NULL AUTO_INCREMENT,
    `date_create`          DATE    not null,
    `pet_product_id`       INT(11) NOT NULL,
    `pet_product_quantity` INT(5)  NOT NULL,
    `customer_cart_status` INT(1)  NOT NULL,
    `customer_id`          INT(11) NOT NULL,
    PRIMARY KEY (`customer_cart_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --12.create table user group
DROP TABLE IF EXISTS `tbl_user_group`;

CREATE TABLE `tbl_user_group`
(
    `user_group_id` int(1)       NOT NULL AUTO_INCREMENT,
    `group_name`    varchar(50)  NOT NULL,
    `description`   varchar(100) NOT NULL,
    `allow_add`     INT(1)       NOT NULL,
    `allow_edit`    INT(1)       NOT NULL,
    `allow_delete`  INT(1)       NOT NULL,
    PRIMARY KEY (`user_group_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --13.create table user
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user`
(
    `user_id`          int(11)      NOT NULL AUTO_INCREMENT,
    `username`         varchar(50)  NOT NULL,
    `password`         varchar(50)  NOT NULL,
    `avatar`           varchar(100) NOT NULL,
    `fullname`         varchar(50)  NOT NULL,
    `contact`          varchar(15)  NOT NULL,
    `email`            varchar(30)  NOT NULL,
    `user_category_id` int(1)       NOT NULL,
    `status`           int(1)       NOT NULL,
    PRIMARY KEY (`user_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = latin1;

# --14.create table order
DROP TABLE IF EXISTS `tbl_order`;

CREATE TABLE `tbl_order`
(
    `order_id`          int(11)   NOT NULL AUTO_INCREMENT,
    `customer_id`       int(11)   NOT NULL,
    `order_date`        date      NOT NULL,
    `order_status_id`   INT(1)    NOT NULL,
    `total_amount`      FLOAT(10) NOT NULL,
    `number_of_items`   INT(5)    NOT NULL,
    `payment_method_id` INT(11)   NOT NULL,
    PRIMARY KEY (`order_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

# --15.create table order detail
DROP TABLE IF EXISTS `tbl_order_detail`;

CREATE TABLE `tbl_order_detail`
(
    `order_detail_id` int(11)      NOT NULL AUTO_INCREMENT,
    `order_id`        int(11)      NOT NULL,
    `pet_product_id`  int(11)      NOT NULL,
    `quantity`        INT(5)       NOT NULL,
    `quantity_price`  INT(5)       NOT NULL,
    `remarks`         VARCHAR(200) NOT NULL,
    PRIMARY KEY (`order_detail_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;


# --16.create table pet product
DROP TABLE IF EXISTS `tbl_pet_product`;
CREATE TABLE `tbl_pet_product`
(
    `pet_product_id`      int(11)      NOT NULL,
    `product_code`        varchar(30)  NOT NULL,
    `product_name`        varchar(30)  NOT NULL,
    `product_detail`      varchar(100) NOT NULL,
    `product_category_id` int(11)      NOT NULL,
    `quantity_on_hand`    int(5)       NOT NULL,
    `vendor_price`        float(10)    NOT NULL,
    `retail_price`        float(10)    NOT NULL,
    `discount`            float(10)    NOT NULL,
    `vendor_id`           int(11)      NOT NULL,
    `pet_category_id`     int(11)      NOT NULL,
    PRIMARY KEY (`pet_product_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;



