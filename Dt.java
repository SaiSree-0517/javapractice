class MyThread extends Thread  
{  
	public void run() 
 	{ 
 		System.out.println("childthread"); 
 	} 
} 
class Dt  
{ 
	public static void main(String args[]) 
 	{ 
 		System.out.println(Thread.currentThread().isDaemon()); 
		MyThread t=new MyThread(); 
		t.setDaemon(true); 
		t.start(); 
		System.out.println(t.isDaemon());  
	} 
} 