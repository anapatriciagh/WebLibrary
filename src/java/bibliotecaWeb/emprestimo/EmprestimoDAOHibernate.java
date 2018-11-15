/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaWeb.emprestimo;

import org.hibernate.*;

/**
 *
 * @author Ana PAtrícia
 */
public class EmprestimoDAOHibernate implements EmprestimoDAO{
    Session session = null;
     public void setSession(Session session) {
        this.session = session;
    }
    public  void salvar(Emprestimo emprestimo){
          this.session.save(emprestimo);
    }

}
