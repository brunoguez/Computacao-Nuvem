public class Usuario {
    private int id;
    private String nome;
    private String usuario;
    private String senha;
    private String email;

    public int getID() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int rcbid) {
        this.id = rcbid;
    }

    public void setNome(String rcbNome) {
        this.nome = rcbNome;
    }

    public void setUsuario(String rcbUsuario) {
        this.usuario = rcbUsuario;
    }

    public void setSenha(String rcbSenha) {
        this.senha = rcbSenha;
    }

    public void setEmail(String rcbEmail) {
        this.email = rcbEmail;
    }
}
