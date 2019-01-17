import java.util.Scanner;
public class caladd{

public static void main(String args[]) {
    float a, b, res;
    char choice, ch;
    Scanner scan = new Scanner(System.in);
    do{
       
       System.out.print("1. ADD TWO NUMBERS\n");
       System.out.println("2. SUBTRACT TWO NUMBERS\n");
       System.out.print("2. EXIT\n\n");
       System.out.print("Enter your choice : ");
       choice = scan.next().charAt(0);
       switch(choice){
          case '1': System.out.print("Enter Two Numbers\n");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a+b;
                    System.out.print("Result = "+res);
                    break;
          case '2': System.out.print("Enter Two Numbers\n");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    res = a-b;
                    System.out.print("Result = "+res);
                    break;   
          
          case '3': System.exit(0);
                    break;

          default : System.out.print("Invalid Choice !!!");
                    break;

        }
        

        System.out.println("\n------------------------------------------\n");
      }while(choice!=2);
}
}
