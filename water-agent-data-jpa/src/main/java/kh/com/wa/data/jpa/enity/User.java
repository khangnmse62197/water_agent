package kh.com.wa.data.jpa.enity;

import kh.com.wa.domain.vo.UserPermissionEnum;
import kh.com.wa.domain.vo.UserRoleEnum;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity(name = "user")
@Getter
@Setter
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    /**
     * To manage user role permission
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "user_name")
    String userName;

    @Column(name = "password")
    String password;

    @Column(name = "role")
    UserRoleEnum role;

    @Column(name = "role")
    UserPermissionEnum permission;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    Employee employee;

    @OneToOne(mappedBy = "employee")
    Audit audit;
}
