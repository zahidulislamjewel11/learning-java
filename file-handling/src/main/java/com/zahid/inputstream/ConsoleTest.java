package com.zahid.inputstream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        String line;

        do
        {
            line = reader.readLine();
            line = line.toUpperCase();
            System.out.println(line);
            
        } while (!"quit".equals(line));
    }
}

