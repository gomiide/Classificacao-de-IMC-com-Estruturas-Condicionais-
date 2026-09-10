# Classificação de IMC com Estruturas Condicionais

Programa em Java que calcula o Índice de Massa Corporal (IMC) de uma pessoa e realiza sua classificação de acordo com uma tabela de referência, utilizando as estruturas condicionais **Switch** (para o gênero) e **If** (para a classificação do IMC).

Trabalho desenvolvido para a disciplina, seguindo o modelo enxuto de código (sem classes, sem `public static void main`), utilizando `IO.readln` e `IO.println` para entrada e saída de dados.

## Integrantes do grupo

| Nome completo | RA |
|---|---|
| Thiago Corrêa Medeiros | 1134836 |
| Vitor Gomide | 1140037 |
| Adrian Augusto Munaretti de Lemos | 1139696 |

## Divisão do trabalho

- **Thiago Corrêa Medeiros**: leitura de dados do usuário (nome, gênero, altura, peso), cálculo do IMC e implementação do `switch` para verificação do gênero.
- **Vitor Gomide**: implementação da lógica de classificação do IMC com estruturas `if / else if / else`, conforme a tabela de referência, para os gêneros Masculino e Feminino.
- **Adrian Augusto Munaretti de Lemos**: apoio na definição da lógica de classificação e revisão do funcionamento do programa.

## Como executar

O programa foi feito no formato de arquivo-fonte único do Java, podendo ser executado diretamente sem necessidade de compilação manual:

```
java CalculadoraIMC.java
```

O programa vai solicitar, em sequência:
- Nome
- Gênero (M: masculino, F: feminino, N: prefiro não informar)
- Altura (em metros, ex: 1.75)
- Peso (em quilos, ex: 70.5)

E ao final exibirá o IMC calculado e a classificação correspondente.

## Tabela de classificação utilizada

| Classificação | Masculino | Feminino |
|---|---|---|
| Obesidade Mórbida | ≥ 40 | ≥ 39 |
| Obesidade Moderada | 30 a 39,9 | 29 a 38,9 |
| Obesidade Leve | 25 a 29,9 | 24 a 28,9 |
| Normal | 20 a 24,9 | 19 a 23,9 |
| Abaixo do Normal | < 20 | < 19 |

> Observação: para o gênero "N" (prefiro não informar), o programa utiliza os valores da coluna Feminino, conforme especificado no enunciado da atividade.