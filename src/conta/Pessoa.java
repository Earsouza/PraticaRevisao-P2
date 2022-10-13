package conta;

import java.time.LocalDate;

public abstract class Pessoa {

	private String nome;
	private LocalDate dataNasc;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc2) {
		this.dataNasc = dataNasc2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
