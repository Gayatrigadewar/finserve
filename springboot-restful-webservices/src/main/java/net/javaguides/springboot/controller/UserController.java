package net.javaguides.springboot.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import net.javaguides.springboot.dto.ErrorDto;
import net.javaguides.springboot.dto.UserRequestDto;
import net.javaguides.springboot.dto.UserResponseDTO;
import net.javaguides.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> handlePostRequest(@RequestBody UserRequestDto userRequestDTO) {
        try {
            UserResponseDTO responseDTO = userService.processData(userRequestDTO);
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new ErrorDto("Error processing request"), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<Map<String, Integer>> handleGetRequest() {
        Map<String, Integer> response = new HashMap<>();
        response.put("operation_code", 1);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

