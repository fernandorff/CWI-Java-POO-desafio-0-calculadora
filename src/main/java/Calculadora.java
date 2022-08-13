public class Calculadora {

    double A = 0;
    double B = 0;
    double C = 0;


    public double soma() {
        return A + B;

    }

    public double subtracao() {
        return A - B;

    }

    public double multiplicacao() {
        return A * B;

    }

    public double divisao() {
        return A / B;

    }

    public double potenciacao() {
        return Math.pow(A, B);

    }

    public double bhaskara (){
        double delta = Math.pow(B,2) - (4 * A * C);
        double x1; double x2;
        x1 = ((B * -1) + Math.sqrt(delta))/(2*A);
        x2 = ((B * -1) - Math.sqrt(delta))/(2*A);
        return x1 + x2;
    }
}
