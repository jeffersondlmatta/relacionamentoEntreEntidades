package manyToMany.entity;
import manyToMany.entity.modelo.Aluno;
import manyToMany.entity.modelo.Curso;
import manyToMany.entity.repositorio.AlunoRepositorio;
import manyToMany.entity.repositorio.CursoRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Arrays;

//todo criar um controller para cadastrar cursos e alunos, mostrar o obj no navegador

@SpringBootApplication
public class ManyToMany {

    public static void main(String[] args) {
        SpringApplication.run(ManyToMany.class, args);
    }
    @Bean
    public CommandLineRunner mappingDemo(AlunoRepositorio ar, CursoRepositorio cr) {
        return args -> {

            // Criar um aluno
            Aluno aluno = new Aluno();
            aluno.setAluno("Ralf");

            // Cadastrar na tabela alunos
            ar.save(aluno);

            // Criar três cursos
            Curso c1 = new Curso();
            c1.setCurso("Java - Spring Boot");

            Curso c2 = new Curso();
            c2.setCurso("Python - Flask");

            Curso c3 = new Curso();
            c3.setCurso("PHP - Laravel");

            // Cadastrar os cursos na tabela cursos
            cr.saveAll(Arrays.asList(c1, c2, c3));

            // Adicionar os primeiro e o terceiro curso no aluno
            aluno.getCursos().addAll(Arrays.asList(c1, c3));

            // Atualizar a lista de cursos do aluno
            ar.save(aluno);
        };
    }
}
