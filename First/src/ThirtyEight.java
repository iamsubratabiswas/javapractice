//Scanner class methods=>nextInt(),nextLong(),nextDouble(),nextLine(),nextBigInteger() etc


import java.util.Scanner;

public class ThirtyEight
{
    public static void main(String[] args)
    {
        System.out.println("User Input Using Scanner");
        int n=0;
        System.out.println("Enter a number");
        Scanner sc =new Scanner(System.in);   //sc=object of scanner class and we passed a object System.in Scanner()
                                              //System.in=input from keyboard
        n=sc.nextInt();  //nextInt() is a method of Scanner class which fetch the integer value
                         //advantage of Scanner class:you don't have to handle the exception and
                                              // you don't have to convert String to Integer compared to BufferedReader
        System.out.println(n);
    }
}
