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
// controlefluxocondicional.CaixaEletronico.java
public class controlefluxocondicional.CaixaEletronico {
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
// controlefluxocondicional.ResultadoEscolar.java
public class controlefluxocondicional.ResultadoEscolar {
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
// controlefluxocondicional.ResultadoEscolar.java
public class controlefluxocondicional.ResultadoEscolar {
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

## Aula 04
### Condição ternária

Como vimos em operadores, podemos abreviar nosso algoritmo condicional, refatorando com o conceito de operador ternário.
Vamos refatorar os exemplos acima, para ilustrar o poder deste recurso:

```java
// Cenário 1
public class controlefluxocondicional.ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
}
```
```java
// Cenário 2
public class controlefluxocondicional.ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
```

````
🔔 Atenção

A condição ternária aparenta representar um fluxo condicional, porém sua principal finalidade é atribuição condicional.
````

## Aula 05
### Switch Case

A estrutura `switch`, compara o valor de cada caso, com o da variável sequencialmente e sempre que encontra um valor 
correspondente, executa o código associado ao caso. Para evitar que as comparações continuem a ser executadas, após um
caso correspondente ter sido encontrado, acrescentamos o comando `break` no final de cada bloco de códigos. O comando
`break`, quando executado, encerra a execução da estrutura onde ele se encontra.

Vamos imaginar que precisamos imprimir uma medida, com base em mapa de valores, exemplo:

| Sigla | Medida   |
|-------|----------|
| P     | PEQUENO  |
| M     | MÉDIO    |
| G     | GRANDE   |

```java
// SistemaMedida.java

// Modo condicional if/else
public class SistemaMedida {
public static void main(String[] args) {
String sigla = "M";

		if(sigla == "P")
			System.out.println("PEQUENO");
		else if(sigla == "M")
			System.out.println("MÉDIO");
		else if(sigla == "G")
			System.out.println("GRANDE");
		else
			System.out.println("INDEFINIDO");
			
		
	}
}
```
```java
// SistemaMedida.java

// Modo condicional switch / case
public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		
	}
}
```
````
🚨 Cuidado

Observe que a nível de sintaxe, não tivemos nenhum ganho quanto a redução de códigos e ainda tivemos mais uma
preocupação: informar a palavra break em cada alternativa.
````

Porém, um cenário que poderíamos adequar o uso do switch/case para melhorar nosso algoritmo seria conforme ilustração
abaixo:

Imagina que fomos requisitados a criar um sistema de plano telefônico onde:

* O sistema terá 03 planos: BASIC, MÍDIA , TURBO;
* BASIC: 100 minutos de ligação;
* MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
* TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB YouTube.

```java
// Modo condicional convencional
public class controlefluxocondicional.PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
			
		
	}
}
```
```java
// Modo condicional switch/case
public class controlefluxocondicional.PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
	}
}
```
````
🚨 Cuidado

Se optarem por usar switch / case, estude um pouco mais, sobre os conceitos de continue, break e default.
````
#
**Referencias:**
> https://sintaxe.netlify.app/topicos/linguagens/java/basico/controle-fluxo

> https://glysns.gitbook.io/java-basico/controle-de-fluxo/conceito

> Github do instrutor: https://github.com/glysns

> Linkedin do instrutor: https://www.linkedin.com/in/glysns/

> Meu Github: https://github.com/JMAURICIORLIMA

> Meu Linkedin: https://www.linkedin.com/in/josemauricio-rodriguesdelima/

***Bons estudos a todos.***

## Aula 01
### Estrutura de repetição

````
Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração
de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.
````
> https://diegomariano.com/lacos-de-repeticao-2/

Laços ou repetições são representados pelas seguintes estruturas:

* For (para);
* While (enquanto);
* Do While (faça enquanto).

### For

O comando for (na tradução literal para a língua portuguesa “para”) permite que uma variável contadora, seja testada e
incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada
uma variável contadora, a condição para continuar a execução e o valor de incrementação.

A estrutura de sintaxe do controle de repetição for é exibida abaixo:

```java
//estrutura do controle de fluxo for

for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
{
// comando que será executado até que a
// expressão de validação torne-se falsa
}
```

Vamos imaginar que, Joãozinho precisa contar até 20 carneirinhos para pegar no sono:

![](https://sintaxe.netlify.app/assets/fluxo-5.b0e7e32c.gif)

```java
// ExemploFor.java
public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }
    }
}
```

#### Vamos explicar a estrutura do código acima:

#### For position

1. ``int carneirinhos = 1;`` -> O programa entende que a variável carneirinhos, começa com o valor igual a 1 e isso
acontece somente uma vez;
2. ``Carneirinhos < = 20;`` -> O programa verifica se a variável carneirinhos, ainda é menor que 20;
3. O programa começa a executar o algoritmo, no nosso caso, imprimir a quantidade de carneirinhos em contagem;
4. ``Carneirinhos ++`` -> O programa aumenta em mais 1, o valor da variável carneirinhos;
5. O fluxo é finalizado, quando a variável carneirinhos for igual a 20.

```java
// Outras estruturas

//estrutura 1
for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
    System.out.println(carneirinhos + " - Carneirinho(s)");
}

//estrutura 2
//o que importa é somente o bloco condicional
int carneirinhos = 1;
for( ; carneirinhos <=20; ) {
    System.out.println(carneirinhos + " - Carneirinho(s)");
    carneirinhos ++;
}

//for(somente 1x; uma expresão boolean; acontecerá a cada final da execução){}
```
