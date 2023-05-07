# CIFRA DE CESAR

A cifra de Cesar é um dos métodos mais simples e antigos de criptografia, que consiste em substituir cada letra de uma mensagem por outra que se encontra um número fixo de posições à direita ou à esquerda no alfabeto. Por exemplo, se usarmos uma cifra de Cesar com deslocamento de 3 posições à direita, a letra A seria substituída por D, a letra B por E, e assim por diante. A mensagem original é chamada de texto claro, e a mensagem criptografada é chamada de texto cifrado.

A cifra de Cesar foi usada pelo imperador romano Júlio Cesar para comunicar-se com os seus generais durante as campanhas militares. Ele escolheu um deslocamento de 3 posições porque era fácil de lembrar e difícil de decifrar para quem não conhecesse a chave. No entanto, hoje em dia essa cifra é considerada muito fraca, pois existem apenas 26 possibilidades de deslocamento (no caso do alfabeto latino), e é fácil testar todas elas até encontrar o texto claro.

Esta implementação tem como objetivo demonstrar como essa cifra funciona e como é possivel quebra-la de uma forma muito simples.

# FORMA MATEMÁTICA

A cifra de César pode ser representada matematicamente desta maneira:
```
C = (l + d) mod 26
```
Onde **C** é o caractere resultante, **l** é o carctere original e **d** é o deslocamento. A aritmética modular é necessária neste contexto pois caso o caractere resultante seja maior que a quantidade de letras no alfabeto não haverá como criptografar a mensagem.
</br>
Para descriptografar a mensagem usamos a seguinte fórmula:
```
C = (l - d) mod 26
```