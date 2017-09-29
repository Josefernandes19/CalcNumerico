/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcnum;

/**
 *
 * @author a15012
 */
public class Sequencia {

    public static double polinomio(double x) {
        double result;
        result = (Math.pow(x, 7) + Math.pow(x, 6) + Math.pow(x, 5) + Math.pow(x, 4) + Math.pow(x, 3) + Math.pow(x, 2) + Math.pow(x, 1) + 5);
        return result;
    }

    public static double derivada(double x) {
        double result;
        result = (7 * Math.pow(x, 6) + 6 * Math.pow(x, 5) + 5 * Math.pow(x, 4) + 4 * Math.pow(x, 3) + 3 * Math.pow(x, 2) + 2 * Math.pow(x, 1) + 1);
        return result;
    }

    public static double funcao(double x) {
        double result;
        result = x - polinomio(x) / derivada(x);
        return result;
    }

    public static void main(String[] args) {
        double chute = 0;
        for (int i = 0; i < 20; i++) {
            chute = funcao(chute);
        }
        System.out.println("Xn: " + chute);
        System.out.println("F(xn): " + polinomio(chute));
    }
}
