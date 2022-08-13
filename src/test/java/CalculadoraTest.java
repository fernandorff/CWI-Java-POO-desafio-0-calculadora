import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {


    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.A = 6;
        calculadora1.B = 3;

        double valorEsperado = calculadora1.A + calculadora1.B;
        double valorCalculado = calculadora1.soma();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.A = 6;
        calculadora1.B = 3;

        double valorEsperado = calculadora1.A - calculadora1.B;
        double valorCalculado = calculadora1.subtracao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);

    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.A = 6;
        calculadora1.B = 3;

        double valorEsperado = calculadora1.A * calculadora1.B;
        double valorCalculado = calculadora1.multiplicacao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);

    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.A = 6;
        calculadora1.B = 3;

        double valorEsperado = calculadora1.A / calculadora1.B;
        double valorCalculado = calculadora1.divisao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);

    }

//    @Test
//    public void testarPotenciacao(){
//        // Arrange
//        Calculadora calculadora1 = new Calculadora();
//        calculadora1.A = 6;
//        calculadora1.B = 3;
//
//        double valorEsperado = Math.pow(calculadora1.A, calculadora1.B);
//        double valorCalculado = calculadora1.potenciacao();
//
//        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
//
//
//    }

//    @Test
//    public void testarBhaskara(){
//        Calculadora calculadora1 = new Calculadora();
//        calculadora1.bhaskara(4,3, 2);
//
//
//    }


}
