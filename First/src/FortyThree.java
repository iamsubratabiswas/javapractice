//code from FortyTwo.java
//How to set name to Threads ? Then we talk about priorities of Threads
//getName() method to get Name of Thread =>t1.getName() //By default name is Thread-0,Thread-1,....etc
//How to change name and Priority? ..
//setName() method  set the Name of Thread t1.setName("hi-Thread")
//Another way to give name =>new Thread(Runnable obj,"Name of Thread")   =>Thread t1=new Thread(obj1,"Hello-Thread")
// setPriority(1) OR setPriority(Thread.MIN_PRIORITY),setPriority(10) OR setPriority(MAX_PRIORITY)
// =>   t1.setPriority(1)
//getPriority() return the priority  =>t1.getPriority()
// Thread.currentThread().getPriority() return the priority of current thread

public class FortyThree {
    public static void main(String[] args) throws Exception
    {
        System.out.println("MultiThreading | Thread Priority  ");
        Thread t1=new Thread(()->
        {
            for (int i=0;i<10;i++)
            {
                try { Thread.sleep(1000); } catch (Exception e) {}
                System.out.println("Hi "+Thread.currentThread().getPriority());
                                           //Thread.currentThread().getPriority() return the priority of current thread
            }
        });
        Thread t2=new Thread(()->
        {
            for (int i=0;i<10;i++)
            {
                try { Thread.sleep(1000); } catch (Exception e) {}
                System.out.println("Hello "+Thread.currentThread().getPriority());
            }
        },"Thread-Hello");     //Another way to give name
                                                         // =>new Thread(Runnable obj,"Name of Thread")


        t1.setName("Thread-Hi");                    //set the Name of Thread  //It is better to give Thread name
                               // because without names sometimes it is very difficult to find what Thread is doing what
        System.out.println(t1.getName());     //print Name of Thread
        System.out.println(t2.getName());

        System.out.println(t1.getPriority());   //return the priority of Thread
        System.out.println(t2.getPriority());  //by default priority is 5 .Range is 1 to 10, 5 is normal priority

        t1.setPriority(Thread.MIN_PRIORITY);  //set Priority to 1  //lowest
        t2.setPriority(10);  //set priority to 10   //highest

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        try { Thread.sleep(10); } catch (Exception e) {}
        t2.start();
        System.out.println(t1.isAlive()); //print true
        t1.join();  //main Thread wait until t1 join t main Thread
        t2.join();
        System.out.println(t1.isAlive());  //return Thread status whether running og dead
        System.out.println("Bye");

    }
}