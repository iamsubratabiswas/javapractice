import jdk.swing.interop.SwingInterOpUtils;

public class ThirtyThree {
    public static void main(String[] args) {
        System.out.println("EXCEPTION HANDING =>TRY CATCH FINALLY " +
                "\n1.Unchecked exception=>compiler not specifying that(eg:9/0 run time exception) ");

        try{   //inside try block code may throw exception ,if so then that is handled by catch block
            int i=10;
            int j=0;      //it throw ArithmeticException //after Exception control goes directly to catch block
                          //so below lines after Exception not executed if exception occurs
            int k=i/j;
            System.out.println("Output is = "+ k);  //IF exception occurs this line never be printed
//            System.out.println("I must print this"); //same code in the catch block to execute this code at any cost
                       // but it lead redundancy ,and redundancy is crime for good coder
                       //so instead writing this code two times put it inside finally block=>same work will be done
           }


        catch (ArithmeticException e){   //inside catch instead ArithmeticException we can use Exception also
                                         //because ArithmeticException extends RuntimeException and
                                         //RuntimeException extends Exception
            System.out.println("ERROR"); //print in black colour
            System.err.println("ERROR"); //print in Red colour and print at last of all statements
//            System.out.println("I must print this");
        }
        finally {
           System.out.println("i must print this");//instead writing same code in try catch both block simply write here
                                                   //it must be printed print after try catch end
        }

        System.out.println("Bye");
    }
}
