
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Go21Puzzle extends Thread
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

/*______________________________________*/


class PixelPuzzle extends Thread implements ActionListener
{
JFrame f;
JButton b[]=new JButton[9];
JButton play;
JTextField tf1;
JLabel l1;
JPanel p;
int cp=0;
char as='A';
String s="";

void code() 
{
f=new JFrame("Zig Zag Puzzle");
f.setSize(600,600);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
f.setLayout(null);
f.setBackground(Color.RED);
Container content=f.getContentPane();
content.setBackground(Color.CYAN);

p=new JPanel();
p.setSize(600,600);
p.setBackground(Color.GREEN);
p.setLayout(null);
f.add(p);

int a=0;
int y=100;
for(int j=0;j<3;j++)
{
int x=100;
for(int i=0;i<3;i++)
{
b[a]=new JButton("");
b[a].setBounds(x,y,100,100);
p.add(b[a]);
x=x+100;
a++;
}
y=y+100;
}

play=new JButton("Play again");
play.setBounds(200,490,100,35);
p.add(play);
play.addActionListener(ae->
{
for(int i=0;i<8;i++)
{
l1.setText("");
b[i].setText(String.valueOf((char)(i+65)));
}
b[8].setText("");

b[0].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\0.png"));
b[1].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\1.png"));
b[2].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\2.png"));
b[3].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\3.png"));
b[4].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\4.png"));
b[5].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\5.png"));
b[6].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\6.png"));
b[7].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\7.png"));
b[8].setIcon(new ImageIcon());

}
);

tf1=new JTextField();
tf1.setBounds(500,300,60,50);
//p.add(tf1);

l1=new JLabel();
l1.setBounds(220,30,100,40);
p.add(l1);

for(int i=0;i<9;i++)
{
b[i].setText(String.valueOf(as));
b[i].addActionListener(this);
as++;
b[i].setBackground(Color.GREEN);
}
b[8].setText("");


b[0].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\0.png"));
b[1].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\1.png"));
b[2].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\2.png"));
b[3].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\3.png"));
b[4].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\4.png"));
b[5].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\5.png"));
b[6].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\6.png"));
b[7].setIcon(new ImageIcon("E:\\Java\\menuswingp\\menu\\images\\7.png"));

}  /*  method T() closed    */


public void actionPerformed(ActionEvent e)
{
	for(int i=0;i<9;i++)
	{
		if(e.getSource()==b[i])
		{
			if(b[i].getText()!="")
			{
			cp=i;
			}
		}
	}
	fun();
}


void fun()
{
if(cp==0 && b[1].getText()=="")
{
b[1].setText(b[0].getText());
b[0].setText("");

Icon ic=b[0].getIcon();
ImageIcon imicon=(ImageIcon)ic;
Image img=imicon.getImage();
b[1].setIcon(new ImageIcon(img));
b[0].setIcon(new ImageIcon());
won();
}

if(cp==0 && b[3].getText()=="")
{
b[3].setText(b[0].getText());
b[0].setText("");

Icon ic=b[0].getIcon();
ImageIcon imicon=(ImageIcon)ic;
Image img=imicon.getImage();
b[3].setIcon(new ImageIcon(img));
b[0].setIcon(new ImageIcon());
won();
}

if(cp==1 && b[0].getText()=="")
{
b[0].setText(b[1].getText());
b[1].setText("");

Icon ic=b[1].getIcon();
ImageIcon imicon=(ImageIcon)ic;
Image img=imicon.getImage();
b[0].setIcon(new ImageIcon(img));
b[1].setIcon(new ImageIcon());
won();
}

if(cp==1 && b[2].getText()=="")
{
b[2].setText(b[1].getText());
b[1].setText("");

Icon ic=b[1].getIcon();
ImageIcon imicon=(ImageIcon)ic;
Image img=imicon.getImage();
b[2].setIcon(new ImageIcon(img));
b[1].setIcon(new ImageIcon());
won();
}

if(cp==1 && b[4].getText()=="")
{
b[4].setText(b[1].getText());
b[1].setText("");

Icon ic=b[1].getIcon();
ImageIcon imicon=(ImageIcon)ic;
Image img=imicon.getImage();
b[4].setIcon(new ImageIcon(img));
b[1].setIcon(new ImageIcon());
won();
}

if(cp==2 && b[1].getText()=="")
{
b[1].setText(b[2].getText());
b[2].setText("");

Icon ic=b[2].getIcon();
ImageIcon imicon=(ImageIcon)ic;
Image img=imicon.getImage();
b[1].setIcon(new ImageIcon(img));
b[2].setIcon(new ImageIcon());
won();
}

if(cp==2 && b[5].getText()=="")
{
b[5].setText(b[2].getText());
b[2].setText("");

Icon ic=b[2].getIcon();
ImageIcon imi=(ImageIcon)ic;
Image img=imi.getImage();
b[5].setIcon(new ImageIcon(img));
b[2].setIcon(new ImageIcon());
won();
}

if(cp==3 && b[0].getText()=="")
{
b[0].setText(b[3].getText());
b[3].setText("");

Icon ic=b[3].getIcon();
ImageIcon is=(ImageIcon)ic;
Image img=is.getImage();
b[0].setIcon(new ImageIcon(img));
b[3].setIcon(new ImageIcon());
won();
}

if(cp==3 && b[4].getText()=="")
{
b[4].setText(b[3].getText());
b[3].setText("");

Icon ic=b[3].getIcon();
ImageIcon imicon=(ImageIcon)ic;
Image img=imicon.getImage();
b[4].setIcon(new ImageIcon(img));
b[3].setIcon(new ImageIcon());
won();
}

if(cp==3 && b[6].getText()=="")
{
b[6].setText(b[3].getText());
b[3].setText("");

Icon ic=b[3].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[6].setIcon(new ImageIcon(img));
b[3].setIcon(new ImageIcon());
won();
}

if(cp==4 && b[1].getText()=="")
{
b[1].setText(b[4].getText());
b[4].setText("");

Icon ic=b[4].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[1].setIcon(new ImageIcon(img));
b[4].setIcon(new ImageIcon());
won();
}

if(cp==4 && b[3].getText()=="")
{
b[3].setText(b[4].getText());
b[4].setText("");

Icon ic=b[4].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[3].setIcon(new ImageIcon(img));
b[4].setIcon(new ImageIcon());
won();
}

if(cp==4 && b[5].getText()=="")
{
b[5].setText(b[4].getText());
b[4].setText("");

Icon ic=b[4].getIcon();
ImageIcon imicon=(ImageIcon)ic;
Image img=imicon.getImage();
b[5].setIcon(new ImageIcon(img));
b[4].setIcon(new ImageIcon());
won();
}

if(cp==4 && b[7].getText()=="")
{
b[7].setText(b[4].getText());
b[4].setText("");

Icon ic=b[4].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[7].setIcon(new ImageIcon(img));
b[4].setIcon(new ImageIcon());
won();
}

if(cp==5 && b[2].getText()=="")
{
b[2].setText(b[5].getText());
b[5].setText("");

Icon ic=b[5].getIcon();
ImageIcon imicon=(ImageIcon)ic;
Image img=imicon.getImage();
b[2].setIcon(new ImageIcon(img));
b[5].setIcon(new ImageIcon());
won();
}

if(cp==5 && b[4].getText()=="")
{
b[4].setText(b[5].getText());
b[5].setText("");

Icon ic=b[5].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[4].setIcon(new ImageIcon(img));
b[5].setIcon(new ImageIcon());
won();
}

if(cp==5 && b[8].getText()=="")
{
b[8].setText(b[5].getText());
b[5].setText("");

Icon ic=b[5].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[8].setIcon(new ImageIcon(img));
b[5].setIcon(new ImageIcon());
won();
}

if(cp==6 && b[3].getText()=="")
{
b[3].setText(b[6].getText());
b[6].setText("");

Icon ic=b[6].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[3].setIcon(new ImageIcon(img));
b[6].setIcon(new ImageIcon());
won();
}
if(cp==6 && b[7].getText()=="")
{
b[7].setText(b[6].getText());
b[6].setText("");
Icon ic=b[6].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[7].setIcon(new ImageIcon(img));
b[6].setIcon(new ImageIcon());
won();
}

if(cp==7 && b[4].getText()=="")
{
b[4].setText(b[7].getText());
b[7].setText("");

Icon ic=b[7].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[4].setIcon(new ImageIcon(img));
b[7].setIcon(new ImageIcon());
won();
}

if(cp==7 && b[6].getText()=="")
{
b[6].setText(b[7].getText());
b[7].setText("");

Icon ic=b[7].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[6].setIcon(new ImageIcon(img));
b[7].setIcon(new ImageIcon());
won();
}

if(cp==7 && b[8].getText()=="")
{
b[8].setText(b[7].getText());
b[7].setText("");

Icon ic=b[7].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[8].setIcon(new ImageIcon(img));
b[7].setIcon(new ImageIcon());
won();
}

if(cp==8 && b[5].getText()=="")
{
b[5].setText(b[8].getText());
b[8].setText("");

Icon ic=b[8].getIcon();
ImageIcon ig=(ImageIcon)ic;
Image img=ig.getImage();
b[5].setIcon(new ImageIcon(img));
b[8].setIcon(new ImageIcon());
won();
}

if(cp==8 && b[7].getText()=="")
{
b[7].setText(b[8].getText());
b[8].setText("");

Icon ic=b[8].getIcon();
ImageIcon imicon=(ImageIcon)ic;
Image img=imicon.getImage();
b[7].setIcon(new ImageIcon(img));
b[8].setIcon(new ImageIcon());
won();
}

}


void won()
{
int count=0;
for(int i=0;i<8;i++)
{
	System.out.print("  "+String.valueOf((char)(i+65)));
	System.out.print("  "+b[i].getText());
	if(b[i].getText()==String.valueOf((char)(i+65)))
	{	count++;	}
}
System.out.println(count);
if(count==8)
{
l1.setText("You Won");
}
}


public void run()
{
	PixelPuzzle pp=new PixelPuzzle();
	pp.code();
}
}
/*______________________________________________*/

