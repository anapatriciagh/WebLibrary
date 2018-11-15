package bibliotecaWeb.tipoUsuario;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class TipoUsuario implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    private int codigo;

    private String descricao;

    private int qtdDiasEmprestimo;

    private int qtdPublicacoes;

    public TipoUsuario() {
    }

    public TipoUsuario(int codigo, String descricao, int qtdDiasEmprestimo,
            int qtdPublicacoes) {
        super();
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtdDiasEmprestimo = qtdDiasEmprestimo;
        this.qtdPublicacoes = qtdPublicacoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdDiasEmprestimo() {
        return qtdDiasEmprestimo;
    }

    public void setQtdDiasEmprestimo(int qtdDiasEmprestimo) {
        this.qtdDiasEmprestimo = qtdDiasEmprestimo;
    }

    public int getQtdPublicacoes() {
        return qtdPublicacoes;
    }

    public void setQtdPublicacoes(int qtdPublicacoes) {
        this.qtdPublicacoes = qtdPublicacoes;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigo;
        result = prime * result
                + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + qtdDiasEmprestimo;
        result = prime * result + qtdPublicacoes;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) obj;
        if (codigo != other.codigo) {
            return false;
        }
        if (descricao == null) {
            if (other.descricao != null) {
                return false;
            }
        } else if (!descricao.equals(other.descricao)) {
            return false;
        }
        if (qtdDiasEmprestimo != other.qtdDiasEmprestimo) {
            return false;
        }
        if (qtdPublicacoes != other.qtdPublicacoes) {
            return false;
        }
        return true;
    }

}
