public class Fourth {
    public static void main(String[] args) {
        System.out.println("DECISSION: \nif\nswitch==char,int,byte=>because implicit conversion to int" +
                " (String greater or equal java 1.7)\nernary== codition? truest:falsest");
        int n=17;
        System.out.println("IF");
        if(n%2==0)
            System.out.println("EVEN");
        if(n%2!=0)
            System.out.println("ODD");
        if(true)
            System.out.println("true");
        if(false)
            System.out.println("false");

        System.out.println("IF-ELSE");
        if(n%2==0)
            System.out.println("even");
        else
            System.out.println("odd");


        System.out.println("ELSE IF");
        if(n==0)
            System.out.println("n is equal zero");
        else if(n!=0)
            System.out.println("n is not equal zero");
        else if(n%2==0)
            System.out.println("EVEN");
        else
            System.out.println("odD");

        System.out.println("TERNARY");
        int i=8;
        int j=0;
        //using if else
//        if(i>6)
//            j=1;
//        else
//            j=2;
        //using ternary
        j=i>6?1:2;
        System.out.println(j);

        System.out.println("SWITCH");
        int nn=8;
        switch (nn)
        {
            case 1:
                System.out.println("i am case 1");
                break;
            case 2:
                System.out.println("i am case 2");
                break;
            case 3:
                System.out.println("i am case 3");
                break;
            case 4:
                System.out.println("i am case 4");
                break;
            default:
                System.out.println("i am default case");

        }







    }
}
