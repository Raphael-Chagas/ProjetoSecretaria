package model;

public class Responsavel {
	
	private int cpfResp;
	private String nomeResp;
	private String telefoneResp;
	private String emailResp;
	
	public Responsavel () {}
	public Responsavel(String nomeResp, String telefoneResp, String emailResp) {
		this.nomeResp = nomeResp;
		this.telefoneResp = telefoneResp;
		this.emailResp = emailResp;
	}
	public Responsavel(int cpfResp, String nomeResp, String telefoneResp, String emailResp) {
		this.cpfResp = cpfResp;
		this.nomeResp = nomeResp;
		this.telefoneResp = telefoneResp;
		this.emailResp = emailResp;
	}
	public int getCpfResp() {
		return cpfResp;
	}
	public void setCpfResp(int cpfResp) {
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
