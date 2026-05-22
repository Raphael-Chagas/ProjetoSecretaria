package controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.AlunoDAO;
import model.Responsavel;
import model.Aluno;
import view.TelaAluno; 

public class AlunoController {

		private TelaAluno tela;
		private AlunoDAO AlunoDAO;
		
		public AlunoController(TelaAluno tela) {
			this.tela = tela;
			this.alunoDAO = new AlunoDAO();
		}
		
		public void salvar() {
			String cpfAluno = tela.getTxtCpfAluno().getText().trim();
			String nomeAluno = tela.getTxtNomeAluno().getText().trim();
			String telefoneAluno = tela.getTxtTelefoneAluno().getText().trim();
			String emaiAluno = tela.getTxtEmailAluno().getText().trim();
			String cpfResponsavel = tela.getTxtNomeAluno().getText().trim();
			String nomeResponsavel = tela.getTxtNomeResp().getText().trim();
			String telefoneResponsavel = tela.getTxtTelefoneResp().getText().trim();
			String emailResponsavel = tela.getTxtEmailResp().getText().trim();

		}
}
