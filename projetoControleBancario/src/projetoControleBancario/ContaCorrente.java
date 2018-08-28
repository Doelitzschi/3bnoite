package projetoControleBancario;

public class ContaCorrente extends Conta {

	private double LimiteEspecial;

	public ContaCorrente() {
	}

	public ContaCorrente(double limiteEspecial) {
		this.LimiteEspecial = limiteEspecial;
		this.setSaldo(LimiteEspecial);
	}

	public double getLimiteEspecial() {
		return LimiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		LimiteEspecial = limiteEspecial;
	}

	public void AtualizarSaldo() {

	}

	public void debitar(double valor) {
		this.setSaldo(getSaldo()-valor);
	}

}
