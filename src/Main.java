import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("curso1");
        curso1.setCargaHoraria(50);

        curso2.setTitulo("Curso Python");
        curso2.setDescricao("curso2");
        curso2.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Curso Java");
        mentoria.setDescricao("test");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Java");
        bootcamp.setDecricao("Bootcamp de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        Dev dev2 = new Dev();


        dev1.setNome("Henrique");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos " + dev1.getConteudosInscritos() );
        System.out.println(dev1.getConteudoConcluido() );
        System.out.println("XP:" + dev1.calcularTotalXp());



    }
}