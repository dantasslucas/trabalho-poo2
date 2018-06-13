package command;

public class Programa {
	public static void main(String[] args) {
		Pedido pedido1 = new Pedido("Márcio", 400.0);
		Pedido pedido2 = new Pedido("Lucas", 250.0);
		Pedido pedido3 = new Pedido("Mário", 350.0);
		
		FilaDeTrabalho fila = new FilaDeTrabalho();
		
		fila.adiciona(new PagaPedido(pedido1));
		fila.adiciona(new PagaPedido(pedido2));
		fila.adiciona(new PagaPedido(pedido3));
		fila.adiciona(new ConcluiPedido(pedido1));
		fila.adiciona(new ConcluiPedido(pedido2));
		fila.adiciona(new ConcluiPedido(pedido3));

		
		fila.processa();
	}
}
