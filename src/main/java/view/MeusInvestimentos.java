package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;

public class MeusInvestimentos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scroll;
	private JTable table;
	private JButton btnSimularInvestimento;
	private JButton btnProjetarInvestimento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MeusInvestimentos frame = new MeusInvestimentos();
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
	public MeusInvestimentos() {
		setTitle("Meus investimentos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getScrollPane());
		contentPane.add(getBtnSimularInvestimento());
		contentPane.add(getBtnProjetarInvestimento());
	}

	private JTable getTable() {
		if (table == null) {

			table = new JTable();
			table.setBorder(new LineBorder(Color.BLACK));
			table.setGridColor(Color.BLACK);
			table.setSize(450,450);
			carregaDados();
			table.setShowGrid(true);
		}
		return table;
	}

	private JScrollPane getScrollPane() {
		if(scroll == null) {
			scroll = new JScrollPane();
			scroll.setBounds(10, 11, 414, 239);
			scroll.getViewport().setBorder(null);
			scroll.setViewportView(getTable());
		}
		return scroll;
	}
	
	private void carregaDados() {
//		ModeloTabelaTitulos model = new ModeloTabelaTitulos();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Titulo", "Valor investido", "Valor atual", "Vencimento"
			}
		));  

	}
	private JButton getBtnSimularInvestimento() {
		if (btnSimularInvestimento == null) {
			btnSimularInvestimento = new JButton("Simular Investimento");
			btnSimularInvestimento.setBounds(10, 261, 149, 23);
		}
		return btnSimularInvestimento;
	}
	private JButton getBtnProjetarInvestimento() {
		if (btnProjetarInvestimento == null) {
			btnProjetarInvestimento = new JButton("Projetar investimento");
			btnProjetarInvestimento.setBounds(169, 261, 149, 23);
		}
		return btnProjetarInvestimento;
	}
}
