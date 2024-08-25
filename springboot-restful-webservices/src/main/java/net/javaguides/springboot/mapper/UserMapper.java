package net.javaguides.springboot.mapper;

import net.javaguides.springboot.dto.UserRequestDto;
import net.javaguides.springboot.dto.UserResponseDTO;

public class UserMapper {

    // Mapping from UserRequestDto to UserResponseDto
    public static UserResponseDTO mapToUserResponseDto(UserRequestDto userRequestDto) {
        UserResponseDTO userResponseDto = new UserResponseDTO();

        // Assume you're setting fields directly from request to response
        userResponseDto.setEmail(userRequestDto.getEmail());
        userResponseDto.setRollNumber(userRequestDto.getRollNumber());

        // Other fields would be set after processing
        return userResponseDto;
    }

    // If you need a method to reverse map, you can define one, but it's not typical for this case
    // public static UserRequestDto mapToUserRequestDto(UserResponseDto userResponseDto) {
    //     // Your reverse mapping logic here, if needed
    // }

}


