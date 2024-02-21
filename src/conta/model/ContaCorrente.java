package conta.model;

public class ContaCorrente extends Conta {

	private float limite;
	
	public ContaCorrente(int numero, int agencia, String titular, float saldo, int limite) {
		super(numero, agencia, 1, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float value) {
		float valorTotal = super.getSaldo() + limite;
		
		if (valorTotal < value) {
			return false;
		}
		
		float saldo = super.getSaldo();
		super.setSaldo(saldo - value);
		return true;
	}

}
