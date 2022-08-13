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
    public void deveSubtrairCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
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

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.A = 6;
        calculadora1.B = 3;

        double valorEsperado = calculadora1.A / calculadora1.B;
        double valorCalculado = calculadora1.divisao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);

    }

    @Test
    public void devePotencializarCorretamenteQuandoNumerosForemInteiros(){
        // Arrange
        Calculadora calculadora1 = new Calculadora();
        calculadora1.A = 6;
        calculadora1.B = 3;

        double valorEsperado = Math.pow(calculadora1.A, calculadora1.B);
        double valorCalculado = calculadora1.potenciacao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);


    }

    @Test
    public void deveCalcularSomaDeX1EX2UsandoBhaskaraCorretamenteQuandoNumerosForemInteiros(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.A = 4;
        calculadora1.B = 3;
        calculadora1.C = 1;

        double valorEsperado = (((calculadora1.B * -1) + Math.sqrt(Math.pow(calculadora1.B,2) - (4 * calculadora1.A * calculadora1.C)))/(2* calculadora1.A)) +
                (((calculadora1.B * -1) - Math.sqrt(Math.pow(calculadora1.B,2) - (4 * calculadora1.A * calculadora1.C)))/(2* calculadora1.A));
        double valorCalculado = calculadora1.bhaskara();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);

    }


}
