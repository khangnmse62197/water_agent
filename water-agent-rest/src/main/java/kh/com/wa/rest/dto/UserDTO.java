package kh.com.wa.rest.dto;

import kh.com.wa.data.jpa.entity.vo.UserPermissionEnum;
import kh.com.wa.data.jpa.entity.vo.UserRoleEnum;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDTO {
    Integer id;

    String userName;

    String password;

    UserRoleEnum role;

    UserPermissionEnum permission;


}
