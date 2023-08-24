## Aula 01
### Controle de fluxo.

Controlar o fluxo é como ser o diretor do seu próprio filme de tecnologia. Você pode decidir como seu programa vai
desenrolar suas tarefas, através de comandos especiais. É como dar as cartas no jogo, escolhendo quando executar as
tarefas de forma seletiva, repetitiva ou até mesmo em casos excepcionais.

### Conseitualmente

Os controles de fluxo são operações definidas em todas as linguagens de programação, compreendendo a sua proposta
estrutural você se torna capaz de conduzir sua aplicação pelos mais variados caminhos condicionados às regras de negócio
obtidas do mundo real.

![](https://sintaxe.netlify.app/assets/fluxo-1.3a4f3e9a.png)

### Classificação
**Eles são divididos em três categorias:**

* **Estruturas condicionais**: if-else, switch-case.
* **Estruturas de repetição**: for, while, do-while.
* **Estruturas excepcionais**: try-catch-finally, throw.

### Estruturas condicionais

A Estrutura Condicional, possibilita a escolha de um grupo de ações e comportamentos a serem executadas, quando
determinadas condições são ou não satisfeitas. A Estrutura Condicional pode ser Simples ou Composta.

### Condicionais Simples

Quando ocorre uma validação de execução de fluxo, somente quando a condição for positiva, consideramos como uma
estrutura Simples, exemplo:

![](https://sintaxe.netlify.app/assets/fluxo-2.cd68203c.png)

```java
// CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 17.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}
```

## Aula 02
### Condicionais Composta

Algumas vezes, o nosso programa deverá seguir mais de uma jornada de execução, concionando a uma regra de negócio, este
cenário é denominado Estrutura Condicional Composta. Vejamos o exemplo abaixo:

![Fluxo](https://sintaxe.netlify.app/assets/fluxo-3.6bc19c11.png)

```java
// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 6;
       
       if(nota >= 7)
        System.out.println("Aprovado");

       else
        System.out.println("Reprovado");
    }
}
```

````
📌 Para fixar

Vale ressaltar aqui, que no Java, em uma condição if/else às vezes necessitamos adicionar um bloco de { },se a lógica
conter mais de uma linha.
````

## Aula 03
### Condicionais encadeadas

Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e se não (else), podemos ter uma terceira,
quarta e ou inúmeras condições.

![Fluxo encadeado](https://sintaxe.netlify.app/assets/fluxo-4.001480aa.png)

```java
// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}
```

