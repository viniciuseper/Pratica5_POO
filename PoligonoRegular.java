package br.com.poligonoregular;

public abstract class PoligonoRegular { //EXERCÍCIO COM DESENHO SERÁ QUESTÃO DE PROVA

    private int numLados; //EM UMA CLASSE ABSTRATA PODE TER ATRIBUTOS PRIVADOS
    private float tamLado;

    public PoligonoRegular(int numLados, float tamLado) {
        this.numLados = numLados;
        this.tamLado = tamLado;
    }

    public float calculaPerimetro(){
        return numLados * tamLado; // PODE USAR O this. OU O get DOS ATRIBUTOS
    }

    public abstract float calculaArea();

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public float getTamLado() {
        return tamLado;
    }

    public void setTamLado(float tamLado) {
        this.tamLado = tamLado;
    }


}