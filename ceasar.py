import random
from string import ascii_letters


def criptografar(mensagem: str, deslocamento: int) -> str:
    mensagem_criptografada = ""
    alfabeto = ascii_letters

    for caractere in mensagem:
        if caractere not in alfabeto:
            mensagem_criptografada += caractere
        else:
            caractere_criptografado = (alfabeto.index(caractere) + deslocamento) % len(alfabeto)

            mensagem_criptografada += alfabeto[caractere_criptografado]

    return mensagem_criptografada


def gerar_deslocamento():
    return lambda: random.randint(1, 25)


if __name__ == "__main__":
    msg = "A cifra de cesar foi usada por Julio Cesar"
    msg_criptografada = criptografar(msg, 6)
    print(f"Mensagem criptografada: {msg_criptografada}\nDeslocamento: {6}")