package org.example;

public class Recurso {

    private String nome;
    private String situacaoAcesso;

    public Recurso(String nome) {
        this.nome = nome;
    }

    public String getSituacaoAcesso() {
        return situacaoAcesso;
    }

    public void concederAcesso() {
        this.situacaoAcesso = "Acesso concedido";
    }

    public void revogarAcesso() {
        this.situacaoAcesso = "Acesso revogado";
    }
}