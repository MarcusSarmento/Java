//Aula 14- Herança, hierárquia e encapsulamento em Java

//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.lang.Math;

class GameCharacter {
    private String nome;
    private int posicao;
    private int vida;

    // Construtor
    GameCharacter(String nome, int posicao, int vida) {
        this.nome = nome;
        this.posicao = posicao;
        this.vida = vida;
    }

    // Getters (métodos de acesso)
    String getNome() {
        return this.nome;
    }

    int getPosicao() {
        return this.posicao;
    }

    int getVida() {
        return this.vida;
    }

    // Métodos de ação
    void mover(int distancia) {
        this.posicao += distancia;
        System.out.println(this.nome + " se moveu para a posição " + this.posicao);
    }

    void perderVida(int dano) {
        this.vida -= dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
        System.out.println(this.nome + " perdeu " + dano + " de vida. Vida atual: " + this.vida);
    }
}

public class start {
    public static void main(String[] args) {
        // Criando um personagem
        GameCharacter player = new GameCharacter("Mário", 0, 100);

        // Exibindo informações iniciais
        System.out.println("Nome do player: " + player.getNome());
        System.out.println("Posição inicial: " + player.getPosicao());
        System.out.println("Vida inicial: " + player.getVida());
        System.out.println("----------------------------");

        // Simulando ações do jogo
        player.mover(5); // anda 5 unidades
        player.perderVida(20); // perde 20 de vida
        player.mover(3); // anda mais 3
        player.perderVida(50); // perde mais 50 de vida

        System.out.println("----------------------------");
        System.out.println("Posição final: " + player.getPosicao());
        System.out.println("Vida final: " + player.getVida());
    }
}
