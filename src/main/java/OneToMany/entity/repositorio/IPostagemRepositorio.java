package OneToMany.entity.repositorio;


import OneToMany.entity.modelo.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostagemRepositorio extends JpaRepository<Postagem, Long> {

}