class TicTacToe extends Thread implements ActionListener
{
JFrame f;
JButton b[]=new JButton[9];
JButton play;
JTextField tf1;
JLabel l1;
JPanel p;
int cp=0;
String s="";

void code() 
{
f=new JFrame("Tic Tac Toe");
f.setSize(600,600);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
f.setLayout(null);
f.setBackground(Color.GREEN);

p=new JPanel();
p.setSize(600,600);
p.setBackground(Color.GREEN);
p.setLayout(null);
f.add(p);

int a=0;
int y=100;
for(int j=0;j<3;j++)
{
int x=100;
for(int i=0;i<3;i++)
{
b[a]=new JButton("");
b[a].setBounds(x,y,100,100);
p.add(b[a]);
x=x+100;
a++;
}
y=y+100;
}

play=new JButton("Play again");
play.setBounds(200,490,100,35);
p.add(play);
play.addActionListener(ae->
{
for(int i=0;i<8;i++)
{
l1.setText("");
b[i].setText("");
b[i].setForeground(Color.BLACK);
}
b[8].setForeground(Color.BLACK);
}
);

tf1=new JTextField();
tf1.setBounds(500,300,60,50);
//f.add(tf1);

l1=new JLabel();
l1.setBounds(220,30,100,40);
p.add(l1);

b[8].setText("X");

for(int i=0;i<9;i++)
{
b[i].addActionListener(this);
}



}  /*  method T() closed    */


void fun() throws Ex
{
if(b[4].getText()=="" && (cp==5 || cp==2 || cp==1) && b[6].getText()=="" && b[7].getText()=="" && b[3].getText()=="" && b[0].getText()=="" )
{
b[6].setText("X");
s=s+"s11";
tf1.setText(s);
lost();
}
if(cp==7 && b[6].getText()=="X" && b[0].getText()=="" )
{
b[0].setText("X");
s=s+"s12";
tf1.setText(s);
lost();
}
if(b[5].getText()=="O")
	{
	if(cp!=7 && cp!=5 && b[6].getText()=="X" && (b[0].getText()=="" || b[0].getText()=="O") && b[7].getText()=="")
	{
	b[7].setText("X");
s=s+"s13";
tf1.setText(s);
lost();
throw new Ex();
	}
	}
if(b[2].getText()=="O")
	{
	if(cp!=7 && cp!=2 && b[6].getText()=="X" && b[0].getText()=="" && b[7].getText()=="")
	{
	b[7].setText("X");
s=s+"s14";
tf1.setText(s);
lost();
	}
	}
if(b[1].getText()=="O")
	{
	if(cp!=7 && cp!=1 && b[6].getText()=="X" && b[7].getText()=="")
	{
	b[7].setText("X");
s=s+"s15";
tf1.setText(s);
lost();
	}
	}
if(b[2].getText()=="O")
	{
	if(cp==0 && b[6].getText()=="X" && b[7].getText()=="")
	{
	b[7].setText("X");
s=s+"s36";
tf1.setText(s);
lost();
	}
	}

if(cp==4 && b[6].getText()=="X" && b[0].getText()=="X" && b[3].getText()=="" && (b[5].getText()=="O" || b[2].getText()=="O" || b[1].getText()=="O") && b[7].getText()=="O" )
{
b[3].setText("X");
s=s+"s16";
tf1.setText(s);
lost();
}
if(cp==3 && b[6].getText()=="X" && b[0].getText()=="X" && b[4].getText()=="" && (b[5].getText()=="O" || b[2].getText()=="O" || b[1].getText()=="O") && b[7].getText()=="O" )
{
b[4].setText("X");
s=s+"s17";
tf1.setText(s);
lost();
}


if(b[4].getText()=="" && (cp==7 || cp==6 || cp==3) && b[2].getText()=="" && b[5].getText()=="" && b[1].getText()=="" && b[0].getText()=="" )
{
b[2].setText("X");
s=s+"s18";
tf1.setText(s);
lost();
}
if(cp==5 && b[2].getText()=="X" && b[0].getText()=="" )
{
b[0].setText("X");
s=s+"s19";
tf1.setText(s);
lost();
}
if(b[7].getText()=="O")
	{
	if(cp!=5 && cp!=7 && b[2].getText()=="X" && b[5].getText()=="" )
	{
	b[5].setText("X");
s=s+"s20";
tf1.setText(s);
lost();
	}
	}
if(b[6].getText()=="O")
	{
	if(cp!=5 && cp!=6 && b[2].getText()=="X" &&b[0].getText()=="" && b[5].getText()=="" )
	{
	b[5].setText("X");
s=s+"s21";
tf1.setText(s);
lost();
	}
	}
if(b[3].getText()=="O")
	{
	if(cp!=5 && cp!=3 && b[2].getText()=="X" && b[5].getText()=="" )
	{
	b[5].setText("X");
s=s+"s22";
tf1.setText(s);
lost();
	}
	}
if(b[6].getText()=="O")
	{
	if(cp==0 && b[2].getText()=="X" && b[5].getText()=="")
	{
	b[5].setText("X");
s=s+"s37";
tf1.setText(s);
lost();
	}
	}
if(cp==4 && b[2].getText()=="X" && b[5].getText()=="O" && b[0].getText()=="X" && b[1].getText()=="" && (b[7].getText()=="O" || b[6].getText()=="O" || b[3].getText()=="O" ) )
{
b[1].setText("X");
s=s+"s23";
tf1.setText(s);
lost();
}
if(cp==1 && b[2].getText()=="X" && b[5].getText()=="O" && b[0].getText()=="X" && b[4].getText()=="" && (b[7].getText()=="O" || b[6].getText()=="O" || b[3].getText()=="O" ) )
{
b[4].setText("X");
s=s+"s24";
tf1.setText(s);
lost();
}


if(cp==0 && b[4].getText()=="" && b[6].getText()=="" && b[2].getText()=="" )
{
b[2].setText("X");
s=s+"s25";
tf1.setText(s);
lost();
}
if(cp!=5 && cp!=0 && b[2].getText()=="X" && b[0].getText()=="O" && b[5].getText()=="" )
{
b[5].setText("X");
s=s+"s26";
tf1.setText(s);
lost();
} 
if(cp==5 && b[0].getText()=="O" && b[2].getText()=="X" && b[4].getText()=="" && b[6].getText()=="" )
{
b[6].setText("X");
s=s+"s27";
tf1.setText(s);
lost();
}
if((cp==4 || cp==1 || cp==3) && b[7].getText()=="" && b[2].getText()=="X" && b[0].getText()=="O" && b[5].getText()=="O" && b[6].getText()=="X")
{
b[7].setText("X");
s=s+"s28";
tf1.setText(s);
lost();
}
if(cp==7 && b[4].getText()=="" && b[2].getText()=="X" && b[0].getText()=="O" && b[5].getText()=="O" && b[6].getText()=="X")
{
b[4].setText("X");
s=s+"s29";
tf1.setText(s);
lost();
}


if(cp==4 && b[6].getText()=="" && b[2].getText()=="" && b[0].getText()=="" )
{
b[0].setText("X");
s=s+"s30";
tf1.setText(s);
lost();
}
if(cp==2 && b[0].getText()=="X" && b[6].getText()=="" )
{
b[6].setText("X");
s=s+"s31";
tf1.setText(s);
lost();
}
if(cp==6 && b[0].getText()=="X" && b[2].getText()=="" )
{
b[2].setText("X");
s=s+"s32";
tf1.setText(s);
lost();
}
if(cp==7 && b[4].getText()=="O" && b[0].getText()=="X" && b[2].getText()=="O" && b[6].getText()=="X" && b[3].getText()=="" )
{
b[3].setText("X");
s=s+"s33";
tf1.setText(s);
lost();
}
if(cp==5 && b[4].getText()=="O" && b[0].getText()=="X" && b[2].getText()=="X" && b[6].getText()=="O" && b[1].getText()=="" )
{
b[1].setText("X");
s=s+"s34";
tf1.setText(s);
lost();
}	
if((cp==1 ||cp==3 ||cp==5 ) && b[4].getText()=="O" && b[0].getText()=="X" && b[2].getText()=="O" && b[6].getText()=="X" && b[7].getText()=="" )
{
b[7].setText("X");
s=s+"s38";
tf1.setText(s);
lost();
}
if((cp==1 ||cp==3 ||cp==7 ) && b[4].getText()=="O" && b[0].getText()=="X" && b[2].getText()=="X" && b[6].getText()=="O" && b[5].getText()=="" )
{
b[5].setText("X");
s=s+"s39";
tf1.setText(s);
lost();
}

if( b[4].getText()=="O" && b[0].getText()=="X" && b[2].getText()=="" && b[5].getText()=="" && b[3].getText()=="" && b[6].getText()=="" )
{
	if(cp==1)
	{	b[7].setText("X");
	s=s+"s40";
	tf1.setText(s);
lost();
	}
	if(cp==7)
	{	b[1].setText("X");	
	s=s+"s41";
	tf1.setText(s);
lost();
	}
}
if( b[4].getText()=="O" && b[0].getText()=="X" && b[2].getText()=="" && b[1].getText()=="" && b[7].getText()=="" && b[6].getText()=="" )
{
	if(cp==5)
	{	b[3].setText("X");
	s=s+"s42";
	tf1.setText(s);
lost();
	}
	if(cp==3)
	{	b[5].setText("X");	
	s=s+"s43";
	tf1.setText(s);
lost();
	}
}

if( b[4].getText()=="O" && b[0].getText()=="X" && ((b[1].getText()=="O" && b[2].getText()=="X") || (b[1].getText()=="X" && b[2].getText()=="O")) )
{
	if(cp==3)
	{	b[5].setText("X");
	s=s+"s44";
	tf1.setText(s);
lost();
if(l1.getText()!="<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>")
{	l1.setText("<html><FONT COLOR=RED FONT SIZE=5>Tie</FONT></html>");	}
	}
	if(cp==5)
	{	b[3].setText("X");	
	s=s+"s45";
	tf1.setText(s);
lost();
if(l1.getText()!="<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>")
{	l1.setText("<html><FONT COLOR=RED FONT SIZE=5>Tie</FONT></html>");	}
	}
}	
if( b[4].getText()=="O" && b[0].getText()=="X" && ((b[5].getText()=="O" && b[2].getText()=="X") || (b[5].getText()=="X" && b[2].getText()=="O")) )
{
	if(cp==1)
	{	b[7].setText("X");
	s=s+"s46";
	tf1.setText(s);
lost();
if(l1.getText()!="<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>")
{	l1.setText("<html><FONT COLOR=RED FONT SIZE=5>Tie</FONT></html>");	}
	}
	if(cp==7)
	{	b[1].setText("X");	
	s=s+"s47";
	tf1.setText(s);
lost();
if(l1.getText()!="<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>")
{	l1.setText("<html><FONT COLOR=RED FONT SIZE=5>Tie</FONT></html>");	}
	}
}	

}


public void actionPerformed(ActionEvent e) 
{
for(int i=0;i<9;i++)
{
if(e.getSource()==b[i])
{
if(b[i].getText()==(""))
{
b[i].setText("O");
cp=i;
}
}
}
try{
fun();
}
catch(Ex ex)
{
System.out.println("EXXX");
}	
}


void lost()
{
if(b[0].getText()=="X" && b[1].getText()=="X" && b[2].getText()=="X" )
{
l1.setText("<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>");
b[0].setForeground(Color.RED);
b[1].setForeground(Color.RED);
b[2].setForeground(Color.RED);
}
if(b[3].getText()=="X" && b[4].getText()=="X" && b[5].getText()=="X" )
{
l1.setText("<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>");
b[3].setForeground(Color.RED);
b[4].setForeground(Color.RED);
b[5].setForeground(Color.RED);
}
if(b[6].getText()=="X" && b[7].getText()=="X" && b[8].getText()=="X" )
{
l1.setText("<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>");
b[6].setForeground(Color.RED);
b[7].setForeground(Color.RED);
b[8].setForeground(Color.RED);
}
if(b[0].getText()=="X" && b[3].getText()=="X" && b[6].getText()=="X" )
{
l1.setText("<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>");
b[0].setForeground(Color.RED);
b[3].setForeground(Color.RED);
b[6].setForeground(Color.RED);
}
if(b[1].getText()=="X" && b[4].getText()=="X" && b[7].getText()=="X" )
{
l1.setText("<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>");
b[1].setForeground(Color.RED);
b[4].setForeground(Color.RED);
b[7].setForeground(Color.RED);
}
if(b[2].getText()=="X" && b[5].getText()=="X" && b[8].getText()=="X" )
{
l1.setText("<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>");
b[2].setForeground(Color.RED);
b[5].setForeground(Color.RED);
b[8].setForeground(Color.RED);
}
if(b[0].getText()=="X" && b[4].getText()=="X" && b[8].getText()=="X" )
{
l1.setText("<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>");
b[0].setForeground(Color.RED);
b[4].setForeground(Color.RED);
b[8].setForeground(Color.RED);
}
if(b[2].getText()=="X" && b[4].getText()=="X" && b[6].getText()=="X" )
{
l1.setText("<html><FONT COLOR=RED FONT SIZE=5>You Lost</FONT></html>");
//b[2].setIcon(new ImageIcon("F:\\New folder (2)\\Java\\menuswingp\\menu\\images\\201.png"));
b[2].setForeground(Color.RED);
b[4].setForeground(Color.RED);
b[6].setForeground(Color.RED);
}
}


public void run() 
{
TicTacToe ttt=new TicTacToe();
ttt.code();
}
}


