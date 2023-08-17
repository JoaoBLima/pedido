package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entidades.Cliente;
import Entidades.ItensPedido;
import Entidades.Pedido;
import Entidades.Produto;
import Entidades.Enumeradas.StatusPedido;


public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Informe os dados do Cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de Nascimento (DD/MM/YYYY): ");
		Date dataAniver = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, dataAniver);
		
		System.out.println();
		System.out.println("Informe os dados do Pedido:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, sdf, cliente);
		
		System.out.print("Quantos itens para este pedido? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Informe os dados do item "+1);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			double precoProduto = sc.nextDouble();

			Produto produto = new Produto(nomeProduto, precoProduto);

			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			ItensPedido item = new ItensPedido(quantidade, precoProduto, produto); 

			pedido.addItens(item);
		}
		
		System.out.println();
		System.out.println("RESUMO DO PEDIDO:");
		System.out.println( pedido);
		//System.out.println("status: "  + pedido.getStatus());
		//System.out.println("cliente: " +cliente);
		//System.out.println("ITENS DO PEDIDO:");
		
	
		sc.close();
	}
}