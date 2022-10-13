package conta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {

		String nome;
		LocalDate dataNasc;
		LocalDate dataContratacao;
		String email;
		String nomeCliente = " ";
		int ano;
		int mes;
		int dia;
		Double result;

		int opcao = 1;

		ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
		ArrayList<Cliente> listaClientes = new ArrayList<>();

		Funcionario funcionario = new Funcionario();

		funcionario.setNome("Eduardo");
		dataNasc = LocalDate.of(2001, 9, 17);
		funcionario.setDataNasc(dataNasc);
		funcionario.setEmail("eduardo@gmail.com");
		funcionario.setNrRegistro(123);
		dataContratacao = LocalDate.of(2021, 07, 15);
		funcionario.setDataContratacao(dataContratacao);
		listaFuncionarios.add(funcionario);

		Funcionario funcionario2 = new Funcionario();

		funcionario2.setNome("Jessica");
		dataNasc = LocalDate.of(2003, 06, 12);
		funcionario2.setDataNasc(dataNasc);
		funcionario2.setEmail("jessica@gmail.com");
		funcionario2.setNrRegistro(456);
		dataContratacao = LocalDate.of(2022, 07, 15);
		funcionario2.setDataContratacao(dataContratacao);
		listaFuncionarios.add(funcionario2);

		Cliente cliente = new Cliente();

		cliente.setNome("Pedro");
		dataNasc = LocalDate.of(1993, 9, 05);
		cliente.setDataNasc(dataNasc);
		cliente.setEmail("pedro@gmail.com");
		cliente.setNrConta(123123);
		cliente.setSaldo(11000.45);
		listaClientes.add(cliente);

		Cliente cliente2 = new Cliente();

		cliente2.setNome("Nicole");
		dataNasc = LocalDate.of(2002, 10, 28);
		cliente2.setDataNasc(dataNasc);
		cliente2.setEmail("nicole@gmail.com");
		cliente2.setNrConta(456456);
		cliente2.setSaldo(912.32);
		listaClientes.add(cliente2);

		Scanner s = new Scanner(System.in);

		do {
			System.out.println("********ESCOLHA UMA OPÇÃO********\n");
			System.out.println("0 - Sair");
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Mostrar Saldo");
			System.out.println("4 - Exibir Funcionários");
			System.out.println("5 - Exibir Clientes");
			System.out.println("6 - Contratar Funcionário");
			System.out.println("7 - Pedir Demissão");

			System.out.println("Digite uma opção: ");
			opcao = s.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Informe o número da conta para saque: ");
				Integer contaSaque = s.nextInt();
				System.out.println("Informe o valor para saque: ");
				Integer saque = s.nextInt();

				result = cliente.sacar(listaClientes, contaSaque, saque);
				System.out.println("Conta: " + contaSaque);
				System.out.println("Valor sacado: " + saque);
				System.out.println("Saldo atual:  " + result);

				break;
			case 2:
				System.out.println("Informe o número da conta para saque: ");
				Integer contaDeposito = s.nextInt();
				System.out.println("Informe o valor para saque: ");
				Integer deposito = s.nextInt();
				cliente.depositar(listaClientes, contaDeposito, deposito);

				break;
			case 3:

				System.out.println("Informe o nome do Cliente para visualizar o saldo:");
				nomeCliente = s.next();

				result = cliente.mostrarSaldo(nomeCliente, listaClientes);

				System.out.println("Cliente: " + nomeCliente);
				System.out.println("Saldo: " + result);
				break;
			case 4:

				System.out.println("********Listagem de Funcionarios********\n\n");

				for (Funcionario f1 : listaFuncionarios) {
					System.out.println("Nome: " + f1.getNome());
					System.out.println("Data de Nascimento: " + f1.getDataNasc());
					System.out.println("E-mail: " + f1.getEmail());
					System.out.println("Número de Registro: " + f1.getNrRegistro());
					System.out.println("Data de Contratação: " + f1.getDataContratacao());
					System.out.println(" ");

				}
				break;

			case 5:

				System.out.println("********Listagem de Clientes********\n\n");

				for (Cliente c1 : listaClientes) {
					System.out.println("Nome: " + c1.getNome());
					System.out.println("Data de Nascimento: " + c1.getDataNasc());
					System.out.println("E-mail: " + c1.getEmail());
					System.out.println("Número da Conta: " + c1.getNrConta());
					System.out.println("Saldo Bancário: " + c1.getSaldo());
					System.out.println(" ");

				}
				break;
			case 6:
				System.out.println("Informe o nome do funcionário a ser contratado");
				String nomeFuncionario = s.next();

				funcionario.serContratado(nomeFuncionario, listaFuncionarios);
				break;
			case 7:
				System.out.println("Informe o nome do funcionário demitido:");
				nomeFuncionario = s.next();

				funcionario.pedirDemissao(nomeFuncionario, listaFuncionarios);
				break;
			}

		} while (opcao != 0);
		System.out.println("Encerrando...");

		s.close();
	}

}
