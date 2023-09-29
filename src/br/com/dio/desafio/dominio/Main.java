package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso js");
        curso1.setDescricao("curso js");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("curso java");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("menttoria de Java");
        mentoria.setDescricao("descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThiago = new Dev();
        devThiago.setNome("Thiago");
        devThiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Thiago: " + devThiago.getConteudosInscritos());
        devThiago.progredir();
        devThiago.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos Thiago: " + devThiago.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Thiago: " + devThiago.getConteudosConcluidos());
        System.out.println("XP" + devThiago.calcularTotalXp());
        System.out.println("--------------");

        Dev devPederneiras = new Dev();
        devPederneiras.setNome("Pederneiras");
        devPederneiras.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Pederneiras: " + devPederneiras.getConteudosInscritos());
        devPederneiras.progredir();
        devPederneiras.progredir();
        devPederneiras.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos Pederneiras: " + devPederneiras.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Pederneiras: " + devPederneiras.getConteudosConcluidos());
        System.out.println("XP: " + devPederneiras.calcularTotalXp());
    }
}
