package model;

public class Aluno {

	private int rmAluno;
	private int cpfAluno;
	private String nomeAluno;
	private String telefoneAluno;
	private String emailAluno;
	
	public Aluno() {}
	public Aluno(String nomeAluno, String telefoneAluno, String emailAluno) {
		this.nomeAluno = nomeAluno;
		this.telefoneAluno = telefoneAluno;
		this.emailAluno = emailAluno;
	}
	public Aluno (int cpfAluno, String nomeAluno, String telefoneAluno, String emailAluno) {
		this.cpfAluno = cpfAluno;
		this.nomeAluno = nomeAluno;
		this.telefoneAluno = telefoneAluno;
		this.emailAluno = emailAluno;
	}
	public int getRmAluno() {
		return rmAluno;
	}
	public void setRmAluno(int rmAluno) {
		this.rmAluno = rmAluno;
	}
	public int getCpfAluno() {
		return cpfAluno;
	}
	public void setCpfAluno(int cpfAluno) {
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

	
}
