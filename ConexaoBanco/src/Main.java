public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Hello, World!");
        Usuario u = new Usuario();
        u.setNome("Eduardo 999");
        u.setUsuario("etda99");
        u.setSenha("123001");
        u.setEmail("etdacorp999@gmail.com");
        new UsuarioDAO().cadastrarUsuario(u);
        System.out.println(new String(u.getNome().toString()));//, u.getUsuario().toString(), u.getSenha().toString(), u.getEmail().toString());
    }
}