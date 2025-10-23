## 🍵 Aulas de Java 

Um guia introdutório de Java com explicações simples e exemplos práticos.  
Ideal para iniciantes que desejam entender os fundamentos da linguagem.

---

## 📘 1. Introdução ao Java

**Java** é uma linguagem de programação **orientada a objetos**, **portável** (funciona em qualquer sistema com a JVM) e **fortemente tipada** (exige declaração de tipos).

É usada em **aplicações desktop, web, mobile (Android)** e **sistemas corporativos**.

    public class Main {
        public static void main(String[] args) {
            System.out.println("Olá, mundo!");
        }
    }
_____________________________________________________

## 🧮 2. Variáveis
Variáveis armazenam informações na memória.
Você precisa declarar o tipo antes de usar.

| Tipo      | Exemplo      | Descrição                    |
| --------- | ------------ | ---------------------------- |
| `int`     | 10           | números inteiros             |
| `double`  | 3.14         | números decimais             |
| `boolean` | true / false | valores lógicos              |
| `char`    | 'A'          | um caractere                 |
| `String`  | "Java"       | texto (cadeia de caracteres) |

    int idade = 20;
    double altura = 1.75;
    boolean estudante = true;
    String nome = "Marcus";
    
    System.out.println("Nome: " + nome + ", idade: " + idade);
_____________________________________________________

## ➕ 3. Operadores
🔹 Aritméticos
+, -, *, /, %

    int soma = 5 + 3;
    int resto = 10 % 3;
_____________________________________________________

🔹 Relacionais
==, !=, <, >, <=, >=

    boolean maior = 10 > 5; // true
_____________________________________________________

🔹 Lógicos
&& (E), || (OU), ! (NÃO)


    boolean resultado = (5 > 2) && (3 < 4); // true
_____________________________________________________

## 💬 4. Entradas e Saídas
Usamos a classe Scanner para ler dados do usuário.

    import java.util.Scanner;
    
    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite seu nome: ");
            String nome = input.nextLine();
    
            System.out.println("Olá, " + nome + "!");
        }
    }
_____________________________________________________

## 📦 5. Arrays
Um array armazena vários valores do mesmo tipo.

    int[] numeros = {1, 2, 3, 4, 5};
    System.out.println(numeros[0]); // mostra 1
_____________________________________________________

Percorrendo com for:

    for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]);
    }
_____________________________________________________

## 📋 6. ArrayList
Lista dinâmica, que pode crescer ou diminuir.

    import java.util.ArrayList;
    
    ArrayList<String> nomes = new ArrayList<>();
    
    nomes.add("Ana");
    nomes.add("Bruno");
    nomes.add("Carlos");
    
    System.out.println(nomes.get(1)); // Bruno
    nomes.remove("Ana");
    System.out.println(nomes.size()); // 2
_____________________________________________________

## 🔑 7. HashMap
Armazena pares de chave e valor, como um dicionário.


    import java.util.HashMap;
    
    HashMap<String, Integer> idades = new HashMap<>();
    
    idades.put("Ana", 25);
    idades.put("Bruno", 30);
    
    System.out.println(idades.get("Ana")); // 25
_____________________________________________________

## ⚙️ 8. Estruturas de Controle
🔹 If / Else

    int idade = 18;
    
    if (idade >= 18) {
        System.out.println("Maior de idade");
    } else {
        System.out.println("Menor de idade");
    }
_____________________________________________________

🔹 While

    int contador = 0;
    while (contador < 3) {
        System.out.println("Contando: " + contador);
        contador++;
    }
_____________________________________________________

🔹 For

    for (int i = 1; i <= 5; i++) {
        System.out.println("Número: " + i);
    }
_____________________________________________________

## 🧩 9. Funções (Métodos)
Servem para organizar e reutilizar código.

    public class Main {
    
        static void saudacao(String nome) {
            System.out.println("Olá, " + nome);
        }
    
        public static void main(String[] args) {
            saudacao("Marcus");
        }
    }
_____________________________________________________

Função com retorno:

    static int soma(int a, int b) {
        return a + b;
    }
_____________________________________________________

## 🧬 10. Herança (Orientação a Objetos)
Permite que uma classe filha reutilize atributos e métodos de uma classe pai.

    class Animal {
        void fazerSom() {
            System.out.println("Algum som...");
        }
    }
    
    class Cachorro extends Animal {
        void latir() {
            System.out.println("Au au!");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Cachorro dog = new Cachorro();
            dog.fazerSom(); // herdado de Animal
            dog.latir();    // método próprio
        }
    }
_____________________________________________________

## ⚡ 11. Instalação e Execução
🔧 Requisitos

-Java JDK

-VS Code
 (ou outro editor de sua preferência)

-Extensão do VS Code: Extension Pack for Java

`🧭 Passo a Passo — Terminal`

-Verifique se o Java está instalado:

    java -version
    javac -version

Se não aparecer nada, instale o JDK.
_____________________________________________________
-Crie um arquivo Java:

    echo "public class Main { public static void main(String[] args) { System.out.println(\"Olá, mundo!\"); }}" > Main.java

_____________________________________________________
-Compile o código:

    javac Main.java

_____________________________________________________
-Execute o programa:

    java Main
_____________________________________________________

## 🧰 Executando no VS Code

1- Instale o Java Extension Pack.

2- Crie um arquivo chamado Main.java.

3- Digite o código Java e salve (Ctrl + S).

4- Clique no botão ▶️ no canto superior direito ou pressione Ctrl + F5 para rodar.
_____________________________________________________

`🧠 Resumo Geral`
| Conceito                         | Ideia Principal               | Exemplo                         |
| -------------------------------- | ----------------------------- | ------------------------------- |
| **Variáveis**                    | Armazenam dados               | `int x = 10;`                   |
| **Operadores**                   | Fazem cálculos e comparações  | `a + b`, `==`, `&&`             |
| **Entradas/Saídas**              | Interagem com o usuário       | `Scanner`, `System.out.println` |
| **Arrays / ArrayList / HashMap** | Guardam coleções de dados     | `{}`, `.add()`, `.put()`        |
| **If / While / For**             | Controlam o fluxo do programa | Condições e repetições          |
| **Funções**                      | Reutilizam código             | `void nome()`                   |
| **Herança**                      | Reuso de classes              | `class Filho extends Pai`       |

