import java.util.ArrayList;
import java.util.Scanner;

public class HANGINF_MAN {
public static void main(String[] args) {
    //Scanner for the input
    Scanner sc=new Scanner(System.in);
//word that is guessing
    String str1="hola";
    ArrayList<Character> words=new ArrayList<>();
    // a holder number to count and add
    int wrong = 0;
// for loop to add a _ depend the   size of the world
for (int i = 0 ; i<str1.length(); i++) {
    words.add('_');
}
// a welcome text for the game

    System.out.println("WELCOME TO THE GAME\n");

   while(wrong<7) {
       System.out.println(getthehanging(wrong));
       System.out.print("Word: ");
       // creating a loop to print the word using a handle loop
       for (char word : words) {
           System.out.print(word + " ");
       }
       System.out.println();
       // this si take the user input in the game seeing the input a single letter
       System.out.print("Guess the letter: ");
       char letter = sc.next().toLowerCase().charAt(0);

       //if statements to check if is in the word
       if (str1.indexOf(letter) >= 0) {
           System.out.println("Correct\n");
           for (int i = 0; i < str1.length(); i++) {
               if (str1.charAt(i) == letter) {
                   words.set(i, letter);
               }
           }
           if (!words.contains('_')) {
               System.out.println(getthehanging(wrong));
               System.out.println("YOU WIN");
               break;
           }
           // this is to check if the user guess the word
           // check and  add the number of guesing wrong
       } else {
           wrong++;
           System.out.println("Wrong");
       }
   }
   //checks if the the number of guessing are wrong and loos ehte game
   if(wrong>=7){
       System.out.println(getthehanging(wrong));
       System.out.println("YOU LOSE THE GAME");
       System.out.print("The correct word was "+str1);
   }

    sc.close();
}
// create a methods that make the hanging man
static String getthehanging(int numbersofguessing){
    return switch (numbersofguessing){
        case 0 -> """
                
                  """;
        case 1 -> """
                   o
                  """;
        case 2 -> """
                   o
                   |
                  """;
        case 3 -> """
                   o
                   |
                   |
                  """;
        case 4 -> """
                   o
                   |
                   |
                    \\
                  """;
        case 5 -> """
                   o
                   |
                   |
                  / \\
                  """;
        case 6 -> """
                   o
                  /|
                   |
                  / \\
                  """;
        case 7 -> """
                   o
                  /|\\
                   |
                  / \\
                  """;
        default -> "";
    };

}
}
