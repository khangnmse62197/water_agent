package kh.com.wa.data.jpa.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "category")
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;

    @ManyToMany(mappedBy = "categories")
    Set<Supplier> categories;

}
