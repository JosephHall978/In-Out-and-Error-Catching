/*I may seem simple but I can do a lot of shite so I will just give the basic idea of the format. There is more here: https://www.learnjavacoding.com/definitions/print-options-java/#:~:text=The%20three%20different%20print%20options%20in%20the%20class,PrintStream%20are%3A%201%20print%202%20println%203%20printf

Specifier	Type
%c	character
%d	integer
%f	floating-point number
%s	a string of characters
%%	print a percent sign
%e	exponential floating-point number

You also have all these

Special character prints
\b	backspace
\f	form feed
\n	newline, or linefeed
\r	carriage return
\t	tab
\\	backslash
*/
class PrintF{
  public char charExample;
  public int integerExample;
  public float floatExample;
  public String strExample;
  public double dbExample;
  
  public PrintF(){
    charExample = 'J';
    integerExample = 8;
    floatExample = 4.5f;
    strExample = "Hello World";
    dbExample = 5.6;
    demo();
  }
  private void demo(){
    System.out.println("just normal %s");
    System.out.printf("First character of my name %c \n", charExample);
    System.out.printf("Random integer I liked %d \n", integerExample);
    System.out.printf("Random float %f \n", floatExample);
    System.out.printf("String example %s\n", strExample);
    System.out.printf("Double example %f\n", dbExample);
    //On to the special characters yay
    System.out.println("Backspace \b looks like this");//\b	backspace
    System.out.println("Form feed \f looks like this");//\f	form feed
    System.out.println("New line you have seen looks like this \n");//\n	newline, or linefeed
    System.out.println("Carriage return \r looks like this");//\r	carriage return
    System.out.println("Tab \t looks like this");//\t	tab
    System.out.println("Oh and to type a backslash, quote, or double quote you need to do \\, \', \"");//\\	backslash
  }
}