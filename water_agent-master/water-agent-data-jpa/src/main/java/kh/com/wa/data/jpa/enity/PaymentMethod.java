package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity(name = "tbl_payment_method")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "payment_method_name", nullable = false)
    String name;

    @Column(name = "status", nullable = false)
    Integer status;

    @OneToMany(mappedBy = "paymentMethod",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    List<Order> orders;

}
