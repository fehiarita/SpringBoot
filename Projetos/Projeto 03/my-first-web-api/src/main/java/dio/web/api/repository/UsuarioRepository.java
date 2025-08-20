package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//esse Repository não utiliza o banco de dados
//imprime mensagens no console para demonstrar como funcionariam as operações de CRUD (Create, Read, Update, Delete)
@Repository
public class UsuarioRepository {

    public UsuarioRepository() {
    }

    //simula salvar um usuário no banco
    public void save(Usuario usuario) {
        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    //simula atualização de dados de um usuário
    public void update(Usuario usuario) {
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }

    //simula a remoção de um usuário pelo id
    public void remove(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    //simula listar todos os usuários
    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson", "password"));
        usuarios.add(new Usuario("frank", "masterpass"));
        return usuarios;
    }

    //simula listar os usuários por id
    public Usuario findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson", "password");
    }

    public Usuario findByusername(String username){
        System.out.println(String.format("FIND/username - Recebendo o %s para localizar o usuário.", username));
        return new Usuario("gleyson","password");
    }

}
