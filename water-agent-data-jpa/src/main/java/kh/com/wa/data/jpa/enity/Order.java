package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "order")
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "customer_id")
    Integer customerId;

    @Column(name = "employee_id")
    Integer employeeId;

    @Column
    Integer total;

    @Column
    Integer discount;
}
