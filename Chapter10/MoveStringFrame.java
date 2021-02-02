package Chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 

public class MoveStringFrame extends JFrame {
  public MoveStringFrame() {
    super("Left 키로 문자열 이동");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

    Container c = getContentPane();
    c.setLayout(new FlowLayout());

 

    JLabel label = new JLabel("Love Java");
    c.add(label);

 

    label.addKeyListener(new MyKeyListener());

 

    setSize(250,100);
    setVisible(true);

 

    label.setFocusable(true); 
    label.requestFocus();
  }
  
  static public void main(String [] args) {
    new MoveStringFrame();
  }
}