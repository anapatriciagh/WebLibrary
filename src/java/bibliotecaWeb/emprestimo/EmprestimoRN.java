/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaWeb.emprestimo;

import bibliotecaWeb.util.DAOFactory;

/**
 *
 * @author Ana PAtrícia
 */
public class EmprestimoRN {
    EmprestimoDAO emprestimoDAO;
    public  EmprestimoRN(){
        this.emprestimoDAO = DAOFactory.criarEmprestimoDAO();
    }
}
