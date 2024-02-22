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
	public void setRendimento(int rendimento) {
		this.rendimento = rendimento;
	}
	@Override
	public boolean sacar(float valor) {
		if (saldo < valor) {
			return false;
		}
		float saldo = super.getSaldo();
		super.setSaldo(saldo - valor);
		return true;
	}
	@Override
	public void depositar(float valor) {
		float saldo = super.getSaldo();
		super.setSaldo(saldo + valor);
	}

}
