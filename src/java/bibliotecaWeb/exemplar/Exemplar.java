/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecaWeb.exemplar;

import javax.persistence.*;

/**
 *
 * @author Ana PAtrícia
 */
@Entity
public class Exemplar {
   @Id
   private String idExemplar;
   private String Status;

    public String getIdExemplar() {
        return idExemplar;
    }

    public void setIdExemplar(String idExemplar) {
        this.idExemplar = idExemplar;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
   
}
