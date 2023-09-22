package Day_11_if_statements;

import java.util.Scanner;

public class ChooseLanguage {
    public static void main(String[] args) {
            /*
        ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French
        6 - Azerbaijan
        
        based on the number they picked print a message:
        
        1 : "hello, thanks for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        6 : "salam, zeng ettiginiz ucun mennatdariq"
        any other number: "We will use English by default"
     */
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose option below: \n\t 1 - English \n\t 2 - Spanish \n\t 3 - Turkish" +
                "\n\t 4 - Russian \n\t 5 - French \n\t 6 - Azerbaijan");
        System.out.print("Your choose: ");
        int userOption = input.nextInt();
        
        String massage = "";
        if (userOption == 1){
            massage = "hello, thanks for your call";
        } else if (userOption == 2) {
            massage = "hola, gracias para llamar";
        } else if (userOption == 3) {
            massage = "merhaba, aradiginiz icin tesekkurler";
        } else if (userOption == 4) {
            massage = "privet, spasibo za vash zvonok";
        } else if (userOption == 5) {
            massage = "Merci ,pour votre appel";
        } else if (userOption == 6) {
            massage = "salam, zeng ettiginiz ucun mennatdariq";
        } else {
            massage = "We will use English by default";
        }
        System.out.println(massage);
    }
}
