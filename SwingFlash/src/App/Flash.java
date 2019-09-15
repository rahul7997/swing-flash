package App;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import games.Go21Puzzle;
import games.PixelPuzzle;
import games.TicTacToe;


public class Flash{
	JFrame jfm;
	JButton jb1,jb2,jb3;
	JPanel jpm;
	Flash()
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
		
		jb1=new JButton("Go21Puzzle");
		jb1.setBackground(Color.GREEN);
		jpm.add(jb1);
		jb1.addActionListener(ae->
		{
		Go21Puzzle g21=new Go21Puzzle();
		g21.start(); }
								);
		jb2=new JButton("PixelPuzzle");
		jb2.setBackground(Color.GREEN);
		jpm.add(jb2);
		jb2.addActionListener(ae->
		{
			PixelPuzzle pp=new PixelPuzzle();
			pp.start();
		}
							);
		jb3=new JButton("TicTacToe");
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
	new Flash();
	}
}

