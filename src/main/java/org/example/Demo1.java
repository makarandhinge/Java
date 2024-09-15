package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

public class Demo1 {


    public static void main(String[] args) {
        byte x = 64;
        int i;
        byte y;
        i = x << 2;
        y = ((byte) (x << 2));
        System.out.print(i + " " + y);
    }
    }

