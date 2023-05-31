package kh.com.wa.data.jpa.entity;

import kh.com.wa.data.jpa.entity.vo.UserPermissionEnum;
import kh.com.wa.data.jpa.entity.vo.UserRoleEnum;
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

    @Column(name = "permission")
    UserPermissionEnum permission;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    Employee employee;

    @OneToOne(mappedBy = "user")
    Audit audit;
}
