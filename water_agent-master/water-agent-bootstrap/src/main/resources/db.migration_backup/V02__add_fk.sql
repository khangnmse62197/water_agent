ALTER TABLE supplier_category ADD CONSTRAINT supplier_category_UN UNIQUE KEY (supplier_id,category_id);


ALTER TABLE supplier_category MODIFY COLUMN id int NOT NULL;
ALTER TABLE supplier_category DROP PRIMARY KEY;
ALTER TABLE supplier_category DROP COLUMN id;
ALTER TABLE audit ADD CONSTRAINT audit_FK FOREIGN KEY (user_id) REFERENCES `user`(id);
ALTER TABLE audit ADD CONSTRAINT audit_FK_1 FOREIGN KEY (order_id) REFERENCES `order`(id);
ALTER TABLE `user` ADD CONSTRAINT user_FK FOREIGN KEY (employee_id) REFERENCES employee(id);
ALTER TABLE order_detail ADD CONSTRAINT order_detail_FK FOREIGN KEY (order_id) REFERENCES `order`(id);