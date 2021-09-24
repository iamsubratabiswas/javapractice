package thirtytwocom.subrata;

import thirtytwocom.subrata.test.Student1;

public class Engineer extends Student1 {
    public void show()
    {
        marks=77;   //protected is accessible by subclass outside package also
//        age=40;    //default is package private not accessible outside package although subclass
    }

}
