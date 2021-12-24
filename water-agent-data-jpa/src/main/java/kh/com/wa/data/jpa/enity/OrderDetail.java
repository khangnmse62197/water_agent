package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "order_detail")
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "order_id")
    Integer orderId;

    @Column(name = "product_warehouse_id")
    Integer productWarehouseId; //TODO add relation

    @Column(name = "total")
    Integer total;

    @Column(name = "quantity")
    Integer quantity;
}
