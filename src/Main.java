import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Aprendizado Curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso LINUX");
        curso2.setDescricao("Aprendizado Curso LINUX");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de JAVA");
        mentoria.setDescricao("Inicio de Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Programming");
        bootcamp.setDescricao("Participe Bootcamp Java Programming");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Eric");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Inscricoes ".concat(dev.getNome()).concat(":") + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("A concluir ".concat(dev.getNome()).concat(":") + dev.getConteudosInscritos());
        System.out.println("Concluidos ".concat(dev.getNome()).concat(":") + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());

        System.out.println("-------");

        dev = new Dev();
        dev.setNome("Marisa");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Inscricoes ".concat(dev.getNome()).concat(":") + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("A concluir ".concat(dev.getNome()).concat(":") + dev.getConteudosInscritos());
        System.out.println("Concluidos ".concat(dev.getNome()).concat(":") + dev.getConteudosConcluidos());
        System.out.println("XP:" + dev.calcularTotalXp());

    }

}
