package br.com.digitalhouse.aula.java.classes;

public class CachorroGourmet extends Cachorro{
    Double valor;
    String certificadoPedrigree;

    public boolean tomaBanhoSozinho(){
        return true;
    }

    public boolean buscaJornal(){
        return true;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getCertificadoPedrigree() {
        return certificadoPedrigree;
    }

    public void setCertificadoPedrigree(String certificadoPedrigree) {
        this.certificadoPedrigree = certificadoPedrigree;
    }
}