import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("test");
        curso1.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Curso Java");
        mentoria.setDescricao("test");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);


    }
}