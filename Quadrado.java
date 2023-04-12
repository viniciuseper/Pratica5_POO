package br.com.poligonoregular;

public class Quadrado extends PoligonoRegular{

    public Quadrado(int numLados, float tamLado) {
        super(numLados, tamLado);
    }

    public float calculaArea(){
        return getTamLado()*getTamLado();
    }
}
