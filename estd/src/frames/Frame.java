package frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultTreeCellEditor.EditorContainer;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.List;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.DropMode;
import javax.swing.JSpinner;

public class Frame extends JFrame {



	private final static String newline = "\n";
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JTextField txt4;

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
		setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 215, 24, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 45, 42, 1, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel label = new JLabel("log:");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 2;
		gbc_label.gridy = 5;
		contentPane.add(label, gbc_label);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 6;
		contentPane.add(scrollPane, gbc_scrollPane);

		final JTextArea textArea = new JTextArea(10, 10);
		textArea.setLineWrap(true);
		textArea.setEnabled(false);
		scrollPane.setViewportView(textArea);


		final JLabel lbl1 = new JLabel("lbl1");
		GridBagConstraints gbc_lbl1 = new GridBagConstraints();
		gbc_lbl1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbl1.insets = new Insets(0, 0, 5, 5);
		gbc_lbl1.gridx = 0;
		gbc_lbl1.gridy = 1;
		contentPane.add(lbl1, gbc_lbl1);

		txt1 = new JTextField();
		txt1.setEnabled(false);
		txt1.setText("txt1");
		GridBagConstraints gbc_txt1 = new GridBagConstraints();
		gbc_txt1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt1.insets = new Insets(0, 0, 5, 0);
		gbc_txt1.gridx = 2;
		gbc_txt1.gridy = 1;
		contentPane.add(txt1, gbc_txt1);
		txt1.setColumns(10);

		final JLabel lbl2 = new JLabel("lbl2");
		GridBagConstraints gbc_lbl2 = new GridBagConstraints();
		gbc_lbl2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbl2.insets = new Insets(0, 0, 5, 5);
		gbc_lbl2.gridx = 0;
		gbc_lbl2.gridy = 2;
		contentPane.add(lbl2, gbc_lbl2);

		txt2 = new JTextField();
		txt2.setEnabled(false);
		txt2.setText("txt2");
		GridBagConstraints gbc_txt2 = new GridBagConstraints();
		gbc_txt2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt2.insets = new Insets(0, 0, 5, 0);
		gbc_txt2.gridx = 2;
		gbc_txt2.gridy = 2;
		contentPane.add(txt2, gbc_txt2);
		txt2.setColumns(10);

		final JLabel lbl3 = new JLabel("lbl3");
		GridBagConstraints gbc_lbl3 = new GridBagConstraints();
		gbc_lbl3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbl3.insets = new Insets(0, 0, 5, 5);
		gbc_lbl3.gridx = 0;
		gbc_lbl3.gridy = 3;
		contentPane.add(lbl3, gbc_lbl3);

		txt3 = new JTextField();
		txt3.setEnabled(false);
		txt3.setText("txt3");
		GridBagConstraints gbc_txt3 = new GridBagConstraints();
		gbc_txt3.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt3.insets = new Insets(0, 0, 5, 0);
		gbc_txt3.gridx = 2;
		gbc_txt3.gridy = 3;
		contentPane.add(txt3, gbc_txt3);
		txt3.setColumns(10);

		final JLabel lbl4 = new JLabel("lbl4");
		GridBagConstraints gbc_lbl4 = new GridBagConstraints();
		gbc_lbl4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lbl4.insets = new Insets(0, 0, 5, 5);
		gbc_lbl4.gridx = 0;
		gbc_lbl4.gridy = 4;
		contentPane.add(lbl4, gbc_lbl4);

		txt4 = new JTextField();
		txt4.setEnabled(false);
		txt4.setText("txt4");
		GridBagConstraints gbc_txt4 = new GridBagConstraints();
		gbc_txt4.fill = GridBagConstraints.HORIZONTAL;
		gbc_txt4.insets = new Insets(0, 0, 5, 0);
		gbc_txt4.gridx = 2;
		gbc_txt4.gridy = 4;
		contentPane.add(txt4, gbc_txt4);
		txt4.setColumns(10);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 12, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JButton btnTogglelbl = new JButton("toggleLbl1");
		btnTogglelbl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lbl1.setVisible(!lbl1.isVisible());
				txt1.setVisible(!txt1.isVisible());
				textArea.append(lbl1.getText() + newline + txt1.getText() + newline);
			}
		});
		GridBagConstraints gbc_btnTogglelbl = new GridBagConstraints();
		gbc_btnTogglelbl.insets = new Insets(0, 0, 5, 5);
		gbc_btnTogglelbl.gridx = 0;
		gbc_btnTogglelbl.gridy = 0;
		panel.add(btnTogglelbl, gbc_btnTogglelbl);

		JButton btnNewButton_1 = new JButton("toggleLbl3");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 0;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lbl3.setVisible(!lbl3.isVisible());
				txt3.setVisible(!txt3.isVisible());
				textArea.append(lbl3.getText() + newline + txt3.getText() + newline);
			}
		});

		JButton btnB = new JButton("toggleLbl2");
		GridBagConstraints gbc_btnB = new GridBagConstraints();
		gbc_btnB.fill = GridBagConstraints.VERTICAL;
		gbc_btnB.insets = new Insets(0, 0, 5, 5);
		gbc_btnB.gridx = 0;
		gbc_btnB.gridy = 1;
		panel.add(btnB, gbc_btnB);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lbl2.setVisible(!lbl2.isVisible());
				txt2.setVisible(!txt2.isVisible());
				textArea.append(lbl2.getText() + newline + txt2.getText() + newline);
			}
		});

		JButton btnNewButton_2 = new JButton("toggleLbl4");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.VERTICAL;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 1;
		gbc_btnNewButton_2.gridy = 1;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl4.setVisible(!lbl4.isVisible());
				txt4.setVisible(!txt4.isVisible());
				textArea.append(lbl4.getText() + newline + txt4.getText() + newline);

			}
		});

		JButton btnNewButton_3 = new JButton("toggleLbl5");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 2;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl1.setVisible(!lbl1.isVisible());
				txt1.setVisible(!txt1.isVisible());
				lbl3.setVisible(!lbl3.isVisible());
				txt3.setVisible(!txt3.isVisible());
				textArea.append(lbl1.getText() + newline + txt1.getText() + newline + lbl3.getText() + newline
						+ txt3.getText() + newline);
			}
		});

		JButton btnNewButton_4 = new JButton("toggleLbl6");
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_4.gridx = 1;
		gbc_btnNewButton_4.gridy = 2;
		panel.add(btnNewButton_4, gbc_btnNewButton_4);

		JButton btnNewButton = new JButton("limpa log");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 7;
		contentPane.add(btnNewButton, gbc_btnNewButton);

		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lbl2.setVisible(!lbl2.isVisible());
				txt2.setVisible(!txt2.isVisible());
				lbl4.setVisible(!lbl4.isVisible());
				txt4.setVisible(!txt4.isVisible());
				textArea.append(lbl2.getText() + newline + txt2.getText() + newline + lbl4.getText() + newline
						+ txt4.getText() + newline);

			}
		});
	}

}
