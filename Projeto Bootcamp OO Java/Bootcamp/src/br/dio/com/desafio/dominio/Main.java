package br.dio.com.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descri??o curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("descri??o curso JavaScript");
		curso2.setCargaHoraria(4);	
		
		Mentoria mentoria= new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descri??o mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	}

}
