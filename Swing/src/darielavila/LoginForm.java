package darielavila;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
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
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 570, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl1 = new JLabel("Hi Crush!");
		lbl1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lbl1.setBounds(223, 53, 115, 51);
		frame.getContentPane().add(lbl1);
		
		JLabel lbl2 = new JLabel("Sa totoo lang pag-ibig na yung nararamdaman ko");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl2.setBounds(95, 91, 413, 51);
		frame.getContentPane().add(lbl2);
		
		JLabel lbl3 = new JLabel("para sayo. Can i court you?");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl3.setBounds(171, 125, 238, 51);
		frame.getContentPane().add(lbl3);
		
		JButton btnNo9 = new JButton("No");
		btnNo9.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				btnNo9.hide();
			}
		});
		btnNo9.setVisible(false);
		btnNo9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNo9.setBounds(188, 11, 81, 37);
		frame.getContentPane().add(btnNo9);
		
		JButton btnNo8 = new JButton("No");
		btnNo8.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				btnNo8.hide();
				btnNo9.show();
			}
		});
		btnNo8.setVisible(false);
		btnNo8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNo8.setBounds(452, 153, 81, 37);
		frame.getContentPane().add(btnNo8);
		
		JButton btnNo7 = new JButton("No");
		btnNo7.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				btnNo7.hide();
				btnNo8.show();
			}
		});
		btnNo7.setVisible(false);
		btnNo7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNo7.setBounds(22, 142, 81, 37);
		frame.getContentPane().add(btnNo7);
		
		JButton btnNo6 = new JButton("No");
		btnNo6.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				btnNo6.hide();
				btnNo7.show();
				
			}
		});
		btnNo6.setVisible(false);
		btnNo6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNo6.setBounds(427, 245, 81, 37);
		frame.getContentPane().add(btnNo6);
		
		
		JButton btnNo5 = new JButton("No");
		btnNo5.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				btnNo5.hide();
				btnNo6.show();
				
			}
		});
		btnNo5.setVisible(false);
		btnNo5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNo5.setBounds(38, 237, 81, 37);
		frame.getContentPane().add(btnNo5);
		
		JButton btnNo4 = new JButton("No");
		btnNo4.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				btnNo4.hide();
				btnNo5.show();
			}
		});
		btnNo4.setVisible(false);
		btnNo4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNo4.setBounds(54, 43, 81, 37);
		frame.getContentPane().add(btnNo4);
		
		JButton btnNo3 = new JButton("No");
		btnNo3.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				btnNo3.hide();
				btnNo4.show();
			}
		});
		
		btnNo3.setVisible(false);
		btnNo3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNo3.setBounds(223, 237, 81, 37);
		frame.getContentPane().add(btnNo3);
		
		JButton btnNo2 = new JButton("No");
		btnNo2.setVisible(false);
		btnNo2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				btnNo2.hide();
				btnNo3.show();
				
			}
		});
		btnNo2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNo2.setBounds(377, 43, 81, 37);
		frame.getContentPane().add(btnNo2);
		
		JButton btnNo1 = new JButton("No");
		btnNo1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				btnNo1.hide();
				btnNo2.show();
			}
		});
		
		btnNo1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNo1.setBounds(328, 176, 81, 37);
		frame.getContentPane().add(btnNo1);
		
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				btnYes.show();
				btnYes.hide();
				
				lbl1.hide();
				lbl3.hide();
				lbl2.setText("Totoo ba yan? Yesssssss!!!, Love you crushhh <3");
				
				btnNo1.hide();
				btnNo2.hide();
				btnNo3.hide();
				btnNo4.hide();
				btnNo5.hide();
				btnNo6.hide();
				btnNo7.hide();
				btnNo8.hide();
				btnNo9.hide();
				
			}
		});
		btnYes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnYes.setBounds(122, 176, 81, 37);
		frame.getContentPane().add(btnYes);

		
		
		

		
		
	}
}
