public class Calculadora {


    public void soma (double A, double B){
        double resultado = A + B;
        System.out.println(A + " + " + B + " = " + resultado);



    }

    public void subtracao (double A, double B){
        double resultado = A - B;
        System.out.println(A + " - " + B + " = " + resultado);

    }

    public void multiplicacao (double A, double B){
        double resultado = A * B;
        System.out.println(A + " * " + B + " = " + resultado);

    }

    public void divisao (double A, double B){
        double resultado = A / B;
        System.out.println(A + " / " + B + " = " + resultado);

    }

    public void potenciacao (double A, double B){
        double resultado = Math.pow(A,B);
        System.out.println(A + " ** " + B + " = " + resultado);

    }

    public double bhaskara (double A, double B, double C){
        double delta = Math.pow(B,2) - (4 * A * C);
        double x1; double x2 ;
        double[] resultado = new double[2];

        // Delta negativo nao apresenta raizes reais.
        if (delta < 0){
            System.out.println(A + "x² + " + B + "x + " + C);
            System.out.println("Delta = " + Math.pow(delta, 1));
            System.out.println("X não tem valor real.");
            return x1;
        }
        else {
            x1 = ((B * -1) + Math.sqrt(delta))/(2*A);
            x2 = ((B * -1) - Math.sqrt(delta))/(2*A);
            System.out.println(A + "x² + " + B + "x + " + C);
            System.out.println("Delta = " + Math.pow(delta, 1));
            System.out.println("x' = " + x1 + "   x'' = " + x2);
        }


        return x1;
    }





}
