package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;

public class Libreria extends JFrame {

	private JPanel contentPane;
	private JTextField textID;
	private JTextField TextTitulo;
	private JTextField textAño;
	private JTextField textEditor;
	private JTextField TextNumPg;
	private JTextField textResult;
	private JTextField TextIDR;
	private JButton btnEnviar;
	private JButton btnIDR;
	private JTextField textAutor;
	public Libreria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblLibreria = new JLabel("Libreria");
		lblLibreria.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JLabel lblIdentificador = new JLabel("Identificador: ");
		lblIdentificador.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblSiQuiereMeter = new JLabel("Si quiere meter un libro, rellene los campos. Si quiere recoger un libro, ponga la id. Si quiere recoger todos, dale al bot\u00F3n.");

		textID = new JTextField();
		textID.setColumns(10);

		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setFont(new Font("Tahoma", Font.PLAIN, 15));

		TextTitulo = new JTextField();
		TextTitulo.setColumns(10);

		JLabel lblAño = new JLabel("A\u00F1o de publicaci\u00F3n:");
		lblAño.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textAño = new JTextField();
		textAño.setColumns(10);

		JLabel lblEditor = new JLabel("Editor:");
		lblEditor.setFont(new Font("Tahoma", Font.PLAIN, 15));

		textEditor = new JTextField();
		textEditor.setColumns(10);

		JLabel lblNumeroDePginas = new JLabel("Numero de p\u00E1ginas:");
		lblNumeroDePginas.setFont(new Font("Tahoma", Font.PLAIN, 15));

		TextNumPg = new JTextField();
		TextNumPg.setColumns(10);

		btnEnviar = new JButton("Enviar");

		textResult = new JTextField();
		textResult.setColumns(10);

		TextIDR = new JTextField();
		TextIDR.setColumns(10);





		btnIDR = new JButton("Recoger por ID");

		JButton btnRecogerTodo = new JButton("Recoger Todos");
		
		JLabel lblAutor_1 = new JLabel("Autor:");
		lblAutor_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textAutor = new JTextField();
		textAutor.setColumns(10);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSiQuiereMeter)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(297)
							.addComponent(lblLibreria))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblIdentificador)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(textID))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblTtulo, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(TextTitulo))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblEditor, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(textEditor))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblAño, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(textAño, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(lblNumeroDePginas, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(TextNumPg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblAutor_1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
									.addGap(5)
									.addComponent(textAutor, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)))
							.addGap(21)
							.addComponent(textResult, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(TextIDR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnRecogerTodo)
								.addComponent(btnIDR)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(112)
							.addComponent(btnEnviar)))
					.addContainerGap(14, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLibreria)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblSiQuiereMeter)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textResult, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
							.addGap(19))
						.addGroup(Alignment.LEADING, gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(14)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblIdentificador)
									.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(8)
										.addComponent(lblTtulo, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(TextTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGap(8)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(textAño, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblAño, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(10)
										.addComponent(lblEditor, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(9)
										.addComponent(textEditor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGap(6)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNumeroDePginas, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addComponent(TextNumPg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(1)
										.addComponent(lblAutor_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
									.addComponent(textAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(18)
								.addComponent(TextIDR, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnIDR)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnRecogerTodo))))
					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addComponent(btnEnviar))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public JButton getBtnEnviar() {
		return btnEnviar;
	}
	public void setBtnEnviar(JButton btnEnviar) {
		this.btnEnviar = btnEnviar;
	}
	public JButton getBtnIDR() {
		return btnIDR;
	}
	public void setBtnIDR(JButton btnIDR) {
		this.btnIDR = btnIDR;
	}
	public JTextField getTextID() {
		return textID;
	}
	public void setTextID(JTextField textID) {
		this.textID = textID;
	}
	public JTextField getTextTitulo() {
		return TextTitulo;
	}
	public void setTextTitulo(JTextField textTitulo) {
		TextTitulo = textTitulo;
	}
	public JTextField getTextAño() {
		return textAño;
	}
	public void setTextAño(JTextField textAño) {
		this.textAño = textAño;
	}
	public JTextField getTextEditor() {
		return textEditor;
	}
	public void setTextEditor(JTextField textEditor) {
		this.textEditor = textEditor;
	}
	public JTextField getTextNumPg() {
		return TextNumPg;
	}
	public void setTextNumPg(JTextField textNumPg) {
		TextNumPg = textNumPg;
	}
	public JTextField getTextResult() {
		return textResult;
	}
	public void setTextResult(JTextField textResult) {
		this.textResult = textResult;
	}
	public JTextField getTextIDR() {
		return TextIDR;
	}
	public void setTextIDR(JTextField textIDR) {
		TextIDR = textIDR;
	}
	public JTextField getTextAutor() {
		return textAutor;
	}
	public void setTextAutor(JTextField textAutor) {
		this.textAutor = textAutor;
	}
	
}
