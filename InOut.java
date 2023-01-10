import java.util.Scanner;

class InOut {
  public InOut(){
    System.out.println("Hello world!");// good old hello world
    String word;// you have to be verbose with variable data type
    word = "Hello";
    System.out.print("This doesn't make a new line auto magically " + word + "  ");// doesn't automatically make a new
                                                                                   // line
    int eight = 8;
    System.out.println("I like " + eight + " it is nice");
    // ten = 10;//don't believe get rid of the first comment tag see what happens
    Scanner input = new Scanner(System.in);
    System.out.println("Give me a number baby: ");
    int option;
    option = input.nextInt();
    System.out.println("I have no clue why you liked " + option);
  }
}