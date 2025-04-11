package br.relacionamentoentity.relacionamentodeentity.Repositorio;


import br.relacionamentoentity.relacionamentodeentity.Modelo.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepositorio extends JpaRepository<Cargo, Long> {

}
