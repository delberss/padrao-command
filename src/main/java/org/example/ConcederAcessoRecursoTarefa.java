package org.example;

public class ConcederAcessoRecursoTarefa implements Tarefa {

    private Recurso recurso;

    public ConcederAcessoRecursoTarefa(Recurso recurso) {
        this.recurso = recurso;
    }

    public void executar() {
        this.recurso.concederAcesso();
    }

    public void cancelar() {
        this.recurso.revogarAcesso();
    }
}