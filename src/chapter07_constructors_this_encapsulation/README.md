# Chapter 07 — Constructors, this e Encapsulation

Neste capítulo são apresentados conceitos fundamentais da
**Programação Orientada a Objetos em Java**, focando na criação,
inicialização e proteção de objetos.

---

## 📌 Conteúdos abordados

- Construtores
- Palavra-chave `this`
- Encapsulamento
- Modificadores de acesso (`private`, `public`)

---

## 🧱 Estrutura do capítulo

chapter07_constructors/
├── ConstructorExample.java
└── EncapsulationExample.java

---

## 🔹 Construtores

Construtores são métodos especiais utilizados para inicializar
objetos no momento de sua criação.

Principais pontos:
- Possuem o mesmo nome da classe
- Não possuem tipo de retorno
- Podem receber parâmetros
- Garantem que o objeto já nasça em um estado válido

---

## 🔹 Palavra-chave `this`

A palavra-chave `this` é utilizada para referenciar o **objeto atual**.

Ela é muito comum quando:
- Atributos possuem o mesmo nome que os parâmetros
- É necessário diferenciar variáveis de instância e variáveis locais

Exemplo conceitual:
```java
this.name = name;
```

---

## 🔹 Encapsulamento

Encapsulamento é o princípio de **proteger os dados internos** de uma classe,
permitindo acesso apenas por meio de métodos controlados.

Boas práticas:
- Atributos `private`
- Métodos `get` e `set`
- Validações dentro dos setters

---

## 🎯 Objetivo do capítulo

Ao final deste capítulo, o objetivo é:
- Criar classes bem estruturadas
- Inicializar corretamente objetos
- Aplicar encapsulamento para garantir segurança e manutenção do código
- Escrever código alinhado às boas práticas de Java
