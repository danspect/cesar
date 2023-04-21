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

        System.out.println(String.format("Mensagem criptografada: %s \nDeslocamento: %d", mensagemCriptografada, deslocamento));
    }
}
