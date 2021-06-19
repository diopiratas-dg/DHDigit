package br.com.digitalhouse.aula.java.classes;

import br.com.digitalhouse.aula.java.interfaces.Animal;

import java.util.Objects;

public class Cachorro extends Animal {
    private String raca;
    private String cor;
    private String tamanho;
    private Integer idade;
    private String tipoPelagem;
    private Double peso;
    private String nome;
    private String pedrigree;

    @Override
    public String toString() {
        return "Dog{" +
                "race='" + raca + '\'' +
                ", color='" + cor + '\'' +
                ", size='" + tamanho + '\'' +
                ", age=" + idade +
                ", fur='" + tipoPelagem + '\'' +
                ", weight=" + peso +
                ", name='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object objeto){
        if (this == objeto){
            return true;
        }else if (objeto == null || getClass() != objeto.getClass()){
            return false;
        }
        Cachorro objetoCachorro = (Cachorro) objeto;
        return Objects.equals(raca, objetoCachorro.raca) &&
                Objects.equals(idade, objetoCachorro.idade) &&
                Objects.equals(tamanho, objetoCachorro.tamanho);
    }

    private String latir(){
        return "latiu";
    }

    @Override
    public boolean comer(){
        boolean come = false;
        if (peso > 10.0){
            come = true;
        }

        return come;
    }

    private boolean morder(){
        boolean morde = false;
        if (tipoPelagem != null && raca.equals("Poodle")){
            morde = true;
        }

        return morde;
    }

    private void setPedrigree(){
        if (this.tipoPelagem.equals("Curta") && this.idade < 20){
            this.pedrigree = "Bom";
        }
    }

    public boolean brincar(){
        boolean brinca = true;
        if (morder()){
            brinca = false;
        }

        return brinca;
    }

    public boolean correr(){
        return  false;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}