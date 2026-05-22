package model;

public class Aluno {

	private int rmAluno;
	private String cpfAluno;
	private String nomeAluno;
	private String telefoneAluno;
	private String emailAluno;
	private String cpfResp;
	private String nomeResp;
	private String telefoneResp;
	private String emailResp;
	
	public Aluno() {}
	public Aluno (String cpfAluno, String nomeAluno, String telefoneAluno, String emailAluno, String cpfResp, String nomeResp, String telefoneResp, String emailResp) {
		this.cpfAluno = cpfAluno;
		this.nomeAluno = nomeAluno;
		this.telefoneAluno = telefoneAluno;
		this.emailAluno = emailAluno;
		this.cpfResp = cpfResp;
		this.nomeResp = nomeResp;
		this.telefoneResp = telefoneResp;
		this.emailResp = emailResp;
	}
	public Aluno (int rmAluno, String cpfAluno, String nomeAluno, String telefoneAluno, String emailAluno, String cpfResp, String nomeResp, String telefoneResp, String emailResp) {
		this.rmAluno = rmAluno;
		this.cpfAluno = cpfAluno;
		this.nomeAluno = nomeAluno;
		this.telefoneAluno = telefoneAluno;
		this.emailAluno = emailAluno;
		this.cpfResp = cpfResp;
		this.nomeResp = nomeResp;
		this.telefoneResp = telefoneResp;
		this.emailResp = emailResp;
	}
	public int getRmAluno() {
		return rmAluno;
	}
	public void setRmAluno(int rmAluno) {
		this.rmAluno = rmAluno;
	}
	public String getCpfAluno() {
		return cpfAluno;
	}
	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getTelefoneAluno() {
		return telefoneAluno;
	}
	public void setTelefoneAluno(String telefoneAluno) {
		this.telefoneAluno = telefoneAluno;
	}
	public String getEmailAluno() {
		return emailAluno;
	}
	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}
	public String getCpfResp() {
		return cpfResp;
	}
	public void setCpfResp(String cpfResp) {
		this.cpfResp = cpfResp;
	}
	public String getNomeResp() {
		return nomeResp;
	}
	public void setNomeResp(String nomeResp) {
		this.nomeResp = nomeResp;
	}
	public String getTelefoneResp() {
		return telefoneResp;
	}
	public void setTelefoneResp(String telefoneResp) {
		this.telefoneResp = telefoneResp;
	}
	public String getEmailResp() {
		return emailResp;
	}
	public void setEmailResp(String emailResp) {
		this.emailResp = emailResp;
	}
	
}
