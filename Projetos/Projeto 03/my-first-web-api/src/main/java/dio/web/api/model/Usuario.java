package dio.web.api.model;

//Usuário é uma entidade que tem no banco de dados
public class Usuario {
    private Integer id;
    private String login;
    private String password;

    public Usuario(){}

    //método para associar login e password que vem de outro lugar com as variáveis dessa classe usuário
    public Usuario(String login, String password){
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
