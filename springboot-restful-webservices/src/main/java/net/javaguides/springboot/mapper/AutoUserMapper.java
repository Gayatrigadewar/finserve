package net.javaguides.springboot.mapper;

import net.javaguides.springboot.dto.UserRequestDto;
import net.javaguides.springboot.dto.UserResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    // Mapping from UserRequestDto to UserResponseDto
    @Mapping(source = "email", target = "email")
    @Mapping(source = "rollNumber", target = "rollNumber")
    UserResponseDTO mapToUserResponseDto(UserRequestDto userRequestDto);

    // Reverse mapping, if needed
    // @Mapping(source = "email", target = "email")
    // @Mapping(source = "rollNumber", target = "rollNumber")
    // UserRequestDto mapToUserRequestDto(UserResponseDto userResponseDto);
}
