package kh.com.wa.data.jpa.enity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tbl_pet_category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class PetCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_category_id")
    Integer id;
    @Column(name = "pet_category_name", nullable = false)
    String name;

    @Column(name = "pet_category_status", nullable = false)
    String status;

    @JsonBackReference
    @OneToMany(mappedBy  = "petCategory",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    List<Pet> pets;

    @JsonBackReference
    @OneToMany(mappedBy = "petCategory",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    List<PetProduct> petProducts;
}
