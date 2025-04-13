package OneToMany.entity.controle;

import OneToMany.entity.modelo.Comentario;
import OneToMany.entity.repositorio.IComentarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comentarios")
public class ComentarioControle {

    @Autowired
    private IComentarioRepositorio comentarioRepositorio;

    @GetMapping("/listar")
    public Iterable<Comentario> listar() {
        return comentarioRepositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Comentario cadastrar(@RequestBody Comentario obj) {
        return comentarioRepositorio.save(obj);
    }
}
