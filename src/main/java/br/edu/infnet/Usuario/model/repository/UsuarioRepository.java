package br.edu.infnet.Usuario.model.repository;

import br.edu.infnet.Usuario.model.domain.Usuario;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class UsuarioRepository {
    private HashMap<Integer, Usuario> usuarioHashMap;
    private static int ids = 4;

    public UsuarioRepository() {
        this.usuarioHashMap = new HashMap<>();
        this.usuarioHashMap.put(1, new Usuario(1, "Juarez Silva", "juarez@mail.com", true));
        this.usuarioHashMap.put(2, new Usuario(2, "Maria Maria", "maria@mail.com", false));
        this.usuarioHashMap.put(3, new Usuario(3, "Pedro Jose", "pdero@mail.com", true));
    }

    public Collection<Usuario> listar(){
        return usuarioHashMap.values();
    }

    public Usuario buscar(Integer id){
        return usuarioHashMap.get(id);
    }
}
