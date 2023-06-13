package kh.com.wa.data.jpa.enity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "tbl_order_status")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column(name = "order_status_name", nullable = false)
    String name;

    @Column(name = "order_status_date", nullable = false)
    Date date;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    Order order;



}
