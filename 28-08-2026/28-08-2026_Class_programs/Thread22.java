package day2808;

class Counter
{
    int count;
    void increment() // thread safe
    {
        count++;
    }
}
class Task implements Runnable
{
    Counter counter;
    Task(Counter counter)
    {
        this.counter=counter;
    }
    
    public void run()
    {
        for(int i=0;i<100000;i++)
        {
            counter.increment();
        }
    }
}
public class Thread22
{
	public static void main(String[] args) throws InterruptedException
	{
		Counter counter = new Counter();
		Task task1 = new Task(counter);
		Task task2 = new Task(counter);
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Final Count : "+counter.count);
	}
}