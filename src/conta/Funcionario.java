package conta;

import java.time.LocalDate;
import java.util.ArrayList;

public class Funcionario extends Pessoa {

	private Integer nrRegistro;
	private LocalDate dataContratacao;

//construtor
	public Funcionario() {

	}

	public Integer getNrRegistro() {
		return nrRegistro;
	}

	public void setNrRegistro(Integer nrRegistro) {
		this.nrRegistro = nrRegistro;
	}

	public LocalDate getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(LocalDate dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

//metodos
	public void pedirDemissao(String nomeFuncionario, ArrayList<Funcionario> listaFuncionarios) {

		for (Funcionario f1 : listaFuncionarios) {
			if (nomeFuncionario.equalsIgnoreCase(f1.getNome())) {
				System.out.println("Funcionário Demitido");
			} else {
				System.out.println(" ");
			}
		}
	}

	public void serContratado(String nomeFuncionario, ArrayList<Funcionario> listaFuncionarios) {
		for (Funcionario f1 : listaFuncionarios) {
			if (nomeFuncionario.equalsIgnoreCase(f1.getNome())) {
				System.out.println("Funcionário Contratado");
			} else {
				System.out.println(" ");
			}
		}
	}

}
