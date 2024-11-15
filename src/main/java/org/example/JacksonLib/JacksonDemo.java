package org.example.JacksonLib;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.FileReader;

public class JacksonDemo {

    public static void main(String[] args) throws Exception {

//        getJson(new User("Makarnad","Patil",22));
//        getJson(new User("Makarnad","Patil",22,new Address("507A","kagal","416216","Maharashtra")));
        String FileAddress = "D:\\Java\\src\\main\\java\\org\\example\\ExternalFile\\user.json";
        String FileAddress2 = "D:\\Java\\src\\main\\java\\org\\example\\ExternalFile\\user_list.json";
        readFiles(FileAddress2);

    }


    static void readFiles(String FileAddress) throws Exception{
        ObjectMapper obj = new ObjectMapper();
        User[] user = obj.readValue(new FileReader(FileAddress), User[].class);
        System.out.println(obj.writerWithDefaultPrettyPrinter().writeValueAsString(user));
    }


    private static void getJson(User user) throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        String json = obj.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        System.out.println(json);
        getobj(json);
    }

    static void readFile(String FileAddress) throws Exception{
        ObjectMapper obj = new ObjectMapper();
        User user = obj.readValue(new FileReader(FileAddress), User.class);
        System.out.println(obj.writeValueAsString(user));
    }


    private static void getobj(String json) throws JsonProcessingException {
        User user = null;
        ObjectMapper obj = new ObjectMapper();
        user = obj.readValue(json, User.class);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());
        System.out.println(user.getAddress().getZipCode());

    }


}
