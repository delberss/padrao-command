package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretariaTest {
    private Secretaria secretaria;
    private Recurso recurso;

    @BeforeEach
    void setUp() {
        secretaria = new Secretaria();
        recurso = new Recurso("Laboratório de Informática");
    }

    @Test
    void deveConcederAcessoRecurso() {
        Tarefa concederAcesso = new ConcederAcessoRecursoTarefa(recurso);
        secretaria.executarTarefa(concederAcesso);

        assertEquals("Acesso concedido", recurso.getSituacaoAcesso());
    }

    @Test
    void deveRevogarAcessoRecurso() {
        Tarefa revogarAcesso = new RevogarAcessoRecursoTarefa(recurso);
        secretaria.executarTarefa(revogarAcesso);

        assertEquals("Acesso revogado", recurso.getSituacaoAcesso());
    }

    @Test
    void deveCancelarRevogacaoAcessoRecurso() {
        Tarefa concederAcesso = new ConcederAcessoRecursoTarefa(recurso);
        Tarefa revogarAcesso = new RevogarAcessoRecursoTarefa(recurso);

        secretaria.executarTarefa(concederAcesso);
        secretaria.executarTarefa(revogarAcesso);
        
        secretaria.cancelarUltimaTarefa();

        assertEquals("Acesso concedido", recurso.getSituacaoAcesso());
    }
}