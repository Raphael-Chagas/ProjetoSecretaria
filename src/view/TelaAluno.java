package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.AlunoController;

public class TelaAluno extends JFrame {

		private static final long serialVersionUID = 10L;
		private JLabel lblRm;
		private JLabel lblCpfAluno;
		private JLabel lblNomeAluno;
		private JLabel lblTelefoneAluno;
		private JLabel lblEmailAluno;
		private JLabel lblCpfResp;
		private JLabel lblNomeResp;
		private JLabel lblTelefoneResp;
		private JLabel lblEmailResp;
		
		private JTextField txtRm;
		private JTextField txtCpfAluno;
		private JTextField txtNomeAluno;
		private JTextField txtTelefoneAluno;
		private JTextField txtEmailAluno;
		private JTextField txtCpfResp;
		private JTextField txtNomeResp;
		private JTextField txtTelefoneResp;
		private JTextField txtEmailResp;
		
		private JTable tabelaAlunos;
		private DefaultTableModel modeloTabela;
		
		private AlunoController controller;
		
		public TelaAluno() {
			setTitle("Cadastro de Alunos ETEC");
			setSize(700, 450);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new BorderLayout());
		
		criarComponentes();
		
		controller = new AlunoController(this);
		configurarEventos();
		controller.carregarTabela();
	}
		
		private void criarComponentes() {
			JPanel painelFormulario = new JPanel(new GridLayout(3, 2, 10, 10));
			painelFormulario.setBorder(BorderFactory.createTitledBorder("Dados do Aluno/Responsável"));
		
			lblRm = new JLabel("RM:");
			txtRm = new JTextField();
			txtRm.setEditable(false);
			
			lblCpfAluno = new JLabel("CPF do Aluno:");
			txtCpfAluno = new JTextField();
			
			lblNomeAluno = new JLabel("Nome do Aluno:")
		}

}
