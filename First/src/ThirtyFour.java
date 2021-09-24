public class ThirtyFour {
    public static void main(String[] args) {
        System.out.println("EXCEPTION HANDLING=>Multiple catch block");
        try
        {
           int c[]=null;
           c[8]=0;
            int a[]=new int[6];
           a[6]=8;        //ArrayIndexOutOfBoundsException //so catch (ArithmeticException e) can't handle it
                          // so another catch block catch (ArrayIndexOutOfBoundsException e) to handle exception
           int i=7;
           int j=0;
           int k=i/j;      //ArithmeticException
            int b[]=null;
            b[5]=8;      //NullPointerException  if we don't know type of exception then what to do ?
                  //so it is better to write catch(Exception e) at LAST catch block which handle all type of Errors
                  //catch(Exception e) BEFORE any catch block will show error,
                  // because already handled errors no need another catch block further
            System.out.println("output is= "+k);
        }
//First way multiple different catch when want to print different messages  block works fine all java version
        catch (ArithmeticException e)
        {
            System.out.println("Error: First catch block");
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: 2nd catch block ");
        }

        catch (Exception e)
        {
            System.out.println("Something Wrong,But I am superman,I can handle all: 3rd catch block ");
        }

 //2nd way  ONE CATCH block multiple type of EXCEPTION by OR=> '|' symbol //But this will not work before java 1.7
        //same messages printed for all type of exception
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e)
//        {
//            System.out.println("Error:  catch block");
//        }

        finally
        {
            System.out.println("Bye");
        }


    }
}
