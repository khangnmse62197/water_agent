package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "supplier_category_id")
    Integer supplierCategoryId;

    @Column
    String name;

    @Column
    Integer price;

    @Column
    Integer promotion;
}
