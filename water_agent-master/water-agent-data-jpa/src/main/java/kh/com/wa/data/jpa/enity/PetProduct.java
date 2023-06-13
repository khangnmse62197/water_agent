package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tbl_pet_product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PetProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_product_id")
    Integer id;

    @Column(name = "product_code", nullable = false)
    Integer code;

    @Column(name = "product_name", nullable = false)
    Integer name;

    @Column(name = "product_detail", nullable = false)
    Integer detail;

    @Column(name = "vendor_price", nullable = false)
    Float vendorPrice;
    @Column(name = "retail_price", nullable = false)
    Float retailPrice;

    @Column(name = "discount", nullable = false)
    Float discount;


    @ManyToOne
    @JoinColumn(name = "pet_category_id", nullable = false)
    PetCategory petCategory;

    @ManyToOne
    @JoinColumn(name = "product_category_id", nullable = false)
    PetProductCategory petProductCategory;

    @OneToMany(mappedBy = "petProduct",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    List<PetProductSize> petProductSizes;

    @OneToMany(mappedBy = "petProduct",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    List<PetProductImages> petProductImages;

    @OneToOne(mappedBy = "petProduct",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    OrderDetail orderDetail;

}
