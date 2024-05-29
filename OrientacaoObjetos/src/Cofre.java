//DESAFIO SOBRE ENCAPSULAMENTO E ABSTRAÇÃO

import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Metodo de abertura: " + metodoAbertura);
    }

    public abstract void abrirCofre();
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == senha;
    }

    public void abrirCofre(int confirmacaoSenha) {
        if (validarSenha(confirmacaoSenha)) {
            System.out.println("Cofre aberto!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    // Implementação vazia do método abrirCofre() para satisfazer a interface
    public void abrirCofre() {
        // Não faz nada
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

    public void abrirCofre() {
        // Não faz nada, apenas implementação vazia
    }
}