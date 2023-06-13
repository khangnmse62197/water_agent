package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "tbl_pet_product_images")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PetProductImages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "pet_product_images_link", nullable = false)
    String link;

    @Column(name = "pet_product_images_status", nullable = false)
    Integer status;

    @ManyToOne
    @JoinColumn(name = "pet_product_id", nullable = false)
    PetProduct petProduct;
}
