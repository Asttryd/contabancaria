package conta.model;

public class ContaPoupanca extends Conta {

	private int aniversario;
	
	public ContaPoupanca(int numero, int agencia, String titular, float saldo, int aniversario) {
		super(numero, agencia, 2, titular, saldo);
		this.aniversario = aniversario;
	}
	public int getAniversario() {
		return aniversario;
	}
	public void setAniversario(int rendimento) {
		this.aniversario = rendimento;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listarTodas() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cadastrar(Conta conta) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transferir(int numroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}

}
