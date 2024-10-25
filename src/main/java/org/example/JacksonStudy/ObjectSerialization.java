package org.example.JacksonStudy;


import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectSerialization{
    public static void main(String[] args) {

        ObjectSerialization obj = new ObjectSerialization();
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total product");
        size = Integer.parseInt(sc.nextLine());

        ArrayList<Product> products = new ArrayList<>();

        try{
            for(int i=0;i<size;i++){
                Product product = new Product();
                String proId,proName,price;

                System.out.println("Employee ID of product" + (i+1));
                proId = sc.nextLine();
                product.setProId(proId);

                System.out.println("Employee Name of product" + (i+1));
                proName = sc.nextLine();
                product.setProName(proName);

                System.out.println("Price of product" + (i+1));
                price = sc.nextLine();
                product.setPrice(price);
                products.add(product);
            }

            obj.writeJSON(products);

            System.out.println("Data is written successfully in product.json file.");

        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeJSON(ArrayList<Product> products) throws JsonGenerationException,JsonMappingException,IOException {

        ObjectMapper obj = new ObjectMapper();
        obj.writerWithDefaultPrettyPrinter().writeValue(new File("C:\\Users\\mmh22\\OneDrive\\Desktop\\JavaProgram\\src\\main\\java\\org\\example\\JacksonStudy\\products.json"),products);
    }
}
