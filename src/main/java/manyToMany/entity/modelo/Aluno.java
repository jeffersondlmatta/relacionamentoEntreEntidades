package manyToMany.entity.modelo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "alunos")
public class Aluno  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String aluno;

    @ManyToMany
    @JoinTable(
            name = "cursos__alunos",
            joinColumns = {@JoinColumn(name = "codigo_aluno",referencedColumnName = "codigo")},
            inverseJoinColumns = {@JoinColumn(name = "codigo_curso", referencedColumnName = "codigo")}
    )
    private List<Curso> cursos = new ArrayList<>();

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
