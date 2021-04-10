class Q 
{ 
	int n; 
	boolean valueSet=false; 
	synchronized void get() 
	{ 
		if(valueSet==false) 
			try
			{ 
				wait(); 
			} 
			catch(InterruptedException e)
			{
 				System.out.println("InterruptedException caught");
			} 
			System.out.print("got:"+n+"\t");
 			valueSet=false; 
			notify(); 
	} 
	synchronized void put(int n) 
	{
 		if(valueSet==true) 
			try
			{ 
				wait(); 
			} 
			catch(InterruptedException e)
			{ 
				System.out.println("InterruptedException caught"); 
			} 
			this.n=n; 
			valueSet=true;  
			System.out.print("put:"+n+"\t"); 
			notify(); 
	} 
} 
class Producer extends Thread 
{ 
	Q q;
 	Producer(Q q)
 	{
 		this.q=q; 
	} 
	public void run() 
	{
 		int i=0; 
		while(true)
		{ 
			q.put(++i);
 		} 
	} 
} 
class Consumer extends Thread 
{ 
	Q q; 
	Consumer(Q q) 
	{ 
		this.q=q;
 	} 
	public void run() 
	{ 
		while(true) 
		{
 			q.get(); 
		} 
	} 
} 
class Pcfixed 
{ 
	public static void main(String args[]) 
	{
 		Q q=new Q();
 		Producer p=new Producer(q);
 		Consumer c=new Consumer(q);
 		p.start();
 		c.start();
 		System.out.println("press control-c to stop");
 	}  
} 