package kh.com.wa.data.jpa.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

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

    @OneToOne(mappedBy = "order")
    Audit audit;

    @OneToMany(mappedBy = "order")
    List<OrderDetail> orderDetails;
}
