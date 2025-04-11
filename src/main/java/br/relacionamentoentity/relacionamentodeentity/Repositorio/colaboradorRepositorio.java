package br.relacionamentoentity.relacionamentodeentity.Repositorio;

import br.relacionamentoentity.relacionamentodeentity.Modelo.Colaborador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface colaboradorRepositorio extends JpaRepository<Colaborador,Long> {

}
