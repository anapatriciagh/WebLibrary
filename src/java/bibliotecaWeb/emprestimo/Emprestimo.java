/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaWeb.emprestimo;

import bibliotecaWeb.exemplar.Exemplar;
import bibliotecaWeb.operador.Operador;
import bibliotecaWeb.usuario.Usuario;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Ana PAtrícia
 */
@Entity
public class Emprestimo implements Serializable {
    @Id
    @GeneratedValue
    private int idEmprestimo;
    private Date horaDataEmprestimo;
    private Date dataDevolucao;
    private Operador operador;
    private Exemplar exemplar;
    private Usuario usuario;

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Date getHoraDataEmprestimo() {
        return horaDataEmprestimo;
    }

    public void setHoraDataEmprestimo(Date horaDataEmprestimo) {
        this.horaDataEmprestimo = horaDataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
