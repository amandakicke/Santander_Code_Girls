package br.dio.com.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descri��o curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("descri��o curso JavaScript");
		curso2.setCargaHoraria(4);	
						
		Mentoria mentoria= new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("descri��o mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devAmanda = new Dev();
		devAmanda.setNome("Amanda");
		devAmanda.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Amanda" + devAmanda.getConteudosInscritos());
		devAmanda.progredir();
		System.out.println("-");
		System.out.println("Conte�dos inscritos Amanda" + devAmanda.getConteudosInscritos());
		System.out.println("Conte�dos concluidos Amanda" + devAmanda.getConteudosConcluidos());	
		System.out.println("XP: " + devAmanda.calcularXp());
		System.out.println("-----------");
		devAmanda.progredir();
		System.out.println("-");
		System.out.println("Conte�dos inscritos Amanda" + devAmanda.getConteudosInscritos());
		System.out.println("Conte�dos concluidos Amanda" + devAmanda.getConteudosConcluidos());	
		System.out.println("XP: " + devAmanda.calcularXp());
		System.out.println("-----------");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Camila" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conte�dos inscritos Camila" + devCamila.getConteudosInscritos());
		System.out.println("Conte�dos concluidos Camila" + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularXp());
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conte�dos inscritos Camila" + devCamila.getConteudosInscritos());
		System.out.println("Conte�dos concluidos Camila" + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularXp());
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conte�dos inscritos Camila" + devCamila.getConteudosInscritos());
		System.out.println("Conte�dos concluidos Camila" + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularXp());
		
	}

}
