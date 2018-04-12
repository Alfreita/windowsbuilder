package frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
	TrueAndFalse t= new TrueAndFalse();
	private boolean enabled;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		final JLabel lbl1 = new JLabel("lbl1");
		GridBagConstraints gbc_lbl1 = new GridBagConstraints();
		gbc_lbl1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl1.gridx = 1;
		gbc_lbl1.gridy = 1;
		contentPane.add(lbl1, gbc_lbl1);

		txt1 = new JTextField();
		txt1.setEnabled(false);
		txt1.setText("txt1");
		GridBagConstraints gbc_txt1 = new GridBagConstraints();
		gbc_txt1.insets = new Insets(0, 0, 5, 5);
		gbc_txt1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt1.gridx = 5;
		gbc_txt1.gridy = 1;
		contentPane.add(txt1, gbc_txt1);
		txt1.setColumns(10);

		final JLabel lbl2 = new JLabel("lbl2");
		GridBagConstraints gbc_lbl2 = new GridBagConstraints();
		gbc_lbl2.insets = new Insets(0, 0, 5, 5);
		gbc_lbl2.gridx = 1;
		gbc_lbl2.gridy = 2;
		contentPane.add(lbl2, gbc_lbl2);

		txt2 = new JTextField();
		txt2.setEnabled(false);
		txt2.setText("txt2");
		GridBagConstraints gbc_txt2 = new GridBagConstraints();
		gbc_txt2.insets = new Insets(0, 0, 5, 5);
		gbc_txt2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt2.gridx = 5;
		gbc_txt2.gridy = 2;
		contentPane.add(txt2, gbc_txt2);
		txt2.setColumns(10);

		final JLabel lbl3 = new JLabel("lbl3");
		GridBagConstraints gbc_lbl3 = new GridBagConstraints();
		gbc_lbl3.insets = new Insets(0, 0, 5, 5);
		gbc_lbl3.gridx = 1;
		gbc_lbl3.gridy = 3;
		contentPane.add(lbl3, gbc_lbl3);

		txt3 = new JTextField();
		txt3.setEnabled(false);
		txt3.setText("txt3");
		GridBagConstraints gbc_txt3 = new GridBagConstraints();
		gbc_txt3.insets = new Insets(0, 0, 5, 5);
		gbc_txt3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt3.gridx = 5;
		gbc_txt3.gridy = 3;
		contentPane.add(txt3, gbc_txt3);
		txt3.setColumns(10);

		final JLabel lbl4 = new JLabel("lbl4");
		GridBagConstraints gbc_lbl4 = new GridBagConstraints();
		gbc_lbl4.insets = new Insets(0, 0, 5, 5);
		gbc_lbl4.gridx = 1;
		gbc_lbl4.gridy = 4;
		contentPane.add(lbl4, gbc_lbl4);

		txt4 = new JTextField();
		txt4.setEnabled(false);
		txt4.setText("txt4");
		GridBagConstraints gbc_txt4 = new GridBagConstraints();
		gbc_txt4.insets = new Insets(0, 0, 5, 5);
		gbc_txt4.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt4.gridx = 5;
		gbc_txt4.gridy = 4;
		contentPane.add(txt4, gbc_txt4);
		txt4.setColumns(10);

		JButton btnNewButton = new JButton("b1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enabled=t.isVar();
				lbl1.setVisible(enabled);
				txt1.setVisible(enabled);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 6;
		contentPane.add(btnNewButton, gbc_btnNewButton);

		JButton btnNewButton_2 = new JButton("b4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enabled=t.isVar();
				lbl4.setVisible(enabled);
				txt4.setVisible(enabled);
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 7;
		gbc_btnNewButton_2.gridy = 6;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);

		JButton btnB = new JButton("b2");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enabled=t.isVar();
				lbl2.setVisible(enabled);
				txt2.setVisible(enabled);
			}
		});
		GridBagConstraints gbc_btnB = new GridBagConstraints();
		gbc_btnB.insets = new Insets(0, 0, 5, 5);
		gbc_btnB.gridx = 1;
		gbc_btnB.gridy = 7;
		contentPane.add(btnB, gbc_btnB);

		JButton btnNewButton_3 = new JButton("b5");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enabled=t.isVar();
				lbl1.setVisible(enabled);
				txt1.setVisible(enabled);
				lbl3.setVisible(enabled);
				txt3.setVisible(enabled);
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 7;
		gbc_btnNewButton_3.gridy = 7;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);

		JButton btnNewButton_1 = new JButton("b3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enabled=t.isVar();
				lbl3.setVisible(enabled);
				txt3.setVisible(enabled);
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 8;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);

		JButton btnNewButton_4 = new JButton("b6");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enabled=t.isVar();
				lbl2.setVisible(enabled);
				txt2.setVisible(enabled);
				lbl4.setVisible(enabled);
				txt4.setVisible(enabled);
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 7;
		gbc_btnNewButton_4.gridy = 8;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);

		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.anchor = GridBagConstraints.SOUTH;
		gbc_textField_4.gridwidth = 9;
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 0;
		gbc_textField_4.gridy = 9;
		contentPane.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
	}

}
