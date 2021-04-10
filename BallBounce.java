import java.awt.*;
import java.applet.*;
public class BallBounce extends Applet implements Runnable
{ 
	int stpx=200,stpy=200,x=100,y=100,i=0;
	Thread t;
	public void init()
 	{ 
		t=new Thread(this);
 		setBackground(Color.gray);
 		setForeground(Color.yellow); 
		setFont(new Font("Chiller",Font.BOLD,30));
 		t.start();
	} 
	public void run() 
	{ 
		try 
		{ 
			for(;;)
 			{ 
				if(stpy==200)
 					i=0; 
				repaint();
	 			Thread.sleep(20); 
				if(stpy==500) 
					i=1;
 			}  
		} 
		catch(Exception e)
		{ 
		}
 	} 
	public void paint(Graphics g)
 	{ 
		if(i==0)
 		{ 
			g.setColor(Color.cyan);
 			g.drawString("cyan",200,160);
 			g.fillOval(stpx,stpy,x,y); 
			stpy+=5; 
		} 
		if(i==1)
 		{ 
			g.setColor(Color.pink);
 			g.drawString("pink",225,650);
 			g.fillOval(stpx,stpy,x,y); 
			stpy-=5;
 		}
 	}
} 
/* <applet code=BallBounce width=600 height=700> 
</applet> */