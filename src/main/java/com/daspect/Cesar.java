// ________  _______   ________  ________  ________     
// |\   ____\|\  ___ \ |\   ____\|\   __  \|\   __  \    
// \ \  \___|\ \   __/|\ \  \___|\ \  \|\  \ \  \|\  \   
//  \ \  \    \ \  \_|/_\ \_____  \ \   __  \ \   _  _\  
//   \ \  \____\ \  \_|\ \|____|\  \ \  \ \  \ \  \\  \| 
//    \ \_______\ \_______\____\_\  \ \__\ \__\ \__\\ _\ 
//     \|_______|\|_______|\_________\|__|\|__|\|__|\|__|
//                        \|_________|                   
// 
//
// MIT License
// 
// Copyright (c) 2023 Daniel Aspect
// 
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
// 
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.

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
