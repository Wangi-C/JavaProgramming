package Chapter11;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameLabel extends JFrame{
	public String[] num = {"0","1","2","3","4","5","6","7","8","9"};
	public int count = 0;
	JLabel[] jl = new JLabel[10];
	
	public GameLabel()
	{
		setTitle("Ten 레이블 클릭");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i = 0; i < jl.length; i++)
		{
			jl[i] = new JLabel(num[i]);
			jl[i].addMouseListener(new MyMouseListener());
			c.add(jl[i]);
			jl[i].setLocation((int)(Math.random()*300), (int)(Math.random()*300));
			jl[i].setSize(10, 10);
			
		}
		setSize(300, 300);
		setVisible(true);
	}
	public class MyMouseListener extends MouseAdapter 
	{
		public void mouseClicked(MouseEvent e)
		{
			JLabel label = (JLabel)e.getSource();
			if(label.getText() == num[count])
			{
				jl[count].setVisible(false);;
				count ++;
				if(count == 10)
				{
					for(int i = 0; i<10; i++)
					{
						jl[i].setVisible(true);
						count = 0;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new GameLabel();
	}
}
