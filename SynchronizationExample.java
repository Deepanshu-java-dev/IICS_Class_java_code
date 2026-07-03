class Counter
{
	private int count=0;
	
	public synchronized void increment()
	{
		count++; // Increment the count
	}
	public int getCount()
	{
		return count;
	}
}
public class SynchronizationExample
{
	public static void main(String[] args) throws InterruptedException
	{
		Counter counter =new Counter();
		
		Thread t1=new Thread(()->{
			for(int i=0; i<1000; i++)
			{
				counter.increment();
				System.out.println("Thread is running.... "+Thread.currentThread().getName());
		System.out.println("count:"+counter.getCount());
				
			}
			});

		Thread t2=new Thread(()->{
			for(int i=0; i<1000; i++)
			{
				counter.increment();
				System.out.println("Thread is running.... "+Thread.currentThread().getName());
			System.out.println("count:"+counter.getCount());
			}

			});
			
			t1.start();
			t2.start();

			t1.join();  //wait for t1 to finish
		
			t2.join();   // wait for t2 to finish
		
		System.out.println("Final count:"+counter.getCount());
	}
}