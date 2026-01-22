package mod7;

/**
 * Classe que representa um carro
 * Tarefa na pasta mod7
 */

public class carro {

    //1. Propriedades
    private String modelo;
    private String cor;
    private int ano;
    private boolean estaLigado;

    //2. Métodos
    public void ligar() {
        this.estaLigado = true;
        System.out.print(" O carro ligou! ");
    }

    public void acelerar() {
        if (estaLigado) {
            System.out.println(" Motor acelerando ");
            
        } else {
            System.out.println(" Motor desligado ");
        }
    }

    //Getters e Setters (para acessar as propriedades)
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }

    
}