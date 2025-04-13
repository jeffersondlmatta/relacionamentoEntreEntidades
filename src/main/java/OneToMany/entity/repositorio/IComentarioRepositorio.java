package OneToMany.entity.repositorio;

import OneToMany.entity.modelo.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComentarioRepositorio extends JpaRepository<Comentario, Long> {
}
