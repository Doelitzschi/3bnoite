package projetoControleBancario;

public class ContaPoupança extends Conta {

	private double ReajusteMensal;

	public ContaPoupança() {
	}

	public ContaPoupança(double reajusteMensal) {
		this.ReajusteMensal = reajusteMensal;
		this.setSaldo(ReajusteMensal);;
	}

	public double getReajusteMensal() {
		return ReajusteMensal;
	}

	public void setReajusteMensal(double reajusteMensal) {
		this.ReajusteMensal = reajusteMensal;
	}

	public void AtualizarSaldos() {
	}

	public void AtualizarSaldos(double reajuste) {

	}
}
