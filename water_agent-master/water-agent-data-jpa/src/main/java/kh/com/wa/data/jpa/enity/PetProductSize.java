package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "tbl_pet_product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class PetProductSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "pet_product_size_name", nullable = false)
    String name;

    @Column(name = "pet_product_size_status", nullable = false)
    Integer status;

    @ManyToOne
    @JoinColumn(name = "pet_product_id", nullable = false)
    PetProduct petProduct;

}
