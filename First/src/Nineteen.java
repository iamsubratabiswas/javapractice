class Students
{
    //variables should be private and method should be public
    //to binding data with method=>is called encapsulation=>only way to access data only with method

    private int roll;
    private String name;

    //Getters and Setters

    public void setRoll(int roll) {
        //also we can give here login codes here before accessing variables
        this.roll = roll;
        System.out.println("value of roll changed"); //maintain log file
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("user accessing value");
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }
}



public class Nineteen {
    public static void main(String[] args) {
        System.out.println("ENCAPSULATION,getter-setter");

        Students s1=new Students();
        s1.setRoll(2);
        System.out.println(s1.getRoll());
        s1.setName("Navin");
        System.out.println(s1.getName());
    }
}
