package bibliotecaWeb.util;

import bibliotecaWeb.emprestimo.EmprestimoDAO;
import bibliotecaWeb.emprestimo.EmprestimoDAOHibernate;
import bibliotecaWeb.usuario.UsuarioDAO;
import bibliotecaWeb.usuario.UsuarioDAOHibernate;

public class DAOFactory {

    public static UsuarioDAO criarUsuarioDAO() {
        UsuarioDAOHibernate usuarioDAOHibernate = new UsuarioDAOHibernate();
        usuarioDAOHibernate.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return usuarioDAOHibernate;
    }
    public static EmprestimoDAO criarEmprestimoDAO() {
        EmprestimoDAOHibernate emprestimoDAOHibernate = new EmprestimoDAOHibernate();
        emprestimoDAOHibernate.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return emprestimoDAOHibernate;
    }
}
