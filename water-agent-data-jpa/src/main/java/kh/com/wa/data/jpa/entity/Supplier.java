package kh.com.wa.data.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "supplier")
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;

    @Column
    String address;

    @Column(name = "phone_number")
    String phone;

    @ManyToMany
    @JoinTable(
            name = "supplier_category",
            joinColumns = @JoinColumn(name = "supplier_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    Set<Category> categories;
}
