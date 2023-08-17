package Entidades;

public class Produto {
	
	private String nomeproduto;
	private double preco;
	
	public Produto(String nomeproduto, double precoproduto) {
		super();
		this.nomeproduto = nomeproduto;
		this.preco = preco;
	}
	public String getNomeproduto() {
		return nomeproduto;
	}
	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	@Override
	public String toString() {
		return nomeproduto;  
	}
	
	
}
