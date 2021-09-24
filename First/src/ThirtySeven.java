import com.subrata.SubrataException;  //we created SubrataException class inside com.subrata package

public class ThirtySeven {
    public static void main(String[] args) {
        System.out.println("Exception Handling => User Defined");
        int i=9;
        int j=9;

        try
        {
            int k=i/j;
            if(k==0)   //IF II DON'T WANT K VALUE AS ZER0 THEN I CAN THROW NEW EXCEPTION WHEN K=0
                throw new Exception();
            System.out.println(k);


  //WHAT IF I WANT THROW (user defined exception => SubrataException()) ?
   /*       if(k==1)
              throw new SubrataException();   //it will show error until define class SubrataException

        }
        catch (SubrataException e)
        {
            System.out.println("Subrata told that k=1 means Error "+e); //how to chang e from com.subrata.SubrataException ?
                                                       //by e.getMessage() below
        }
*/

        if(k==1)
            throw new SubrataException("\nThis is message ");  //pass message //message is String
                             // So in SubrataException class we need to make a constructor which can accept String as parameter

    }
        catch (SubrataException e)
    {
        System.out.println("Subrata told that k=1 means Error "+e.getMessage());  //e.getMessage() will print the messsage now
    }



        catch (Exception e)
        {
            System.out.println("Error");
        }


    }
}
