package darielavila;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Caloocan_Boy {

	private JFrame frmCaloocanBoy;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caloocan_Boy window = new Caloocan_Boy();
					window.frmCaloocanBoy.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Caloocan_Boy() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCaloocanBoy = new JFrame();
		frmCaloocanBoy.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ACER\\OneDrive\\Pictures\\Wallpapers\\quick art block!.png"));
		frmCaloocanBoy.setTitle("Caloocan Boy");
		frmCaloocanBoy.setBounds(100, 100, 574, 487);
		frmCaloocanBoy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCaloocanBoy.getContentPane().setLayout(null);
		
		JLabel lblQuestion = new JLabel("Taga saan ka?");
		lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblQuestion.setBounds(206, 108, 143, 58);
		frmCaloocanBoy.getContentPane().add(lblQuestion);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(188, 164, 187, 42);
		frmCaloocanBoy.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCaloocan = new JLabel("");
		lblCaloocan.setVisible(false);
		lblCaloocan.setIcon(new ImageIcon("C:\\Users\\ACER\\OneDrive\\Pictures\\caloocanboy.jpg"));
		lblCaloocan.setBounds(100, 38, 376, 358);
		frmCaloocanBoy.getContentPane().add(lblCaloocan);
		
		JButton btnNewButton = new JButton("Submitt");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				lblCaloocan.hide();
				lblCaloocan.show();
				lblQuestion.hide();
				textField.hide();
				btnNewButton.hide();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(220, 217, 113, 35);
		frmCaloocanBoy.getContentPane().add(btnNewButton);
		
		
	}
}
