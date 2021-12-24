package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "product_warehouse")
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductWarehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "product_id")
    Integer productId;

    @Column(name = "warehouse_id")
    Integer warehouseId;

    @Column(name = "amount")
    Integer amount;

}
