package parkingcontrol.parkingcontrol.dtos;

import parkingcontrol.parkingcontrol.enums.UserRole;

public record RegisterDto(String email, String name, String password, UserRole role) {
}
