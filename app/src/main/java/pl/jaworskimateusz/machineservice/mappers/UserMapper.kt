package pl.jaworskimateusz.machineservice.mappers

import pl.jaworskimateusz.machineservice.data.entity.User
import pl.jaworskimateusz.machineservice.dto.UserDto


class UserMapper {
    companion object {

        fun mapToUser(user: UserDto): User {
            return User(
                    user.userId,
                    user.username,
                    user.firstName,
                    user.lastName,
                    user.password,
                    user.phoneNumber,
                    user.role,
                    user.enabled,
                    user.department
            )
        }

    }
}
