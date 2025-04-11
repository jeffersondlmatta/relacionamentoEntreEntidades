package br.relacionamentoentity.relacionamentodeentity.Controle;


import br.relacionamentoentity.relacionamentodeentity.Modelo.Cargo;
import br.relacionamentoentity.relacionamentodeentity.Repositorio.CargoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cargos")
public class Cargocontrole {

    @Autowired
    private CargoRepositorio cargo_repositorio;

    @GetMapping("/listar")
    public Iterable<Cargo> listar(){
        return cargo_repositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Cargo cadastrar(@RequestBody Cargo obj){
        return cargo_repositorio.save(obj);
    }

}
