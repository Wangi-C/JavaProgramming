package Chapter10;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

public class MyKeyListener extends KeyAdapter{
	  public void keyPressed(KeyEvent e) {
	        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
	          JLabel la = (JLabel)e.getSource();
	          String text = la.getText();
	          String front = text.substring(0,1);
	          String last = text.substring(1);
	          la.setText(last.concat(front));
	        }
	      }
}