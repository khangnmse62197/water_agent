package kh.com.wa.data.jpa.enity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "tbl_pet")
@Getter
@Setter

//default tao constructor full tham so
@AllArgsConstructor(staticName = "of")
//default tao constructor ko tham so
@NoArgsConstructor
//config access modifier
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "pet_description", nullable = false)
    String description;
    @Column(name = "pet_images", nullable = false)
    String image;
    @Column(name = "pet_status", nullable = false)
    Integer status;

    @ManyToOne
    @JoinColumn(name = "pet_category_id", nullable = false)
    @JsonManagedReference
    PetCategory petCategory;

}
