package net.javaguides.springboot.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.springboot.dto.UserRequestDto;
import net.javaguides.springboot.dto.UserResponseDTO;
import net.javaguides.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Override
    public UserResponseDTO processData(UserRequestDto userRequestDTO) {
        UserResponseDTO responseDTO = new UserResponseDTO();

        // Extract user ID from email
        String[] emailParts = userRequestDTO.getEmail().split("@")[0].split("\\.");
        String userId = emailParts[0] + "_" + emailParts[1] + "_" + userRequestDTO.getRollNumber();
        responseDTO.setUserId(userId);
        responseDTO.setEmail(userRequestDTO.getEmail());
        responseDTO.setRollNumber(userRequestDTO.getRollNumber());

        // Filter numbers and alphabets
        List<String> numbers = userRequestDTO.getData().stream().filter(this::isNumber).collect(Collectors.toList());
        List<String> alphabets = userRequestDTO.getData().stream().filter(this::isAlphabet).collect(Collectors.toList());

        responseDTO.setNumbers(numbers);
        responseDTO.setAlphabets(alphabets);

        // Get highest lowercase alphabet
        Optional<String> highestLowercase = alphabets.stream()
                .filter(this::isLowerCase)
                .max(String::compareTo);
        responseDTO.setHighestLowercaseAlphabet(highestLowercase.orElse(null));

        UserResponseDTO.setIsSuccess(true);
        return responseDTO;
    }

    private boolean isNumber(String value) {
        return value.matches("\\d+");
    }

    private boolean isAlphabet(String value) {
        return value.matches("[a-zA-Z]");
    }

    private boolean isLowerCase(String value) {
        return value.matches("[a-z]");
    }
}

