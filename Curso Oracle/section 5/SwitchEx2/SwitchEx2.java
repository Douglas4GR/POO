import java.util.Scanner;

public class SwitchEx2 {

    public static void main(String args[]) {
         char option = 'A';
        int aCount = 0, bCount = 0, cCount = 0;
        switch (option) {
            case 'A':
                aCount++;
                System.out.println("Count of A  " + aCount);
                break;
            case 'B':
                bCount++;
                System.out.println("Count of B  " + bCount);
                break;
            case 'C':
                cCount++;
                System.out.println("Count of B  " + cCount);
                break;
       
        }

    }
}


