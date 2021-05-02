import java.lang.*;
import java.util.*;

public class counter {

    public static void main(String[] args) {

        String text = "To be or not to be, that is the question;"

                +" Whether this nobler in the mind to suffer"

                +" the slings and arrows of outrageous fortune,"

                +" or to take arms against a sea of troubles,"

                +" and by opposing end them?";

        int spaces = 0, vowels = 0, letters = 0;

//YOUR CODE HERE
        System.out.println(text.length());

        for(int i=0;i<text.length();i++)
        {
           char ch=text.charAt(i);
           if(ch != ' ' && ch != ',' && ch != '?' && ch != ';')
           {
               letters++;
           }
           
            switch (ch) {
                case 'a' : vowels++;
                            break;
                case 'A' : vowels++;
                            break;
                case 'e' : vowels++;
                    break;
                case 'E' : vowels++;
                    break;
                case 'i' : vowels++;
                    break;
                case 'I' : vowels++;
                    break;
                case 'o' : vowels++;
                    break;
                case 'O' : vowels++;
                    break;
                case 'u' : vowels++;
                    break;
                case 'U' : vowels++;
                    break;
                case ' ' : spaces++;
                    break;
                default : break;


            }
        }

        System.out.println("The text contained vowels: " + vowels + "\n" + "consonants " + (letters - vowels) + "\n"+ "spaces: " + spaces + "\n" +
                                "Letters: " + letters );
    }

}
