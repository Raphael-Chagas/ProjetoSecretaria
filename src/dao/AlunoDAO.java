package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;
import util.Conexao;

public class AlunoDAO {

    public void salvar(Aluno aluno) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "INSERT INTO aluno (cpf_aluno, nome_aluno, telefone_aluno email_aluno, cpf_resp, nome_resp, telefone_resp, email_resp) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getCpfAluno());
            stmt.setString(2, aluno.getNomeAluno());
            stmt.setString(3, aluno.getTelefoneAluno());
            stmt.setString(4, aluno.getEmailResp());
            stmt.setString(5, aluno.getCpfResp());
            stmt.setString(6, aluno.getNomeResp());
            stmt.setString(7, aluno.getTelefoneResp());
            stmt.setString(8, aluno.getEmailResp());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar cliente: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void atualizar(Aluno aluno) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE cliente SET nome = ?, email = ? WHERE id = ?";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, aluno.getCpfAluno());
            stmt.setString(2, aluno.getNomeAluno());
            stmt.setString(3, aluno.getTelefoneAluno());
            stmt.setString(4, aluno.getEmailResp());
            stmt.setString(5, aluno.getCpfResp());
            stmt.setString(6, aluno.getNomeResp());
            stmt.setString(7, aluno.getTelefoneResp());
            stmt.setString(8, aluno.getEmailResp());
            stmt.setInt(9, aluno.getRmAluno());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar cliente: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void excluir(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM cliente WHERE id = ?";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir cliente: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Aluno> listar() {
        List<Aluno> lista = new ArrayList<Aluno>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT id, nome, email FROM cliente ORDER BY id DESC";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setRmAluno(rs.getInt("RM"));
                aluno.setCpfAluno(rs.getString("CPF"));
                aluno.setNomeAluno(rs.getString("nome"));
                aluno.setTelefoneAluno(rs.getString("telefone"));
                aluno.setEmailAluno(rs.getString("email"));
                

                aluno.setCpfResp(rs.getString("CPF do responsável"));
                aluno.setNomeResp(rs.getString("nome do responsável"));
                aluno.setTelefoneResp(rs.getString("telefone do responsável"));
                aluno.setEmailResp(rs.getString("email do responsável"));
                lista.add(aluno);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar clientes: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return lista;
    }
}
