package org.example;

public class RevogarAcessoRecursoTarefa implements Tarefa {

    private Recurso recurso;

    public RevogarAcessoRecursoTarefa(Recurso recurso) {
        this.recurso = recurso;
    }

    public void executar() {
        this.recurso.revogarAcesso();
    }

    public void cancelar() {
        this.recurso.concederAcesso();
    }
}