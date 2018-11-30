package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SimularInvestimento extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblTitulo;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBox;
	private JLabel lblValor;
	private JTextField textField;
	private JButton btnSimular;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimularInvestimento frame = new SimularInvestimento();
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
	public SimularInvestimento() {
		setTitle("Simular investimento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblTitulo());
		contentPane.add(getComboBox());
		contentPane.add(getLblValor());
		contentPane.add(getTextField());
		contentPane.add(getBtnSimular());
		contentPane.add(getBtnCancelar());
	}
	private JLabel getLblTitulo() {
		if (lblTitulo == null) {
			lblTitulo = new JLabel("Título :");
			lblTitulo.setBounds(59, 55, 46, 14);
		}
		return lblTitulo;
	}
	@SuppressWarnings("rawtypes")
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBounds(164, 52, 210, 20);
		}
		return comboBox;
	}
	private JLabel getLblValor() {
		if (lblValor == null) {
			lblValor = new JLabel("Valor :");
			lblValor.setBounds(59, 110, 46, 14);
		}
		return lblValor;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(164, 107, 210, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnSimular() {
		if (btnSimular == null) {
			btnSimular = new JButton("Simular");
			btnSimular.setBounds(85, 209, 89, 23);
		}
		return btnSimular;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(259, 209, 89, 23);
		}
		return btnCancelar;
	}
}
