package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ctrl.Controller;

public class Gui {
	private Controller ctrl;
	private JFrame frame;
	private JTextField textKey;
	private List<JCheckBox> chkList;
	private JTextArea textPlain;
	private JTextArea textCrypt;

	/**
	 * Create the application.
	 */
	public Gui(Controller ctrl) {
		System.out.println("--- init Gui");
		this.ctrl = ctrl;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 334);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 274);
		frame.getContentPane().add(tabbedPane);

		// --- Alphabet Tab
		JComponent comp1 = new JPanel();
		comp1.setName("Cipher Alphabet");
		tabbedPane.add(comp1);
		comp1.setLayout(null);

		// --- alphabet checkboxes
		chkList = new ArrayList<>();

		JCheckBox chckbxNewCheckBox = new JCheckBox("A");
		chckbxNewCheckBox.setBounds(6, 7, 97, 23);
		comp1.add(chckbxNewCheckBox);
		chkList.add(chckbxNewCheckBox);

		JCheckBox chckbxB = new JCheckBox("B");
		chckbxB.setBounds(6, 33, 97, 23);
		comp1.add(chckbxB);
		chkList.add(chckbxB);

		JCheckBox chckbxC = new JCheckBox("C");
		chckbxC.setBounds(6, 59, 97, 23);
		comp1.add(chckbxC);
		chkList.add(chckbxC);

		JCheckBox chckbxF = new JCheckBox("F");
		chckbxF.setBounds(6, 137, 97, 23);
		comp1.add(chckbxF);
		chkList.add(chckbxF);

		JCheckBox chckbxE = new JCheckBox("E");
		chckbxE.setBounds(6, 111, 97, 23);
		comp1.add(chckbxE);
		chkList.add(chckbxE);

		JCheckBox chckbxD = new JCheckBox("D");
		chckbxD.setBounds(6, 85, 97, 23);
		comp1.add(chckbxD);
		chkList.add(chckbxD);

		JCheckBox chckbxI = new JCheckBox("I");
		chckbxI.setBounds(6, 216, 97, 23);
		comp1.add(chckbxI);
		chkList.add(chckbxI);

		JCheckBox chckbxH = new JCheckBox("H");
		chckbxH.setBounds(6, 190, 97, 23);
		comp1.add(chckbxH);
		chkList.add(chckbxH);

		JCheckBox chckbxG = new JCheckBox("G");
		chckbxG.setBounds(6, 164, 97, 23);
		comp1.add(chckbxG);
		chkList.add(chckbxG);

		JCheckBox chckbxJ = new JCheckBox("J");
		chckbxJ.setBounds(119, 7, 97, 23);
		comp1.add(chckbxJ);
		chkList.add(chckbxJ);

		JCheckBox chckbxK = new JCheckBox("K");
		chckbxK.setBounds(119, 33, 97, 23);
		comp1.add(chckbxK);
		chkList.add(chckbxK);

		JCheckBox chckbxL = new JCheckBox("L");
		chckbxL.setBounds(119, 59, 97, 23);
		comp1.add(chckbxL);
		chkList.add(chckbxL);

		JCheckBox chckbxR = new JCheckBox("R");
		chckbxR.setBounds(119, 216, 97, 23);
		comp1.add(chckbxR);
		chkList.add(chckbxR);

		JCheckBox chckbxMm = new JCheckBox("M");
		chckbxMm.setBounds(119, 85, 97, 23);
		comp1.add(chckbxMm);
		chkList.add(chckbxMm);

		JCheckBox chckbxN = new JCheckBox("N");
		chckbxN.setBounds(119, 111, 97, 23);
		comp1.add(chckbxN);
		chkList.add(chckbxN);

		JCheckBox chckbxP = new JCheckBox("P");
		chckbxP.setBounds(119, 164, 97, 23);
		comp1.add(chckbxP);
		chkList.add(chckbxP);

		JCheckBox chckbxQ = new JCheckBox("Q");
		chckbxQ.setBounds(119, 190, 97, 23);
		comp1.add(chckbxQ);
		chkList.add(chckbxQ);

		JCheckBox chckbxO = new JCheckBox("O");
		chckbxO.setBounds(119, 137, 97, 23);
		comp1.add(chckbxO);
		chkList.add(chckbxO);

		JCheckBox chckbxS = new JCheckBox("S");
		chckbxS.setBounds(218, 7, 97, 23);
		comp1.add(chckbxS);
		chkList.add(chckbxS);

		JCheckBox chckbxT = new JCheckBox("T");
		chckbxT.setBounds(218, 33, 97, 23);
		comp1.add(chckbxT);
		chkList.add(chckbxT);

		JCheckBox chckbxU = new JCheckBox("U");
		chckbxU.setBounds(218, 59, 97, 23);
		comp1.add(chckbxU);
		chkList.add(chckbxU);

		JCheckBox chckbxV = new JCheckBox("V");
		chckbxV.setBounds(218, 85, 97, 23);
		comp1.add(chckbxV);
		chkList.add(chckbxV);

		JCheckBox chckbxW = new JCheckBox("W");
		chckbxW.setBounds(218, 111, 97, 23);
		comp1.add(chckbxW);
		chkList.add(chckbxW);

		JCheckBox chckbxX = new JCheckBox("X");
		chckbxX.setBounds(218, 137, 97, 23);
		comp1.add(chckbxX);
		chkList.add(chckbxX);

		JCheckBox chckbxY = new JCheckBox("Y");
		chckbxY.setBounds(218, 163, 97, 23);
		comp1.add(chckbxY);
		chkList.add(chckbxY);

		JCheckBox chckbxZ = new JCheckBox("Z");
		chckbxZ.setBounds(218, 189, 97, 23);
		comp1.add(chckbxZ);
		chkList.add(chckbxZ);


		JLabel label = new JLabel("\" \"");
		label.setBounds(241, 220, 46, 14);
		comp1.add(label);

		JCheckBox checkBox = new JCheckBox(" ");
		checkBox.setBounds(218, 216, 97, 23);
		comp1.add(checkBox);
		chkList.add(checkBox);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				getSelectedAlphabet();
			}
		});
		btnNewButton.setBounds(310, 7, 89, 23);
		comp1.add(btnNewButton);
		// --- Ciphering Tab
		JComponent comp2 = new JPanel();
		comp2.setName("Ciphering");
		tabbedPane.add(comp2);
		comp2.setLayout(null);

		textPlain = new JTextArea();
		textPlain.setBounds(10, 28, 185, 130);
		comp2.add(textPlain);
		textPlain.setText("Hello world miau");

		textCrypt = new JTextArea();
		textCrypt.setBounds(214, 28, 185, 130);
		comp2.add(textCrypt);

		textKey = new JTextField();
		textKey.setBounds(159, 169, 86, 20);
		comp2.add(textKey);
		textKey.setColumns(10);

		JLabel lblPlainText = new JLabel("Plain Text");
		lblPlainText.setBounds(10, 11, 78, 14);
		comp2.add(lblPlainText);

		JLabel lblNewLabel = new JLabel("Encrypted Text");
		lblNewLabel.setBounds(214, 11, 99, 14);
		comp2.add(lblNewLabel);

		JLabel lblKey = new JLabel("Key");
		lblKey.setBounds(117, 172, 46, 14);
		comp2.add(lblKey);

		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textCrypt.setText(ctrl.encrypt(textKey.getText(), textPlain.getText().trim(), false));
				textPlain.setText("");
			}
		});
		btnEncrypt.setBounds(61, 200, 89, 23);
		comp2.add(btnEncrypt);

		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPlain.setText(ctrl.encrypt(textKey.getText(), textCrypt.getText().trim(), true));
				textCrypt.setText("");
			}
		});
		btnDecrypt.setBounds(258, 200, 89, 23);
		comp2.add(btnDecrypt);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCrypt.setText("");
				textKey.setText("");
				textPlain.setText("");
			}
		});
		btnClear.setBounds(159, 200, 89, 23);
		comp2.add(btnClear);

		frame.setVisible(true);
	}

	// test
	public void getSelectedAlphabet() {
		System.out.println("# begin");
		for (JCheckBox cb : chkList) {
			if (cb.isSelected()) {
				System.out.print(cb.getText());
			}
		}
		System.out.println("\n# end");
	}
}
