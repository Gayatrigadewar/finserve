package net.javaguides.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private String email;
    private String rollNumber;

    @ElementCollection
    private List<String> numbers;

    @ElementCollection
    private List<String> alphabets;

    private String highestLowercaseAlphabet;

    // Getters and Setters
}

