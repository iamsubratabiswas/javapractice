//I want to restrict on Object type //To make type safe we use Generics: <> //Introduced in java 1.55

import java.util.ArrayList;
import java.util.List;

public class FortyEight {
    public static void main(String[] args) {
        System.out.println("Collection and Generics | Generics with List ");
        List<Integer> values=new ArrayList<>();
        values.add(4);
    //    values.add("Subrata");   //Error-after using Generics Integer
        values.add(9);
        values.add(6);
        values.add(2,3);
    }
}
