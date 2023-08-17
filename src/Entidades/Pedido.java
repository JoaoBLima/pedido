package Entidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entidades.Enumeradas.StatusPedido;

public class Pedido {
	private Date momento;
	private StatusPedido status;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Cliente cliente;
	private List<ItensPedido> itens = new ArrayList<>();
	
	

	public Pedido(Date momento, StatusPedido status, SimpleDateFormat sdf, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.sdf = sdf;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItensPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItensPedido> itens) {
		this.itens = itens;
	}
	public List<ItensPedido> getitens() {
		return itens;
	}
	
	public void addItens(ItensPedido Iten) {
		itens.add(Iten);
		
	}
	
	public void RemoveItens(ItensPedido Iten) {
		itens.remove(Iten);
		
	}
	public double total() {
		double soma = 0.0;
		for(ItensPedido p :itens) {
			soma += p.subtotal();
		}
		return soma;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("\n Itens do Pedido:\n");
		for (ItensPedido item : itens) {
			sb.append(item.getProduto() + "\n");
		}
		sb.append("Valor Total: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}
