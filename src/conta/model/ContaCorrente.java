package conta.model;

public class ContaCorrente extends Conta {

	private float limite;
	
	public ContaCorrente(int gerarNumero, int agencia, int tipo, String titular, float saldo, float limite2) {
		super(gerarNumero, agencia, tipo, titular, saldo);
		this.limite = limite2;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	//Método SACAR DINHEIRO
	@Override
    public boolean sacar(float valor) {
    	
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
    }

	//Método VISUALIZAR DADOS DA CONTA
    @Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}

}
