package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter number");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        int i = Integer.parseInt(br.readLine());

        System.out.println(i);
    }
}
