# Calculadora de Áreas de Figuras Geométricas 📐

Aplicação desenvolvida em **Java 21** para simular o cálculo automatizado de áreas de diferentes formas geométricas, aplicando conceitos fundamentais de **Orientação a Objetos (POO)** como **Interfaces**, **Abstração**, **Polimorfismo** e uso de bibliotecas nativas do Java (`Math`).

---

## 📌 Funcionalidades e Formas Suportadas

O sistema calcula a área das seguintes figuras geométricas através da implementação da interface `FiguraGeometrica`:

* **Quadrado (`Quadrado`):** Recebe a medida do lado e calcula a área ($\text{lado}^2$).
* **Retângulo (`Retangulo`):** Recebe a base e a altura e calcula a área ($\text{base} \times \text{altura}$).
* **Círculo (`Circulo`):** Recebe o raio e calcula a área ($\pi \times \text{raio}^2$), utilizando a constante de precisão `Math.PI`.

---

## 🏗️ Arquitetura do Projeto

A aplicação utiliza uma **Interface** como contrato para padronizar o método `calcularArea()` entre todas as formas geométricas:

```text
                     << Interface >>
                    FiguraGeometrica
                   (+calcularArea())
                   /       |       \
                  /        |        \
          Quadrado     Retangulo     Circulo
           (lado)    (base, altura)  (raio)

```

---

## 🧠 Conceitos Práticos Aplicados

* **Interfaces e Abstração:** Define a assinatura do método `calcularArea()`, garantindo que toda nova forma geométrica criada no sistema seja obrigada a fornecer seu próprio cálculo de área.
* **Polimorfismo:** Permite agrupar formas geométricas completamente distintas dentro de uma lista genérica `List<FiguraGeometrica>` e processar o cálculo da área de todas de forma unificada.
* **Uso da API `java.lang.Math`:** Utilização de `Math.PI` para obter a constante matemática de $\pi$ com alta precisão e `Math.pow()` para exponenciação.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 21 (JDK 21)
* **IDE Recomendada:** IntelliJ IDEA
* **Versionamento:** Git & GitHub

---

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**
```bash
git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git

```


2. **Abra o projeto no IntelliJ IDEA**.
3. **Execute a classe de teste:**
Navegue até `src/Main.java` e rode o método `main` para visualizar os cálculos de área exibidos no console para cada forma geométrica.

---

## ✒️ Autor

Desenvolvido por **[Vinicius Leandro]** durante os estudos de Java.
