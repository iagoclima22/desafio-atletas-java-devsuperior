# Desafio Atletas - Java

Programa em Java que lê os dados de N atletas (nome, sexo, altura e peso) e gera um relatório com estatísticas do grupo. Projeto desenvolvido como parte do módulo **Estruturas Repetitivas** da Formação Desenvolvedor Moderno (DevSuperior).

> Este desafio é a versão em Java do desafio "Atletas" originalmente resolvido em Lógica de Programação, com o objetivo de praticar a mesma lógica utilizando a sintaxe e os recursos da linguagem Java.

## 📋 Funcionalidades

O programa lê a quantidade de atletas e, para cada um, solicita:
- Nome
- Sexo (F ou M)
- Altura (em metros)
- Peso (em kg)

Ao final, exibe um relatório com:
- Peso médio dos atletas
- Nome do atleta mais alto
- Porcentagem de homens
- Altura média das mulheres (ou uma mensagem informando que não há mulheres cadastradas)

## ✅ Validações

- **Sexo**: aceita apenas `F` ou `M`, pedindo novo valor enquanto a entrada for inválida
- **Altura**: aceita apenas valores positivos
- **Peso**: aceita apenas valores positivos

## 🖥️ Exemplo de execução

```
Qual a quantidade de atletas? 3
Digite os dados do atleta numero 1:
Nome: Carlos Silva
Sexo: M
Altura: -1.5
Valor invalido! Favor digitar um valor positivo: 0
Valor invalido! Favor digitar um valor positivo: 1.75
Peso: 84.8
Digite os dados do atleta numero 2:
Nome: Maria José
Sexo: F
Altura: 1.71
Peso: 64.5
Digite os dados do atleta numero 3:
Nome: Teresa Borges
Sexo: R
Valor invalido! Favor digitar F ou M: S
Valor invalido! Favor digitar F ou M: F
Altura: 1.65
Peso: 0
Valor invalido! Favor digitar um valor positivo: -60
Valor invalido! Favor digitar um valor positivo: 54.3

RELATÓRIO:
Peso médio dos atletas: 67.87
Atleta mais alto: Carlos Silva
Porcentagem de homens: 33.3 %
Altura média das mulheres: 1.68
```

## 🛠️ Tecnologias

- Java
- Scanner (entrada de dados via console)

## 🎯 Conceitos praticados

- Estruturas de repetição (`for`, `while`)
- Validação de entrada de dados
- Formatação de saída com `printf` (`%.2f`, `%.1f`, `%%`)
- Comparação de `char` e uso de `Locale` para padronizar separador decimal

## ▶️ Como executar

```bash
javac Main.java
java Main
```

## 📎 Origem

Desafio do módulo **Programação Moderna** — Formação Desenvolvedor Moderno, [DevSuperior](https://devsuperior.com.br).

## 👤 Autor

**Iago Lima**

[GitHub](https://github.com/iagoclima22) · [LinkedIn](https://www.linkedin.com/in/iago-lima-57124b247)
