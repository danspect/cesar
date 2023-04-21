package com.daspect;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import java.util.Random;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testCriptografar() {
        Cesar cesar = new Cesar();
        String mensagem = "TESTE";
        int deslocamento = 3;
        String mensagemCriptografada = cesar.criptografar(mensagem, deslocamento);
        Assertions.assertEquals("WHVWH", mensagemCriptografada);
    }

    @Test
    public void testDescriptografar() {
        Cesar cesar = new Cesar();
        String mensagemCriptografada = "WHVWH";
        int deslocamento = 3;
        String mensagemDescriptografada = cesar.descriptografar(mensagemCriptografada, deslocamento);
        Assertions.assertEquals("TESTE", mensagemDescriptografada);
    }

    @Test
    public void testForcaBruta() {
        Cesar cesar = new Cesar();
        String mensagemCriptografada = "WHVWH";
        String[] mensagensPossiveis = cesar.forcaBruta(mensagemCriptografada);
        Assertions.assertEquals("TESTE", mensagensPossiveis[3]);
    }

    @Test
    public void testGerarDeslocamentoAleatorio() {
        Cesar cesar = new Cesar();
        int deslocamento = cesar.gerarDeslocamentoAleatorio(new Random());
        Assertions.assertTrue(deslocamento >= 1 && deslocamento <= 26);
    }
}
