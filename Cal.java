import java.awt.*; 
import java.awt.event.*; 
import java.applet.*; 
import javax.swing.*; 
/* <applet code="Cal" width=300 height=300> 
</applet>*/ 
public class Cal extends Applet implements ActionListener
{ 
	String msg=" "; 
	int v1,v2,result; 
	TextField t1; 
	Button b[]=new Button[10]; 
 	Button add,sub,mul,div,clear,mod,EQ; 
	char OP; 
	public void init()  
	{ 
 		setBackground(Color.cyan);
		Panel p1=new Panel(); 
		t1=new TextField(30); 
		Panel p2=new Panel(); 
		p2.setLayout(new GridLayout(4,4)); 
		for(int i=0;i<10;i++) 
		{ 
 
			b[i]=new Button(""+i); 
 
		} 
 
		add=new Button("+"); 
		sub=new Button("-"); 
		mul=new Button("*"); 
		div=new Button("/"); 
		clear=new Button("clear"); 
		EQ=new Button("="); 
		t1.addActionListener(this); 
		p1.add(t1);  
		for(int i=0;i<10;i++) 
 
		{ 
 
			p2.add(b[i]); 
 
		} 
 
		p2.add(add); 
 
		p2.add(sub); 
 
		p2.add(mul); 
 
		p2.add(div); 
		p2.add(clear); 
		p2.add(EQ); 
		add(p1);
		add(p2); 
		for(int i=0;i<10;i++) 
		{ 
 
			b[i].addActionListener(this); 
 
		} 
 
		add.addActionListener(this); 
		sub.addActionListener(this); 
		mul.addActionListener(this); 
		div.addActionListener(this); 
		clear.addActionListener(this); 
		EQ.addActionListener(this); 
	} 
 
	public void actionPerformed(ActionEvent ae) 
	{ 
 		String str=ae.getActionCommand(); 
		char ch=str.charAt(0); 
		if ( Character.isDigit(ch)) 
			t1.setText(t1.getText()+str); 
		else if(str.equals("+")) 
		{ 
			v1=Integer.parseInt(t1.getText()); 
			OP='+'; 
			t1.setText(""); 
		} 
 
		else if(str.equals("-")) 
		{ 
 
			v1=Integer.parseInt(t1.getText()); 
			OP='-'; 
			t1.setText(""); 
 
		} 
 
		else if(str.equals("*")) 
		{ 
 
			v1=Integer.parseInt(t1.getText()); 
			OP='*'; 
			t1.setText(""); 
 
		} 
 
		else if(str.equals("/"))
		{ 
 	
			v1=Integer.parseInt(t1.getText()); 
			OP='/'; 
			t1.setText(""); 	 
		} 
 
		if(str.equals("="))
		{ 
 
			v2=Integer.parseInt(t1.getText()); 
			if(OP=='+') 
				result=v1+v2;  
			else if(OP=='-') 
				result=v1-v2;  
			else if(OP=='*') 
				result=v1*v2;  
			else if(OP=='/') 
				result=v1/v2; 
 
			t1.setText(""+result); 
		} 
 
		if(str.equals("clear"))
		{ 
 
			t1.setText(""); 
 	
		} 
 
	} 
 
} 