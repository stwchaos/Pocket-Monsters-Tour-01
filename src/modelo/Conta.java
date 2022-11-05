package modelo;

import java.time.LocalDate;

import visao.Login;

public class Conta {

	public 	String name;
	private String password;
	private LocalDate dataNascimento;
	private String email;

	public String getName() {
		
		return name;
	}

	public String getPassword() {
		
		return password;
	}

	public LocalDate getDataNascimento() {
		
		return dataNascimento;
	}

	public String getEmail() {
		
		return email;
	}

}