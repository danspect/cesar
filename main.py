import random


def criptografar(mensagem, deslocamento):
    mensagem_criptografada = []

    for i in range(enumerate(mensagem)):
        carctere_atual = mensagem[i]

        if carctere_atual.isupper():
            mensagem_criptografada.append(
                chr((ord(carctere_atual) + deslocamento - 65) % 26 + 65))
        else:
            mensagem_criptografada += chr((ord(carctere_atual) +
                                          deslocamento - 97) % 26 + 97)

        return mensagem_criptografada.join()


def gerar_deslocamento():
    return lambda: random.randint(1, 25)
