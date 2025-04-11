package br.relacionamentoentity.relacionamentodeentity.Controle;


import br.relacionamentoentity.relacionamentodeentity.Modelo.Cargo;
import br.relacionamentoentity.relacionamentodeentity.Modelo.Colaborador;
import br.relacionamentoentity.relacionamentodeentity.Repositorio.CargoRepositorio;
import br.relacionamentoentity.relacionamentodeentity.Repositorio.colaboradorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorControle {

    @Autowired
    private colaboradorRepositorio repositorio;

    @GetMapping("/listar")
    public Iterable<Colaborador> listar(){
        return repositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Colaborador cadastrar(@RequestBody Colaborador obj){
        return repositorio.save(obj);
    }

}
