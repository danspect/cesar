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

def descriptografar(mensagem_criptografada: str, deslocamento: int) -> str:
    deslocamento *= -1
    return criptografar(mensagem_criptografada, deslocamento)

def forca_bruta(mensagem_criptografada: str) -> dict[int, str]:
    alfabeto = ascii_letters

    mensagens_possiveis = {}

    for deslocamento in range(1, len(alfabeto) + 1):
        mensagens_possiveis[deslocamento] = descriptografar(mensagem_criptografada, deslocamento)

    return mensagens_possiveis


def gerar_deslocamento() -> int:
    return lambda: random.randint(1, 25)


if __name__ == "__main__":
    msg = "A cifra de cesar foi usada por Julio Cesar"
    msg_criptografada = criptografar(msg, 6)
    print(f"Mensagem criptografada: {msg_criptografada}\nDeslocamento: {6}")