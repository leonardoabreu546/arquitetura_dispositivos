# Ficha de Trabalho 8

**Escola Superior de Tecnologias e Gestão**\
**Ano letivo:** 2025/2026\
**Curso:** Curso Técnico Superior Profissional em Tecnologias e
Programação de Sistemas de Informação\
**Ano/Semestre:** 2.º Ano / 1.º Semestre\
**Unidade Curricular:** Arquitetura de Dispositivos\
**Docente:** David Jardim

------------------------------------------------------------------------

## Exercícios

### 1. Criação do projeto

Crie um projeto com o nome `Ficha7`.

### 2. Menu de um jogo com tipos enumerados

Implemente um menu de um jogo usando tipos enumerados.

-   Adicione as seguintes opções:
    -   `START`
    -   `SAVEGAME`
    -   `LOADGAME`
    -   `HIGHSCORES`
    -   `QUIT`
-   Imprima todas as opções existentes no menu.
-   Utilize a instrução de seleção `IF – ELSE` para escolher uma das
    opções do menu anterior e imprima uma mensagem adequada.
-   Utilize a instrução de seleção `SWITCH` para escolher uma das opções
    do menu anterior e imprima uma mensagem adequada.

### 3. Classe `Rational`

Crie uma classe denominada `Rational`.

-   Adicione dois atributos:
    -   `numerator`: `int`
    -   `denominator`: `int`
-   Implemente a sobreposição do método `equals`.
-   Implemente a interface `Comparable<Rational>` para comparar dois
    números racionais.
-   Implemente a sobreposição do método `hashcode`.
-   Crie uma lista de números racionais e adicione várias instâncias de
    números racionais à lista.
-   Ordene a lista segundo a ordem natural, utilizando a interface
    `Comparable`.

### 4. Classe `Student`

Crie uma classe denominada `Student`.

-   Adicione dois atributos:
    -   `number`: `int`
    -   `name`: `String`
-   Implemente a sobreposição do método `equals`.
-   Implemente a interface `Comparable<Student>` para comparar dois
    alunos.
-   Implemente a sobreposição do método `hashcode`.
-   Crie uma lista de alunos e adicione várias instâncias de alunos à
    lista.
-   Ordene a lista segundo a ordem natural, utilizando a interface
    `Comparable`.
-   Implemente uma classe `StudentsComparatorByNumber` que implemente a
    interface `Comparator<Student>` e compare os alunos tendo em conta o
    seu número de aluno.
-   Implemente uma classe `StudentsComparatorByName` que implemente a
    interface `Comparator<Student>` e compare os alunos tendo em conta o
    seu nome.
-   Ordene a lista segundo a ordem natural dos nomes, utilizando a
    interface `Comparator<Student>`.

### 5. Classe `Course`

Crie uma classe denominada `Course`.

-   Adicione os seguintes atributos:
    -   `code`: `int`
    -   `name`: `String`
    -   `ects`: `int`
    -   `ano`: `int`
-   Implemente a sobreposição do método `equals`.
-   Crie um mapa (`HashMap`) de disciplinas e adicione várias instâncias
    de disciplinas ao mapa.
-   Verifique se o mapa contém uma determinada disciplina.
-   Imprima todas as chaves (`keys`) existentes no mapa.
-   Imprima todas as disciplinas (`values`) existentes no mapa.
-   Imprima todos os conjuntos (`key`, `value`) existentes no mapa.
-   Cada disciplina tem um atributo que é o ano. Para cada ano
    existente, crie uma lista que irá armazenar todas as disciplinas
    referentes a esse ano.
