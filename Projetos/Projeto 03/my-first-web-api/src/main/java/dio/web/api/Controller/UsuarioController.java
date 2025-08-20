package dio.web.api.Controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//da um direcionamento para a aplicação
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/users")
    public List<Usuario> getUser(){
        return repository.findAll();
    }

    @GetMapping("/user/{username}")
    public Usuario getOneUser(@PathVariable("username") String username){
        return repository.findByusername(username);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.remove(id);
    }

    @PostMapping("/user/{usuario}")
    public void postUser(@PathVariable("usuario") Usuario usuario){
        repository.save(usuario);
    }

    @PostMapping("/users/save")
    public void saveUser(@RequestBody Usuario usuario){ /// o RequestBody utilizado aqui 
        repository.save(usuario);
    }
}
