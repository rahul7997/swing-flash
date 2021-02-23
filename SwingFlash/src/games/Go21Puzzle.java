package games;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Go21Puzzle extends Thread
{
JFrame f;
JButton b1,b2,b3,b4;
JLabel l1,l2,l3,l4;
JTextField tf1,tf2,tf3;
JPanel jp;
Scanner sc=new Scanner(System.in);
int fv=0;

String str2="";
String str1="";

int f(int t)
{
int ret=141;
if(t%4==1)
{
int b[]=new int[3];
for(int i=0;i<3;i++)
{
t++;
b[i]=t;
String st2=String.valueOf(b[i]);
str2=str2+" "+st2;
if(fv<=20)
{
tf2.setText(str2);
}
}
   ret=b[b.length-1];
}
else if(t%4==2)
{
int b[]=new int[2];
for(int i=0;i<2;i++)
{
t++;
b[i]=t;
String st2=String.valueOf(b[i]);
str2=str2+" "+st2;
if(fv<=20)
{
tf2.setText(str2);
}
}  
 ret=b[b.length-1];
}
else if(t%4==3)
{
int b[]=new int[1];
for(int i=0;i<1;i++)
{
t++;
b[i]=t;
String st2=String.valueOf(b[i]);
str2=str2+" "+st2;
if(fv<=20)
{
tf2.setText(str2);
} 
}   ret=b[b.length-1];
}
return ret;
}




void code()
{
	System.out.println(Thread.currentThread().getName());
	
f=new JFrame("Go_21 Puzzle");
f.setSize(800,500);
f.setVisible(true);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
jp=new JPanel();
jp.setSize(800,500);
jp.setBackground(Color.GREEN);
jp.setLayout(null);
f.add(jp);

tf1=new JTextField();
tf1.setBounds(200,100,400,50);
jp.add(tf1);
tf2=new JTextField();
tf2.setBounds(200,250,400,50);
jp.add(tf2);
tf3=new JTextField();
tf3.setBounds(50,370,700,40);
jp.add(tf3);

l1=new JLabel("Player 1: ");
l1.setBounds(100,100,400,50);
jp.add(l1);
l2=new JLabel("Player 2: ");
l2.setBounds(100,250,400,50);
jp.add(l2);
l3=new JLabel("Comments:");
l3.setBounds(75,350,100,20);
jp.add(l3);
l4=new JLabel("Select your numbers: ");
l4.setBounds(200,25,150,60);
jp.add(l4);

b1=new JButton("C");
b1.setBounds(350,25,60,60);
jp.add(b1);
b2=new JButton("GO");
b2.setBounds(350,175,60,60);
jp.add(b2);
b3=new JButton("Exit");
b3.setBounds(600,420,100,30);
jp.add(b3);
b4=new JButton("Play again");
b4.setBounds(480,420,100,30);
jp.add(b4);

b1.addActionListener(new Sensor());
b2.addActionListener(new Sensor());
b3.addActionListener(new Sensor());
b4.addActionListener(new Sensor());
}


int n=0;
class Sensor implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
n++;
if(n>=3)
{ n=3; }
String s3=String.valueOf(n);
tf3.setText(s3);
}

if(e.getSource()==b2)
{
int a[]=new int[n];
for(int i=0;i<n;i++)
{
fv++;
a[i]=fv;
if(fv<=21)
{
String st=String.valueOf(a[i]);
str1=str1+" "+st;
tf1.setText(str1);
}
}
fv=f(fv);

if(fv>=21)
{
tf3.setText("Player 1 lost.");
}
n=0;
}

if(e.getSource()==b3)
{
System.exit(0);
}

if(e.getSource()==b4)
{
fv=0;
str1="";
str2="";
tf1.setText("");
tf2.setText("");
tf3.setText("");
}

}
}

public void run()
{
	Go21Puzzle g2=new Go21Puzzle();
	g2.code();
}
}

