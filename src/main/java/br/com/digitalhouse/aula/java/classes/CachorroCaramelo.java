package br.com.digitalhouse.aula.java.classes;

public class CachorroCaramelo extends Cachorro{
    boolean comeTudo = false;
    String bairro = "";

    public boolean correr(){
        return true;
    }

    public boolean isComeTudo() {
        return comeTudo;
    }

    public void setComeTudo(boolean comeTudo) {
        this.comeTudo = comeTudo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}