package projetoControleBancario;

public class ContaPoupanša extends Conta {

	private double ReajusteMensal;

	public ContaPoupanša() {
	}

	public ContaPoupanša(double reajusteMensal) {
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
