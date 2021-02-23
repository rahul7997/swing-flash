package games;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PixelPuzzle extends Thread implements ActionListener
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
	
	b[a].setBounds(x,y,90,100);
//	b[a].setMargin(new Insets(0, 0, 0, 0));
	p.add(b[a]);
	x=x+90;
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
