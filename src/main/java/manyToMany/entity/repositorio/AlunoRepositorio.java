package manyToMany.entity.repositorio;

import manyToMany.entity.modelo.Aluno;
import manyToMany.entity.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {

}
