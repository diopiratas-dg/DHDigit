package br.com.digitalhouse.aula.java.classes;

import br.com.digitalhouse.aula.java.interfaces.Saude;

public class Humano implements Saude {
    private Integer peso;
    private String nome;
    private Double massaCorporal;

    @Override
    public boolean isHealty() {
        if (massaCorporal < 87.2 && peso > 98){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Integer verificarIndiceGlicemia() {
        return null;
    }

    @Override
    public Double retornoPeso() {
        return null;
    }
}
