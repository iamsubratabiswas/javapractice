//My intention is to reduce lines of codes of code Forty.java by using Lambda Expression to make code more efficient
//using less number of classes //Runnable is functional interface it has only one method run()
// because only purpose of Hi2 and Hello2 is to implement Runnable ,and using the class only once then why to use class ?
//STEP1=>MAKE IT ANONYMOUS, CLASS STEP2:as inside anonymous class there is only one method:so use Lambda Expression
//Step3:As we are using obj1 and obj2 once ,so we can cut RHS and put it inside Thread at place of obj1 and obj2
public class FortyOne {
    public static void main(String[] args) {
        System.out.println("MultiThreading | Lambda Expression ");
/*
        Runnable obj1=()->
            {
                for (int i=0;i<10;i++)
                {
                    try { Thread.sleep(1000); } catch (Exception e) {}
                    System.out.println("Hi");
                }
            };
        Runnable obj2 =()->
            {
                for (int i=0;i<10;i++)
                {
                    try { Thread.sleep(1000); } catch (Exception e) {}
                    System.out.println("Hello");
                }
            };

 */

//        Thread t1=new Thread(obj1);
//        Thread t2=new Thread(obj2);
//As we are using obj1 and obj2 once ,so we can cut RHS and put it inside Thread() at place of obj1 and obj2 below
        Thread t1=new Thread(()->
        {
            for (int i=0;i<10;i++)
            {
                try { Thread.sleep(1000); } catch (Exception e) {}
                System.out.println("Hi");
            }
        });
        Thread t2=new Thread(()->
        {
            for (int i=0;i<10;i++)
            {
                try { Thread.sleep(1000); } catch (Exception e) {}
                System.out.println("Hello");
            }
        });

        t1.start();
        try { Thread.sleep(10); } catch (Exception e) {}
        t2.start();

    }
}

