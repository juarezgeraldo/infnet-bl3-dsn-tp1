package br.edu.infnet.Usuario.controller;

import br.edu.infnet.Usuario.model.domain.Usuario;
import br.edu.infnet.Usuario.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public Collection<Usuario> listar() {
        return usuarioRepository.listar();
    }

    @GetMapping(path = {"/{id}"})
    public Usuario buscar(@PathVariable Integer id) {
        return usuarioRepository.buscar(id);
    }
}
