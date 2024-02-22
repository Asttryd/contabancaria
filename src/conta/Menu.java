package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;

//import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta c1 = new ContaCorrente(1, 123, "Sabrina", 250000.0f, 100);
		
		
		boolean run = true;
		
		while (run) {
			System.out.println("------------ BANCO DO POVO ------------");
			System.out.println("Selecione a opção que deseja para continuar: ");
			System.out.println("1. Visualizar dados da conta");
			System.out.println("2. Atualizar a conta");
			System.out.println("3. Sacar dinheiro");
			System.out.println("4. Depositar dinheiro");
			System.out.println("5. Sair do programa");
			System.out.println(">>> ");
			String option = sc.nextLine();
			
			switch (option) {
			case "1":
				c1.visualizar();
				System.out.println("Por favor, aperte ENTER para retornar ao menu.");
				break;
				
			case "2":
				System.out.println("Digite o número da agência: ");
				c1.setAgencia(sc.nextInt());
				System.out.println("Digite o número da conta: ");
				c1.setNumero(sc.nextInt());
				System.out.println("Digite o tipo da conta (1. Corrente | 2. Poupança): ");
				c1.setTipo(sc.nextInt());
				sc.nextLine();
				System.out.println("Digite o nome do titular: ");
				c1.setTitular(sc.nextLine());
				System.out.println("Digite o valor da conta: ");
				c1.setSaldo(sc.nextFloat());
				System.out.println("Dados atualizados com sucesso!");
				break;
				
			case "3":
				System.out.println("Favor, digite um valor para o saque: ");
				float valorSaque = sc.nextFloat();
				if (c1.sacar(valorSaque))
					System.out.println("Saque efetuado com sucesso. O novo saldo é de: " + c1.getSaldo());
				else
					System.out.println("O saldo é insuficiente.");
				break;
				
			case "4":
				System.out.println("Favor, digite um valor para o depósito: ");
				float valorDepo = sc.nextFloat();
				c1.depositar(valorDepo);
				System.out.println("Depósito efetuado com sucesso. O novo saldo é: " + c1.getSaldo());
				break;
				
			case "5":
				run = false;
				System.out.println("Aperte ENTER para encerrar o programa.");
				break;
				
			default:
				System.err.println("Opção inválida! Aperte ENTER para retornar ao menu.");
			}
			
			if (sc.hasNextLine()) sc.nextLine();
			
			System.out.println();
		}
		
		
		System.out.println("Encerrando...");

		sc.close();
	}
	

}
