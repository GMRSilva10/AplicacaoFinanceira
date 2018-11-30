package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class TitulosDisponiveis extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scroll;
	private JTable table;
	private JButton btnSimularInvestimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TitulosDisponiveis frame = new TitulosDisponiveis();
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
	public TitulosDisponiveis() {
		setTitle("Titulos disponiveis");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getScrollPane());
		contentPane.add(getBtnSimularInvestimento());
	}

	private JTable getTable() {
		if (table == null) {

			table = new JTable();
			table.setBorder(new LineBorder(Color.BLACK));
			table.setGridColor(Color.BLACK);
			table.setSize(450, 450);
			carregaDados();
			table.setShowGrid(true);
		}
		return table;
	}

	private JScrollPane getScrollPane() {
		if (scroll == null) {
			scroll = new JScrollPane();
			scroll.setBounds(10, 11, 414, 239);
			scroll.getViewport().setBorder(null);	
			scroll.setViewportView(getTable());
		}
		return scroll;
	}

	private void carregaDados() {
		// ModeloTabelaTitulos model = new ModeloTabelaTitulos();
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null }, },
				new String[] { "Titulo", "Vencimento", "Taxa de rendimento(% a.a)", "Valor minimo",
						"Valor unitário" }));

	}

	private JButton getBtnSimularInvestimento() {
		if (btnSimularInvestimento == null) {
			btnSimularInvestimento = new JButton("Simular Investimento");
			btnSimularInvestimento.setBounds(10, 261, 149, 23);
		}
		return btnSimularInvestimento;
	}
}
