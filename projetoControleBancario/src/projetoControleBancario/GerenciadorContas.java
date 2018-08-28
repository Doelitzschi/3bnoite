package projetoControleBancario;

public class GerenciadorContas {

	public GerenciadorContas() {	
	}
	private double SaldoTotal;


	public GerenciadorContas(double saldoTotal) {
		this.SaldoTotal = saldoTotal;
	}

	public double getSaldoTotal() {
		return SaldoTotal;
	}


	public void setSaldoTotal(double saldoTotal) {
		this.SaldoTotal = saldoTotal;
	}


	public void totalizarSaldos(Conta conta[]) {
		this.setSaldoTotal(0.0);

		for(int i=0; i<conta.length; i++) {
			System.out.println("\n Conta: "+ conta[i].getClass().getName()+
					"\n Saldo da Conta: "+ conta[i].getSaldo());
			SaldoTotal = SaldoTotal+conta[i].getSaldo();
		}
		System.out.println("\n Total do Saldo: "+this.getSaldoTotal());
	}
}
