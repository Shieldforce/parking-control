package parkingcontrol.parkingcontrol.dtos;

import parkingcontrol.parkingcontrol.enums.UserRoleEnum;

public record RegisterDto(String email, String name, String password, UserRoleEnum role) {
}
