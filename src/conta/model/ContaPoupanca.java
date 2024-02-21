package conta.model;

public class ContaPoupanca extends Conta {

	private int rendimento;
	
	public ContaPoupanca(int numero, int agencia, String titular, float saldo, int rendimento) {
		super(numero, agencia, 2, titular, saldo);
		this.rendimento = rendimento;
	}
	public int getRendimento() {
		return rendimento;
	}
	public void setRendimento(int poupanca) {
		this.rendimento = poupanca;
	}

}
