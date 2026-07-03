class ThreadTest extends Thread
{
	public void run()
	{
		System.out.println("Thread is running.... "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());

	}
}

class ThreadDemo
{
	public static void main(String []args)
	{
		ThreadTest t=new ThreadTest();
		t.start();
	}
}