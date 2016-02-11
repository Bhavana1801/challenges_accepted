import javax.swing.*;
import java.awt.event.*;
class gui implements ActionListener{
	JButton btn;
	public static void main(String[] args) {
		gui g = new gui();
		g.start();
		
	}
	void start() {
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn = new JButton("click here");
		btn.setSize(100,100);
		btn.addActionListener(this);
		frame.getContentPane().add(btn);
		frame.setSize(300,300);
		frame.setVisible(true);

	}
	public void actionPerformed(ActionEvent event) {
		btn.setText("hello world");
	}
}
class hai {
	class he{
		
	}
}