package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        var fileName = "fortune.txt";
        String all_names = Files.readString(Paths.get(fileName));
        String[] name_list = all_names.split("\n");
        for (String name : name_list) {
            var reader = new Scanner(System.in);// would take the numbers
            System.out.print("How many fortunes do you want? ");
            var number = reader.nextInt();//variable for random number
            int result = number;
            //System.out.println(result);

            Random rand = new Random();// creating random methotd
            int randomit = rand.nextInt(20); // variable to use it.

            var tempint = 0;
            while (tempint < result) { // while loop to iterate and it connected with the result that gets the int from user
                System.out.println(name_list[randomit]);
                tempint++;

            }
        }
    }
}

// I could get random texts every time but if I get the same thing printed the number I put in.
// Maybe I should try putting my random method out of scope but I have tried putting it everywhere.