package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;
import java.io.IOException;

public class JsonConveter {

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
             User user = objectMapper.readValue(new File("src/main/resources/org/example/user.json"), User.class);
//            System.out.println("Name: " + user.getName());
//            System.out.println("Name: " + user.getAge());
//            System.out.println("Name: " + user.getEmail());
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class User{
    String name;
    int age;
    String email;

}
