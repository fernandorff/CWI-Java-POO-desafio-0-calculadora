public class Calculadora {

    double valorA = 0;
    double valorB = 0;
    double valorC = 0;


    public double soma() {
        return valorA + valorB;

    }

    public double subtracao() {
        return valorA - valorB;

    }

    public double multiplicacao() {
        return valorA * valorB;

    }

    public double divisao() {
        return valorA / valorB;

    }

    public double potenciacao() {
        return Math.pow(valorA, valorB);

    }

    public double bhaskara (){
        double delta = Math.pow(valorB,2) - (4 * valorA * valorC);
        double x1;
        double x2;
        x1 = ((valorB * -1) + Math.sqrt(delta))/(2* valorA);
        x2 = ((valorB * -1) - Math.sqrt(delta))/(2* valorA);
        return x1 + x2;

    }
}
