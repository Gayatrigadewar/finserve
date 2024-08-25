package net.javaguides.springboot.service;

import net.javaguides.springboot.dto.UserRequestDto;
import net.javaguides.springboot.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO processData(UserRequestDto userRequestDTO);
}
