import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertTrue;

public class ConstrucaoCasaTest {
    @Test
    public void testConstrucaoCasaMadeira() {
        ConstrucaoCasa casaMadeira = new ConstrucaoCasaMadeira();
        String resultado = casaMadeira.construirCasa();

        assertTrue(resultado.contains("Preparando terreno para construção de casa de madeira."));
        assertTrue(resultado.contains("Construindo estrutura de madeira."));
        assertTrue(resultado.contains("Realizando acabamento em uma casa de madeira."));
        assertTrue(resultado.contains("Realizando limpeza da obra."));
    }

    @Test
    public void testConstrucaoCasaConcreto() {
        ConstrucaoCasa casaConcreto = new ConstrucaoCasaConcreto();
        String resultado = casaConcreto.construirCasa();

        assertTrue(resultado.contains("Preparando terreno para construção de casa de concreto."));
        assertTrue(resultado.contains("Construindo estrutura de concreto."));
        assertTrue(resultado.contains("Realizando acabamento em uma casa de concreto."));
        assertTrue(resultado.contains("Realizando limpeza da obra."));
    }
}
