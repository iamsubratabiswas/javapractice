import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirtyFive {
public static void main(String[] args) throws Exception   //checked exception=>compiler knows that exception
                                                              // ,compile time error
            //only RuntimeException subclasses are unchecked , IOException are not Runtime so  it is checked
            //Two ways of handling Exception 1.try catch 2.throws
            //it is compulsory to handle checked exception
    {

   //using throws

        System.out.println("EXCEPTION HANDLING =>2.Checked Exception | Finally Block");
        System.out.println("Enter a number");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                   //when we use  BufferedReader it is always good to handle Exception by throw or by try catch
        int n=Integer.parseInt(br.readLine()); //45
                        // br.readline() may give an exception when asking input string but user not give proper input
                         //so throws Exception at beginning of main otherwise it will show error
        System.out.println(n);
    /*

  //By using try catch below
        int n=0;
        System.out.println("Enter a number");
        BufferedReader br=null;
        try
        {
            br = new BufferedReader(new InputStreamReader(System.in));
    //here br is resources :any classes which comes with help of IO is resources   //so we have to close it  br.close()
    //otherwise it occupies the memory
            n=Integer.parseInt(br.readLine()); //if you got exception here control will not go below
    //            br.close();  // instead using it both block we can use it in finally block
        }

        catch (Exception e)
        {
            System.out.println("ERROR TYPE IS " + e);
        }

        finally
        {
            br.close(); //it is our responsibility to close the BufferedReader
        }

        System.out.println(n);
*/

    }

}
