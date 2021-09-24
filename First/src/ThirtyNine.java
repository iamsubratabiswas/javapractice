//eg:Main Process= MS Word,sub processes=writing and spell checking =>sub processes called Threads
//Tread=Unit of a process
//Tree different application of thread
//Reason of using Threads=>1.Use complete power of multicore CPU by parallel processing/multithreading
// 2.Asynctask in Android =>browser not freeze instead main thread,child threads send the requests to the server
//3.Web application in java:  when multiple client send request to the server using servlet
// then server will create multiple same servlet by multiple different threads/multithreading
//In Gaming Threads are very important
//first line some words of exceptions are  =>Exception in thread "main" =>means "main" is a thread:every java code use Thread

//How to create thread ?            //problem:multiply each element of array {6,7,8,9,2} by 2 by this thread
/*
         Thread t1=new Thread();      //creating Thread t1 //Tread is inbuilt class

  //For main Thread
         Thread t1=new MyThread();              //creating Thread t1
         t1.run();                              //will call method and it is main thread
 //but parallelly if you want to start a new Tread you have to say .start()
  //because run() not create new Thread but start() will create a new Thread which will call a method run()
  //so you don't have to call run(),it will automatically call run
         class SubrataThread extends Tread       //creating class which inherit Tread //class should be a thread
                                                 //and put what i want to do with Thread t1
         {
              int[] a={6,7,8,9,2};
              public void run()
                 {
                     for(int i=0;i<5;i++)
                         {
                           a[i]=a[i]*2;
                         }
                 }
         }

 */
//Thread has multiple methods:
//sleep(3000)=>will wait Thread for 3 secods //sleep() is a static method
//wait(),notify() etc


//PROBLEM: when inheritance
//if i have already a class A { }, and my class SubrataThread want to extends A now ?????
//class SubrataThread extends A,Thread                 //not possible ,because java doesn't support multiple Inheritance
//that's Why we use an interface called Runnable so
//class SubrataThread extends A implements Runnable           ........is possible
//The advantage is Runnable has a method called Run()    //using which you can achieve same property of Thread

/*
class SubrataThread extends A implements Runnable
         {
           int[] a={6,7,8,9,2};
           public void run()
             {
              for(int i=0;i<5;i++)
                    {
                       a[i]=a[i]*2;
                    }
              }
        }
*/

import static java.lang.Thread.sleep;     //to use sleep() method

class Hi extends Thread   //now Hi is a Thread
{
//    public void say()
    public void run()   // changing method name to run() ,because start() always call run internally
    {
        for (int i=0;i<10;i++)
        {
            try { Thread.sleep(1000); } catch (Exception e) {}   //We need to handle because it is checked exception
            System.out.println("Hi");
        }
    }
}

class Hello extends Thread
{
//    public void say()
    public void run()
    {
        for (int i=0;i<10;i++)
        {
            try { Thread.sleep(1000); } catch (Exception e) {}
            System.out.println("Hello");
        }
    }
}


public class ThirtyNine {
    public static void main(String[] args) {   //by default "main" Thread
        System.out.println("MultiThreading in Java Theory:" +
                "\nPROBLEM:I want to say 'Hi' 10 times and 'Hello' 10 times");
        Hi obj1=new Hi();
        Hello obj2 =new Hello();
        obj1.start();   //whenever you call start() internally in thread "main" will always call a run() method
                        //so change the method name inside class Hi and Hello to run() instead say()
        try { Thread.sleep(10); } catch (Exception e) {}
        // adding little delay to prevent the treads to go scheduler at same time to prevent clash between threads
        obj2.start();
    }
}
