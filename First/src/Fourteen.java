class Calculate
{
    public  int add(int ...i) //COMES AS ARRAY {10,20,10,20,30,20,10}
    {
       int sum=0;
       for(int k:i)
           sum+=k;
       return sum;
    }
}

public class Fourteen {
    public static void main(String[] args) {
        System.out.println("VARAGS(VARIABLE LENGTH ARGUMENT :=> int ...n => arguments comes to n as array)");

        Calculate obj= new Calculate();
        System.out.println(obj.add(10,20,10,20,30,20,10));

    }
}
