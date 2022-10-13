package conta;

import java.util.ArrayList;

public class Cliente extends Pessoa {

	private Integer nrConta;
	private Double saldo;

//construtor
	public Cliente() {

	}

	public Integer getNrConta() {
		return nrConta;
	}

	public void setNrConta(Integer nrConta) {
		this.nrConta = nrConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

//metodos
	public Double sacar(ArrayList<Cliente> listaClientes, Integer contaSaque, Integer saque) {
		Double saldo = 0.0;
		Double resultado = 0.0;
		
		for (Cliente c1 : listaClientes) {
			if (contaSaque.equals(c1.getNrConta())) {
				saldo = c1.getSaldo();
				resultado = saldo - saque;
				c1.setSaldo(resultado);
			}
		}

		return resultado;
	}

	public void depositar(ArrayList<Cliente> listaClientes, Integer contaDeposito, Integer deposito) {
		Double saldo = 0.0;
		Double resultado = 0.0;
		
		for (Cliente c1 : listaClientes) {
			if (contaDeposito.equals(c1.getNrConta())) {
				saldo = c1.getSaldo();
				resultado = saldo + deposito;
				c1.setSaldo(resultado);
				System.out.println("Deposito Realizado com Sucesso. Saldo Atual: " + resultado);

			}else {
				
			}
		}
	}

	public Double mostrarSaldo(String nomeCliente, ArrayList<Cliente> listaClientes) {
		Double saldo = 0.0;

		for (Cliente c1 : listaClientes) {
			if (nomeCliente.equalsIgnoreCase(c1.getNome())) {
				saldo = c1.getSaldo();

			} else {
				System.out.println(" ");
			}
		}

		return saldo;
	}

}
