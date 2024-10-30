package robbinsCS250SDLC;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWindow window = new HelloWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HelloWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPressMe = new JButton("Off");
		btnPressMe.addActionListener(new ActionListener() {
			private boolean state = false;
			public void actionPerformed(ActionEvent e) {
				if(state) {
					btnPressMe.setText("Off");
				} else {
					btnPressMe.setText("On");
				}
				state = !state;
				
			}
		});
		btnPressMe.setBounds(169, 11, 89, 23);
		frame.getContentPane().add(btnPressMe);
	}
}
