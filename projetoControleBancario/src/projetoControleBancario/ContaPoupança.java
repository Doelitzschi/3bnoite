package projetoControleBancario;

public class ContaPoupan�a extends Conta {

	private double ReajusteMensal;

	public ContaPoupan�a() {
	}

	public ContaPoupan�a(double reajusteMensal) {
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
