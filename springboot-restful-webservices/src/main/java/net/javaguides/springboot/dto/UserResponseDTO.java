package net.javaguides.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {
    private boolean isSuccess;
    private String userId;
    private String email;
    private String rollNumber;
    private List<String> numbers;
    private List<String> alphabets;
    private String highestLowercaseAlphabet;

    public static void setIsSuccess(boolean b) {
    }

    public void setSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }


    // Getters and Setters
}

