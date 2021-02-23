package games;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import exception.Ex;

public class TicTacToe extends Thread implements ActionListener
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
