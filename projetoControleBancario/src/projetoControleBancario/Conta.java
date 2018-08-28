package projetoControleBancario;

public abstract class Conta {

	private double saldo;

	public Conta() {

	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void creditar(double valor) {
		this.setSaldo(saldo+valor);
	}

	public void debitar (double valor) {
		this.setSaldo(saldo-valor);
	}

	public void AtualizarSaldo () {

	}


}
