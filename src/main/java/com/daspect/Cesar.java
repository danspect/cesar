package com.daspect;

import java.util.Random;

public class Cesar {

    public String criptografar(String mensagem, int deslocamento) {
        StringBuilder mensagemCriptografada = new StringBuilder();

        deslocamento %= 26;

        for (int i = 0; i < mensagem.length(); i++) {
            char letra = mensagem.charAt(i);
            letra += deslocamento;
            mensagemCriptografada.append((char) (letra > 'Z' ? letra - 26 : letra));
        }

        return mensagemCriptografada.toString();
    }

    public String descriptografar(String mensagemCriptografada, int deslocamento) {
        StringBuilder mensagemDescriptografada = new StringBuilder();

        deslocamento %= 26;

        for (int i = 0; i < mensagemCriptografada.length(); i++) {
            char letra = mensagemCriptografada.charAt(i);
            letra -= deslocamento;
            mensagemDescriptografada.append((char) (letra < 'A' ? letra + 26 : letra));
        }

        return mensagemDescriptografada.toString();
    }

    public String[] forcaBruta(String mensagemCriptografada) {
        String[] mensagensPossiveis = new String[27];
        for (int i = 0; i <= 26; i++) {
            mensagensPossiveis[i] = descriptografar(mensagemCriptografada, i);
        }
        return mensagensPossiveis;
    }

    public int gerarDeslocamentoAleatorio(Random random) {
        int deslocamento = random.nextInt(25) + 1;
        return deslocamento;
    }
}
