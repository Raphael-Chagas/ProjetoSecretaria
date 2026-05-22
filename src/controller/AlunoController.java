package controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.AlunoDAO;
import model.Aluno;
import view.TelaAluno; 

public class AlunoController {

		private TelaAluno tela;
		private AlunoDAO AlunoDAO;
		
		public AlunoController(TelaAluno tela) {
			this.tela = tela;
			this.AlunoDAO = new AlunoDAO();
		}
		
		public void salvar() {
			String cpfAluno = tela.getTxtCpfAluno().getText().trim();
			String nomeAluno = tela.getTxtNomeAluno().getText().trim();
			String telefoneAluno = tela.getTxtTelefoneAluno().getText().trim();
			String emailAluno = tela.getTxtEmailAluno().getText().trim();
			
			String cpfResponsavel = tela.getTxtCpfResp().getText().trim();
			String nomeResponsavel = tela.getTxtNomeResp().getText().trim();
			String telefoneResponsavel = tela.getTxtTelefoneResp().getText().trim();
			String emailResponsavel = tela.getTxtEmailResp().getText().trim();

			if(
					cpfAluno.isEmpty() ||
					nomeAluno.isEmpty() ||
					telefoneAluno.isEmpty() ||
					emailAluno.isEmpty() ||
					cpfResponsavel.isEmpty() ||
					nomeResponsavel.isEmpty() ||
					telefoneResponsavel.isEmpty() ||
					emailResponsavel.isEmpty()) 
			  
			  {
		            JOptionPane.showMessageDialog(
		                tela,
		                "Preencha todos os campos",
		                "Atenção",
		                JOptionPane.WARNING_MESSAGE
		            );
		            return;
		        }
		
			try {

			    String RM = tela.getTxtRm().getText().trim();

			    if (RM.isEmpty()) {

			        Aluno aluno = new Aluno(
			            cpfAluno,
			            nomeAluno,
			            telefoneAluno,
			            emailAluno,
			            cpfResponsavel,
			            nomeResponsavel,
			            telefoneResponsavel,
			            emailResponsavel
			        );

			        AlunoDAO.salvar(aluno);

			        JOptionPane.showMessageDialog(
			            tela,
			            "Cliente salvo com sucesso."
			        );

			    } else {

			        Aluno aluno = new Aluno(
			            Integer.parseInt(RM),
			            cpfAluno,
			            nomeAluno,
			            telefoneAluno,
			            emailAluno,
			            cpfResponsavel,
			            nomeResponsavel,
			            telefoneResponsavel,
			            emailResponsavel
			        );

			        AlunoDAO.atualizar(aluno);

			        JOptionPane.showMessageDialog(
			            tela,
			            "Cliente atualizado com sucesso."
			        );
			    }

			    limpar();
			    carregarTabela();
    		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(
					tela, 
					"Erro ao salvar: " + e.getMessage(),
					"Erro",
					JOptionPane.ERROR_MESSAGE
				);
			}	
		}
		
		public void excluir() {
			int linha = tela.getTabelaAlunos().getSelectedRow();
			
			if (linha == -1) {
				JOptionPane.showMessageDialog(
					tela,
					"Selecione um aluno(a) para excluir",
					"Atenção",
					JOptionPane.WARNING_MESSAGE
				);
				return;
			}
			
			int confirmacao = JOptionPane.showConfirmDialog(
				tela,
				"Deseja realmente excluir o aluno(a) selecionado(a)?",
				"Confirmação",
				JOptionPane.YES_NO_OPTION
			);
			
			if (confirmacao != JOptionPane.YES_OPTION) {
				return;
			}
			
	        try {
	            int id = Integer.parseInt(tela.getTxtRm().getText());
	            AlunoDAO.excluir(id);
	            JOptionPane.showMessageDialog(tela, "Cliente excluído com sucesso.");
	            limpar();
	            carregarTabela();
	        } catch (Exception e) {
	            JOptionPane.showMessageDialog(
	                tela,
	                "Erro ao excluir: " + e.getMessage(),
	                "Erro",
	                JOptionPane.ERROR_MESSAGE
	            );
	        }
	    }
		
		public void limpar() {
			tela.getTxtRm().setText("");
			tela.getTxtCpfAluno().setText("");
			tela.getTxtNomeAluno().setText("");
			tela.getTxtTelefoneAluno().setText("");
			tela.getTxtEmailAluno().setText("");
			tela.getTxtCpfResp().setText("");
			tela.getTxtNomeResp().setText("");
			tela.getTxtTelefoneResp().setText("");
			tela.getTxtEmailResp().setText("");
			tela.getTabelaAlunos().clearSelection();
		}
		
		public void carregarTabela() {
			DefaultTableModel modelo = (DefaultTableModel) tela.getTabelaAlunos().getModel();
			modelo.setRowCount(0);
			
			try {
				List<Aluno> alunos = AlunoDAO.listar();
				
				int a;
				for (a = 0; a < alunos.size(); a++) {
					Aluno c = alunos.get(a);
					modelo.addRow(new Object[] {
						c.getRmAluno(),
						c.getCpfAluno(),
						c.getNomeAluno(),
						c.getTelefoneAluno(),
						c.getEmailAluno(),
						c.getCpfResp(),
						c.getNomeResp(),
						c.getTelefoneResp(),
						c.getEmailResp(),
					});
				}
			}catch (Exception e) {
	            JOptionPane.showMessageDialog(
	                    tela,
	                    "Erro ao carregar tabela: " + e.getMessage(),
	                    "Erro",
	                    JOptionPane.ERROR_MESSAGE
	                );
	            }
	        }
		public void PreencherFormulario() {
	        int linha = tela.getTabelaAlunos().getSelectedRow();

	        if (linha != -1) {
	            tela.getTxtRm().setText(tela.getTabelaAlunos().getValueAt(linha, 0).toString());
	            tela.getTxtCpfAluno().setText(tela.getTabelaAlunos().getValueAt(linha, 1).toString());
	            tela.getTxtNomeAluno().setText(tela.getTabelaAlunos().getValueAt(linha, 2).toString());
	            tela.getTxtTelefoneAluno().setText(tela.getTabelaAlunos().getValueAt(linha, 3).toString());
	            tela.getTxtEmailAluno().setText(tela.getTabelaAlunos().getValueAt(linha, 4).toString());
	            tela.getTxtCpfResp().setText(tela.getTabelaAlunos().getValueAt(linha, 5).toString());
	            tela.getTxtNomeResp().setText(tela.getTabelaAlunos().getValueAt(linha, 6).toString());
	            tela.getTxtTelefoneResp().setText(tela.getTabelaAlunos().getValueAt(linha, 7).toString());
	            tela.getTxtEmailResp().setText(tela.getTabelaAlunos().getValueAt(linha, 8).toString());
	        }
		}
}


