package Projeto;

import java.util.Date;

import utilitarios.Utils;

public class Pessoa {
	
	private static int counter = 1;
	
	private int numeroPessoa ;
	private String nome;
	private String cpf;
	private String email;
	private Date accountCreationDate;
	
	 public Pessoa() { }
	
	
	public Pessoa(String nome, String cpf, String email) {
		this.numeroPessoa = Pessoa.counter;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		 this.accountCreationDate = new Date();
		Pessoa.counter += 1;
		
	}
	
    public int getNumeroPessoa() {
        return this.numeroPessoa;
    }
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	  public Date getAccountCreationDate() {
	        return this.accountCreationDate;
	 }
	
	public String toString() {
		return "\nNome: " + this.getNome() +
				"\nCPF: " + this.getcpf() +
				"\nEmail" + this.getEmail()+
		       "\nAccount Creation Date: " + Utils.dateToString(this.getAccountCreationDate());
	}
	
	
	

}