class Ex extends Exception
{
}


public class Game1{
	JFrame jfm;
	JButton jb1,jb2,jb3;
	JPanel jpm;
	Game1()
	{
		jfm=new JFrame("Game1");
		jfm.setSize(500, 500);
		jfm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Container con=jfm.getContentPane();
		con.setLayout(new BorderLayout());
		con.setBackground(Color.CYAN);
		jfm.setVisible(true);
		
		jpm=new JPanel();
		jpm.setBackground(Color.CYAN);
		jpm.setLayout(new FlowLayout());
		jfm.add(jpm,BorderLayout.CENTER);
		
		JLabel jlm=new JLabel("Please choose one button");
		jlm.setForeground(Color.RED);
		jpm.add(jlm);
		
		jb1=new JButton("1");
		jb1.setBackground(Color.GREEN);
		jpm.add(jb1);
		jb1.addActionListener(ae->
		{
		Go21Puzzle g21=new Go21Puzzle();
		g21.start(); }
								);
		jb2=new JButton("2");
		jb2.setBackground(Color.GREEN);
		jpm.add(jb2);
		jb2.addActionListener(ae->
		{
			PixelPuzzle pp=new PixelPuzzle();
			pp.start();
		}
							);
		jb3=new JButton("3");
		jb3.setBackground(Color.GREEN);
		jpm.add(jb3);
		jb3.addActionListener(ae->{
			TicTacToe tt=new TicTacToe();
			tt.start();
		});
		//jfm.pack();
		
		//Go21Puzzle g21=new Go21Puzzle();
		//g21.start();
		//System.out.println(Thread.currentThread().getName());
		//PixelPuzzle pp2=new PixelPuzzle();
		//pp2.start();
		
	}
	
	public static void main(String []arg)
	{
	new Game1();
	}
}
