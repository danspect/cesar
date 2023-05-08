#!/usr/bin/python3

import ceasar

mensagem_criptografada = input("Insira a mensagem para ser descriptografada: ")
mensagens_possiveis = ceasar.forca_bruta(mensagem_criptografada)
for key, value in mensagens_possiveis.items():
    print(f"{key} : {value}")
