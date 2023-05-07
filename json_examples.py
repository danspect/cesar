import json
import ceasar

msg = []
msg.append(ceasar.criptografar("Ontem teve escola", 6))
msg.append(ceasar.criptografar("Cesar foi um dos maiores generais", 3))
msg.append(ceasar.criptografar("Esse ano vou a escola para aprender a nadar", 15))

exemplos = [
    {
        1 : [ 
        {"mensagem" :  "Ontem teve escola"},
        {"mensagem_criptografada" : msg[0]},
        {"deslocamento" : 1 }
    ]},
    {
        2 : [ 
        {"mensagem" :  "Cesar foi um dos maiores generais"},
        {"mensagem_criptografada" : msg[1]},
        {"deslocamento" : 3 }
    ]},
    {
        3 : [ 
        {"mensagem" :  "Esse ano vou a escola para aprender a nadar"},
        {"mensagem_criptografada" : msg[2]},
        {"deslocamento" : 15 }
    ]}
        ]

exemplos_json = json.dumps(exemplos)

with open("mensagens_exemplos.json", "w") as f:
    f.write(exemplos_json)