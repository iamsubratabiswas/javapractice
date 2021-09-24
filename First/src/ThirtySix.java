import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThirtySix
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Exception Handling =>Try with Resource");
        int n=0;
        System.out.println("Enter a number");
//        BufferedReader br=null;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
  //          br = new BufferedReader(new InputStreamReader(System.in));  //this object go inside try() argument
                                                                         //so comment this line and remove finally block
            n=Integer.parseInt(br.readLine());
        }

//        catch (Exception e)              //If we remove catch or finally separately it will not work
//                                         // but if we remove both catch and finally it will show error
//                                         //so we can remove catch block because our aim is not to handle the error,
//                                         // our aim is to close() the resource in finally block
// from java 1.7 it is not compulsory to write finally block ,we can define it's object inside try block
// then try automatically closed the resource when it is closed ,so remove finally block also
//        {
//            System.out.println("ERROR TYPE IS " + e);
//        }

//        finally                         //no need to close object //because try already closed
//        {
//            br.close(); //it is our responsibility to close the BufferedReader
//            System.out.println("RESOURCE SUCCESSFULLY CLOSED");
//        }

        System.out.println(n);
    }
}
