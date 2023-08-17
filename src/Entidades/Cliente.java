package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date datanascimento;
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Cliente(String nome, String email, Date datanascimento) {
		super();
		this.nome = nome;
		this.email = email;
		this.datanascimento = datanascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
	
	
	@Override
	public String toString() {
		return nome + " (" + sdf.format(datanascimento) + ") - " + email;
	}
}
