package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tbl_pet_product_category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PetProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "product_category_name", nullable = false)
    String name;

    @Column(name = "product_category_status", nullable = false)
    Integer status;

    @OneToMany(mappedBy = "petProductCategory",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    List<PetProduct> petProducts;


}
