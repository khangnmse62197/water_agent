package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "tbl_order_detail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "quantity", nullable = false)
    Integer quantity;

    @Column(name = "quantity_price", nullable = false)
    Integer quantityPrice;

    @Column(name = "remarks", nullable = false)
    String remarks;

    @OneToOne(mappedBy = "orderDetail",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    PetProduct petProduct;
}
