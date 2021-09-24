class Student
{
    int roll;
    String name;
    float marks;
            public void getdetails(int r,String n,float m)
            {
                roll=r;
                name=n;
                marks=m;

            }

            public void show()
            {
                System.out.println("roll= "+roll+" "+"name= "+name+" "+"marks= "+marks);
            }

}



public class Twelve {
    public static void main(String[] args) {
        int[] nums = new int[4];
        int[] numss={1,2,3,4,6,7,8,9,10};
        for (int i=0;i< nums.length;i++)
        {
            nums[i]=i+2;
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        for (int i=0;i< numss.length;i++)
        {
            System.out.print(numss[i]+" ");
        }

        System.out.println();
        //array of objects

        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();

        Student[] ss={s1,s2,s3,s4};

        s1.getdetails(12,"akash",80);
        s2.getdetails(13,"bikash",86);
        s3.getdetails(14,"prakash",78);
        s4.getdetails(16,"Rakesh",89);
        for (int i=0;i< ss.length;i++)
        {
            ss[i].show();
        }



        //OR
        //create array of Student object NULL elements
        Student[] s=new Student[4];

        //create and initialize actual Student objects
        for(int i=0;i< s.length;i++) {
            s[i] = new Student();
        }
        s[0].getdetails(1,"A",10);
        s[1].getdetails(2,"B",9);
        s[2].getdetails(3,"C",8);
        s[3].getdetails(4,"D",10);

        for(int i=0;i< s.length;i++)
        {
            s[i].show();
        }




    }
}
