//below code: for count,if Threads come different times: t1 fetch x,make it x+1,then t2 come ,fetch x+1 and make it x+2
// but sometimes t1,t2  come to Scheduler at same time to increment() value,so they fetched same value
//But that time lets count=10,then t1,t2 both fetch the value 10 and make it 11,
// so after Threads running 2000 times count may not be exact 2000 because of thread overlap
//so to prevent overlap we use synchronized keyword with increment() method
// so that at a time at most one Thread can work with that method and another has to wait

class Counter
{
    int count;
    public synchronized void increment()  //synchronized so that at a time only one thread can work with it
                                          //so now it is Thread safe
    {
        count++;
    }
}

public class FortyFour
{
    public static void main(String[] args) throws Exception {
        System.out.println("MultiThreading |Synchronized Keyword");
        Counter c=new Counter();
        Thread t1=new Thread(new Runnable() {                      //Anonymous class First Thread
            @Override
            public void run() {
                for (int i = 1; i <=1000 ; i++)
                {
                    c.increment();    //calling increment() method of Counter by its object c
                }
            }
        });

        Thread t2=new Thread(new Runnable() {                      //Anonymous class First Thread
            @Override
            public void run() {
                for (int i = 1; i <=1000 ; i++)
                {
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        System.out.println("count = "+c.count); //print simultaneously by main Thread //0
        t1.join();    //checked Exception Need to Handle
        t2.join();
        System.out.println("count = "+c.count); //print after child Thread complete the job and join to the main Thread
     //for count t1 fetch x,make it x+1,then t2 come ,fetch x+1 and make it x+2
     // but t1,t2 sometimes come to Scheduler at same time to increment() value,so they fetched same value
     //But that time lets count=10,then t1,t2 both fetch the value 10 and make it 11,
        // so after Threads running 2000 times count may not be exact 2000 because of thread overlap
        //so to prevent overlap we use synchronized keyword with increment() method
        // so that at a time at most one Thread can work with that method and another has to wait


    }
}
