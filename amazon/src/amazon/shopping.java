package amazon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class shopping {

	private JFrame frame;
	private JTextField c1;
	private JTextField c2;
	int i=0;
	int total=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					shopping window = new shopping();
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
	public shopping() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Amazon");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(213, 22, 202, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\boookkss\\book1.PNG"));
		lblNewLabel_1.setBounds(27, 96, 144, 225);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\boookkss\\book2.PNG"));
		lblNewLabel_2.setBounds(252, 96, 142, 225);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\boookkss\\book3.PNG"));
		lblNewLabel_3.setBounds(473, 96, 144, 225);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cart :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(454, 22, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total cost :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(425, 55, 97, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel l1 = new JLabel("110/-");
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		l1.setBounds(10, 352, 46, 14);
		frame.getContentPane().add(l1);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				c1.setText(""+i);
				total=total+110;
				c2.setText(""+total);
			}
			}			
		);
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewButton.setBounds(66, 348, 119, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				c1.setText(""+i);
				total=total+110;
				c2.setText(""+total);
			}
		});
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewButton_1.setBounds(296, 348, 119, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				c1.setText(""+i);
				total=total+110;
				c2.setText(""+total);
			}
		});
		btnNewButton_2.setFont(new Font("Verdana", Font.BOLD, 14));
		btnNewButton_2.setBounds(527, 348, 119, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel l2 = new JLabel("110/-");
		l2.setFont(new Font("Tahoma", Font.BOLD, 16));
		l2.setBounds(240, 352, 46, 14);
		frame.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("110/-");
		l3.setFont(new Font("Tahoma", Font.BOLD, 16));
		l3.setBounds(473, 352, 46, 14);
		frame.getContentPane().add(l3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"paper", "kindel", "pdf"}));
		comboBox.setBounds(76, 382, 95, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"paper", "kindel", "pdf"}));
		comboBox_1.setBounds(277, 382, 95, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"paper", "kindel", "pdf"}));
		comboBox_2.setBounds(527, 382, 95, 22);
		frame.getContentPane().add(comboBox_2);
		
		c1 = new JTextField();
		c1.setBounds(504, 22, 86, 20);
		frame.getContentPane().add(c1);
		c1.setColumns(10);
		
		c2 = new JTextField();
		c2.setBounds(520, 54, 86, 20);
		frame.getContentPane().add(c2);
		c2.setColumns(10);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
}
