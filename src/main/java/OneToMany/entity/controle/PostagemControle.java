package OneToMany.entity.controle;

import OneToMany.entity.modelo.Postagem;
import OneToMany.entity.repositorio.IPostagemRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postagens")
public class PostagemControle {
    @Autowired
    private IPostagemRepositorio postagemRepositorio;

    @GetMapping("/listar")
    public Iterable<Postagem> listar() {
        return postagemRepositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem obj) {
        return postagemRepositorio.save(obj);
    }
}
