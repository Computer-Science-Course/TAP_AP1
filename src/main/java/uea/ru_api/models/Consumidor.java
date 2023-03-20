package uea.ru_api.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Consumidor {

	private Long codigo;
	private String nome;
	private LocalDate dataNasc;
	private String cpf;

	public Consumidor() {

	}

	public Consumidor(Long codigo, String nome, LocalDate dataNasc, String cpf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.cpf = cpf;
	}

}
