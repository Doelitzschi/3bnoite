package projetoControleBancario;

public class Movimentacao {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente(10.00);
		ContaPoupan�a cp1 = new ContaPoupan�a(50.00);
		GerenciadorContas gerenciador = new GerenciadorContas();

		Conta conta[] = new Conta[2];
		conta[0] = cc1;
		conta[1] = cp1;

		gerenciador.totalizarSaldos(conta);
	}

}
