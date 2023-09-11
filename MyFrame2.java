package p20230911;

import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame {
		public MyFrame2() {
			setSize(300,200);
			setTitle("MyFrame");
			setLayout(new FlowLayout());
			getContentPane().setBackground(Color.yellow);
			JButton button1 = new JButton("확인");
			JButton button2 = new JButton("취소");
			add(button1);
			add(button2);
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}


