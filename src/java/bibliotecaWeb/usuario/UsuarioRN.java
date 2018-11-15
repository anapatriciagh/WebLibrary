package bibliotecaWeb.usuario;

import java.util.ArrayList;

import bibliotecaWeb.util.DAOFactory;

public class UsuarioRN {

    private UsuarioDAO usuarioDAO;

    public UsuarioRN() {
        this.usuarioDAO = DAOFactory.criarUsuarioDAO();
    }

    public Usuario carregar(String cpf) {
        return this.usuarioDAO.carregar(cpf);
    }

    public void salvar(Usuario usuario) {
        Usuario usuario1;
        usuario1 = usuarioDAO.buscarCpf(usuario.getCpf());
        if (usuario != usuario1){
            this.usuarioDAO.salvar(usuario);
        } else{
            this.usuarioDAO.atualizar(usuario);
        }
    }

    public void excluir(Usuario usuario) {
        this.usuarioDAO.excluir(usuario);
    }

    public ArrayList<Usuario> listar() {
        return this.usuarioDAO.listar();
    }

    public void excluirPorCpf(String cpf) {
        this.usuarioDAO.excluirPorCpf(cpf);
    }
}
