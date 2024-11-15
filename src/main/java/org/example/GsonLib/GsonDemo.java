package org.example.GsonLib;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.example.JacksonLib.Address;
import org.example.JacksonLib.User;

import java.io.FileReader;

public class GsonDemo {

    public static void main(String[] args) throws Exception {
//        getJson(new User("Makarand","Hinge",22));
//        getJson(new User("Makarnad","Patil",22,new Address("507A","kagal","416216","Maharashtra")));
        String FileAddress = "D:\\Java\\src\\main\\java\\org\\example\\ExternalFile\\user_list.json";
        readFiles(FileAddress);

    }
    static void readFiles(String FileAddress) throws Exception{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        User[] user = gson.fromJson(new FileReader(FileAddress), User[].class);
        System.out.println(gson.toJson(user));
    }
   static void readFile(String FileAddress) throws Exception{
        Gson gson = new Gson();
        User user = gson.fromJson(new FileReader(FileAddress), User.class);
        System.out.println(gson.toJson(user));
    }

    public static void getJson(User user){
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);
        System.out.println(json);
        getObj(json);
    }

    private static void getObj(String json){
        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getAge());
        System.out.println(user.getAddress().getZipCode());
    }
}