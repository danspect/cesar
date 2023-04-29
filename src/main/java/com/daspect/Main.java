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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cesar cesar = new Cesar();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma mensagem para ser criptografada (todas as letras devem ser maiusculas): ");
        String mensagem = scanner.nextLine();
        scanner.close();

        int deslocamento = cesar.gerarDeslocamentoAleatorio(random);
        String mensagemCriptografada = cesar.criptografar(mensagem, deslocamento);

        System.out.println(
                String.format("Mensagem criptografada: %s \nDeslocamento: %d", mensagemCriptografada, deslocamento));
    }
}
