package model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Conta {

    //Atributos
    @Column(name = "conta_numero")
    private Long numero;

    @Column(name = "conta_saldo")
    private Double saudo;

    //Getters and Setters
    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Double getSaudo() {
        return saudo;
    }

    public void setSaudo(Double saudo) {
        this.saudo = saudo;
    }
}
