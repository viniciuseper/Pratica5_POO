package br.com.poligonoregular;

public class PoligonoMain {
    public static void main(String[] args) {

        //Triangulo tri = new Triangulo(3,4);
        //tri.calculaArea();
        //System.out.println("A área do triângulo é: " + tri.calculaArea() + "m");

        //Quadrado quad = new Quadrado(4,4);
        //quad.calculaArea();
        //System.out.println("A área do Quadrado é: " + quad.calculaArea() + "m");

        //PoligonoRegular q1 = new Quadrado(4,4); »É POSSÍVEL CRIAR O OBJETO DESSA FORMA, DÁ CERTO.

        //JEITO QUE A MICHELLE FEZ
        Triangulo t1 = new Triangulo(3,4);
        Quadrado q1 = new Quadrado(4,4);
        System.out.println("A área do Triangulo é " + t1.calculaArea());
        System.out.println("A área do Quadrado é " + q1.calculaArea());

        System.out.println("Perímetro do Triângulo: " + t1.calculaPerimetro());
        System.out.println("Perímeto do Quadrado: " + q1.calculaPerimetro());
    }
}
