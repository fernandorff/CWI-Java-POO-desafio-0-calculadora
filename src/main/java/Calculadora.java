public class Calculadora {

    double A = 0;
    double B = 0;
    double C = 0;


    public double soma (){
        double resultado = A + B;
        System.out.println(A + " + " + B + " = " + resultado);
        return resultado;



    }

    public double subtracao (){
        double resultado = A - B;
        System.out.println(A + " - " + B + " = " + resultado);
        return resultado;

    }

    public double multiplicacao (){
        double resultado = A * B;
        System.out.println(A + " * " + B + " = " + resultado);
        return resultado;

    }

    public double divisao (){
        double resultado = A / B;
        System.out.println(A + " / " + B + " = " + resultado);
        return resultado;

    }

//    public double potenciacao (){
//        double resultado = Math.pow(A,B);
//        System.out.println(A + " ** " + B + " = " + resultado);
//        return resultado;
//
//    }

//    public double bhaskara (){
//        double delta = Math.pow(B,2) - (4 * A * C);
//        double x1; double x2;
//            int[] resultado = new int[2];
//
//        // Delta negativo nao apresenta raizes reais.
//        if (delta < 0){
//            System.out.println(A + "x² + " + B + "x + " + C);
//            System.out.println("Delta = " + Math.pow(delta, 1));
//            System.out.println("X não tem valor real.");
//            return x1;
//        }
//        else {
//            x1 = ((B * -1) + Math.sqrt(delta))/(2*A);
//            x2 = ((B * -1) - Math.sqrt(delta))/(2*A);
//            System.out.println(A + "x² + " + B + "x + " + C);
//            System.out.println("Delta = " + Math.pow(delta, 1));
//            System.out.println("x' = " + x1 + "   x'' = " + x2);
//        }
//
//
//        return x1;
//    }





}
