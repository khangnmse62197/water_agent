package kh.com.wa.data.jpa.enity;

import kh.com.wa.domain.vo.AuditTypeEnum;
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

    @Column(name = "user_id")
    Integer userId; //TODO add relation

    @Column
    AuditTypeEnum type;

    @Column(name = "order_id")
    Integer orderId; //TODO add relation

}
