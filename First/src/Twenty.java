//int ,float,double
//instead classes we should use some class=>wrapper class
//Integer,Float,Double
//actually public final class Integer extends Number implements Comparable
//Integer methods=> MIN_VALUE,MAX_VALUE,toString(int i,int radix),static int parseInt(string s)
//primitive is faster than wrapper classes, so we should not use wrapper classes everywhere
// but java frameworks only works with wrapper classes,they don't supports primitive

public class Twenty {
    public static void main(String[] args) {
        System.out.println("WRAPPER CLASS/AUTO BOXING\n Character,Byte,Short,Integer,Long,Float,Double,Boolean");
        int i=10; //Primitive data type, Primitive concept is not acceptable oops=>everything soould be done through object
                  //above leads the concept of Wrapper class
        Integer ii= new Integer(10); //ii not primitive ==reference of class Integer , storing value in object
        Integer iii=new Integer(i); //primitive variable inside object called Boxing => in java it is called wrapping
                                    //boxing and wrapping both are same
        int j=iii.intValue(); //fetching the value to int j , this concept is Unboxig or Unwrapping

        Integer value=i; //AutoBoxing or AutoWrapping , backend =>Integer value=new Integer(i)
        int k=value;  //AutoUnboxing/AutoUnwrapping , backend=>int k=value.intValue();

        String str="123";
        int n=Integer.parseInt(str);  //convert to int ,by method of Integer class
        System.out.println(n);

    }
}
