package wordCountTool;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WordCountTool extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordCountTool frame = new WordCountTool();
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
	public WordCountTool() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TYPE WORD");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(56, 73, 75, 14);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(198, 32, 345, 97);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("COUNT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Sentence = textField.getText();
				int words = 1;
				for(int i = 0; i <= Sentence.length(); i++) {
					if(Sentence.charAt(i) ==' ') {
						words++;
					}
					
					textField_1.setText(" "+words);
					
				}
			}

			private void setText(String string) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(198, 140, 345, 35);
		panel.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField_1.setBounds(198, 186, 86, 44);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL WORD");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(56, 201, 86, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.setBounds(85, 252, 89, 38);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBackground(Color.CYAN);
		btnNewButton_2.setBounds(365, 252, 89, 38);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("WORD COUNT TOOL");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(141, 0, 215, 25);
		panel.add(lblNewLabel_2);
	}
}
