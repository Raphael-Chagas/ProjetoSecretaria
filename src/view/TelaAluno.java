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
		
	    private JButton btnNovo;
	    private JButton btnSalvar;
	    private JButton btnExcluir;
	    private JButton btnLimpar;
	    
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
			
			lblNomeAluno = new JLabel("Nome do Aluno:");
			txtNomeAluno = new JTextField();
			
			lblTelefoneAluno = new JLabel("Telefone de contato:");
			txtTelefoneAluno = new JTextField();
			
			lblEmailAluno = new JLabel("email para contato:");
			txtEmailAluno = new JTextField();
			
			lblCpfResp = new JLabel("CPF do Responsável:");
			txtCpfResp = new JTextField();
			
			lblNomeResp = new JLabel("Nome do Responsável:");
			txtNomeResp = new JTextField();
			
			lblTelefoneResp = new JLabel("Telefone de contato:");
			txtTelefoneResp = new JTextField();
			
			lblEmailResp = new JLabel("email para contato:");
			txtEmailResp = new JTextField();

			painelFormulario.add(lblRm);
			painelFormulario.add(txtRm);
			painelFormulario.add(lblCpfAluno);
			painelFormulario.add(txtCpfAluno);
			painelFormulario.add(lblNomeAluno);
			painelFormulario.add(txtNomeAluno);
			painelFormulario.add(lblTelefoneAluno);
			painelFormulario.add(txtTelefoneAluno);
			painelFormulario.add(lblEmailAluno);
			painelFormulario.add(txtEmailAluno);
			
			painelFormulario.add(lblCpfResp);
			painelFormulario.add(txtCpfResp);
			painelFormulario.add(lblNomeResp);
			painelFormulario.add(txtNomeResp);
			painelFormulario.add(lblTelefoneResp);
			painelFormulario.add(txtTelefoneResp);
			painelFormulario.add(lblEmailResp);
			painelFormulario.add(txtEmailResp);
			
			add(painelFormulario, BorderLayout.NORTH);
			
			modeloTabela = new DefaultTableModel(new Object[] { "RM","CPF Aluno", "Nome Aluno", "Telefone Aluno", "Email Aluno", "CPF Responsável", "Nome Responsável", "Telefone Responśavel", "Email Responsável" }, 0) {
				private static final long serialVersionUID = 10L;
				
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			
			tabelaAlunos = new JTable(modeloTabela);
			JScrollPane scrollPane = new JScrollPane(tabelaAlunos);
			scrollPane.setBorder(BorderFactory.createTitledBorder("Lista de Registros"));
			add(scrollPane, BorderLayout.CENTER);
			
			JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
			
			btnNovo = new JButton("NOVO");
			btnSalvar = new JButton("SALVAR");
			btnExcluir = new JButton("EXCLUIR");
			btnLimpar = new JButton("LIMPAR");
			
			painelBotoes.add(btnNovo);
			painelBotoes.add(btnSalvar);
			painelBotoes.add(btnExcluir);
			painelBotoes.add(btnLimpar);
			
			add(painelBotoes, BorderLayout.SOUTH);
		}	
		
	private void configurarEventos() {
		btnNovo.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					controller.limpar();
			}
		});
		
		btnSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				controller.salvar();
			}
		});
		btnExcluir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				controller.excluir();
			}
		});
		btnLimpar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				controller.limpar();
			}
		});
		tabelaAlunos.addMouseListener(new MouseAdapter() { //addMouseListener(new java.awt.event.ActionListener() {
			public void mouseClicked(MouseEvent e) {
				controller.PreencherFormulario();
			}
		});
	}

	public JTextField getTxtRm() {
		return txtRm;
	}

	public void setTxtRm(JTextField txtRm) {
		this.txtRm = txtRm;
	}

	public JTextField getTxtCpfAluno() {
		return txtCpfAluno;
	}

	public void setTxtCpfAluno(JTextField txtCpfAluno) {
		this.txtCpfAluno = txtCpfAluno;
	}

	public JTextField getTxtNomeAluno() {
		return txtNomeAluno;
	}

	public void setTxtNomeAluno(JTextField txtNomeAluno) {
		this.txtNomeAluno = txtNomeAluno;
	}

	public JTextField getTxtTelefoneAluno() {
		return txtTelefoneAluno;
	}

	public void setTxtTelefoneAluno(JTextField txtTelefoneAluno) {
		this.txtTelefoneAluno = txtTelefoneAluno;
	}

	public JTextField getTxtEmailAluno() {
		return txtEmailAluno;
	}

	public void setTxtEmailAluno(JTextField txtEmailAluno) {
		this.txtEmailAluno = txtEmailAluno;
	}

	public JTextField getTxtCpfResp() {
		return txtCpfResp;
	}

	public void setTxtCpfResp(JTextField txtCpfResp) {
		this.txtCpfResp = txtCpfResp;
	}

	public JTextField getTxtNomeResp() {
		return txtNomeResp;
	}

	public void setTxtNomeResp(JTextField txtNomeResp) {
		this.txtNomeResp = txtNomeResp;
	}

	public JTextField getTxtTelefoneResp() {
		return txtTelefoneResp;
	}

	public void setTxtTelefoneResp(JTextField txtTelefoneResp) {
		this.txtTelefoneResp = txtTelefoneResp;
	}

	public JTextField getTxtEmailResp() {
		return txtEmailResp;
	}

	public void setTxtEmailResp(JTextField txtEmailResp) {
		this.txtEmailResp = txtEmailResp;
	}

	public JTable getTabelaAlunos() {
		return tabelaAlunos;
	}

	public void setTabelaAlunos(JTable tabelaAlunos) {
		this.tabelaAlunos = tabelaAlunos;
	}
}
