package Workit.demo.Entity;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document (collection = "Users")

public class Users {

    @Id
    private UUID userId;
    
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
    private String fitnessGoals;
    

}
