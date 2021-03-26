import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	JLabel resultLabel = new JLabel("0");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel Number1Label = new JLabel("Number 1: ");
		
		JLabel Number2Label = new JLabel("Number 2: ");
		
		textField1 = new JTextField();
		textField1.setText("0");
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setText("0");
		textField2.setColumns(10);
		
		JButton CalculateButton = new JButton("Calculate");
		CalculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int choice1 = Integer.parseInt(textField1.getText()); 
				int choice2 = Integer.parseInt(textField2.getText());
				
				int total = choice1 + choice2; 
				resultLabel.setText(String.valueOf(total)); 
				
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(106)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(Number2Label, Alignment.TRAILING)
						.addComponent(Number1Label, Alignment.TRAILING))
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField1, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(75))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(169)
					.addComponent(CalculateButton)
					.addContainerGap(169, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(213)
					.addComponent(resultLabel)
					.addContainerGap(219, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Number1Label))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(Number2Label))
					.addGap(74)
					.addComponent(resultLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
					.addComponent(CalculateButton))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
