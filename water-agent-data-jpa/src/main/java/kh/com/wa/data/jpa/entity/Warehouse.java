package kh.com.wa.data.jpa.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "warehouse")
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Warehouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String name;

    @Column
    String address;

    @Column(name = "phone_number")
    String phone;

    @Column(name = "employee_id")
    Integer employeeId;

}
