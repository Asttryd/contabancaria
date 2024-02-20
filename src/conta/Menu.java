package conta;

import conta.model.Conta;

//import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
//		System.out.println(Cores.Cores());
		Conta c1 = new Conta(1, 123, 1, "Sabrina", 250000.0f);
		
		c1.visualizar();
		c1.setAgencia(456);
		System.out.println(c1.getAgencia());
		
		if (c1.sacar(100))
			System.out.println("Saque efetuado com sucesso. O novo saldo é de: " + c1.getSaldo());
		else
			System.out.println("O saldo é insuficiente.");
		
		c1.depositar(400);
		System.out.println("Depósito efetuado com sucesso. O novo saldo é: " + c1.getSaldo());
		
		
	}

}
