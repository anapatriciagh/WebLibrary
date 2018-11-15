package bibliotecaWeb.usuario;

import java.util.ArrayList;
import org.hibernate.*;

public class UsuarioDAOHibernate implements UsuarioDAO {

    private Session session;
    private Transaction transaction;

    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public void salvar(Usuario usuario) {
        this.session.save(usuario);
    }

    @Override
    public void atualizar(Usuario usuario) {
        this.session.update(usuario);
    }

    @Override
    public void excluir(Usuario usuario) {
        this.session.delete(usuario);
    }

    @Override
    public void excluirPorCpf(String cpf) {
        String hql = "delete u from Usuario u where u.cpf = :cpf";
        this.transaction = this.session.beginTransaction();
        Query consulta = this.session.createQuery(hql);
        consulta.setString("cpf", cpf);
    }

    @Override
    public Usuario carregar(String cpf) {
        return (Usuario) this.session.get(Usuario.class, cpf);
    }

    @Override
    public Usuario buscarPorLogin(String senha) {
        String hql = "select u from Usuario u where u.senha = :senha";
        Query consulta = this.session.createQuery(hql);
        consulta.setString("senha", senha);
        return (Usuario) consulta.uniqueResult();

    }
    @Override
    public Usuario buscarCpf(String cpf){
        String hql = "select u from Usuario u where u.cpf = :cpf";
        Query consulta = this.session.createQuery(hql); 
        consulta.setString("cpf", cpf);
        System.out.println(consulta.uniqueResult());
        return (Usuario) consulta.uniqueResult();
    }

    @SuppressWarnings("unchecked")
    @Override
    public ArrayList<Usuario> listar() {
        return (ArrayList<Usuario>) this.session.createCriteria(Usuario.class).list();
    }
}
