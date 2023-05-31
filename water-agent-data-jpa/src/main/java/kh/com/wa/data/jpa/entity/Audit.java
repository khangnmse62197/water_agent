package kh.com.wa.data.jpa.entity;

import kh.com.wa.data.jpa.entity.vo.AuditTypeEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "audit")
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String description;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User user;

    @Column
    AuditTypeEnum type;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    Order order;

}
