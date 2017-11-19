package br.usjt.aula15.model;

/**
 * Created by tassio on 19/11/2017.
 */
public class MovimentacaoDTO {

    double valor;
    String descricao;

    public MovimentacaoDTO(String description, double value) {
        setValor(value);
        setDescricao(description);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}