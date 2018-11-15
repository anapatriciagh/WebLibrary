package bibliotecaWeb.usuario;

import java.util.ArrayList;

public interface UsuarioDAO {

    public void salvar(Usuario usuario);

    public void atualizar(Usuario usuario);

    public void excluir(Usuario usuario);

    public void excluirPorCpf(String cpf);

    public Usuario carregar(String cpf);

    public Usuario buscarPorLogin(String senha);
    
    public Usuario buscarCpf(String cpf);

    public ArrayList<Usuario> listar();
}
