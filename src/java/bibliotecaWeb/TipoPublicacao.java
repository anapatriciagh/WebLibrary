/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaWeb;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Ana PAtrícia
 */
@Entity
public class TipoPublicacao implements Serializable {
    @Id
    private int idPublicacao;
    private int descricao;

    public int getIdPublicacao() {
        return idPublicacao;
    }

    public void setIdPublicacao(int idPublicacao) {
        this.idPublicacao = idPublicacao;
    }

    public int getDescricao() {
        return descricao;
    }

    public void setDescricao(int descricao) {
        this.descricao = descricao;
    }
    
    
    
}
