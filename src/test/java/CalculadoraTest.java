import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.valorA = 6;
        calculadora1.valorB = 3;

        double valorEsperado = calculadora1.valorA + calculadora1.valorB;
        double valorCalculado = calculadora1.soma();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveSubtrairCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.valorA = 6;
        calculadora1.valorB = 3;

        double valorEsperado = calculadora1.valorA - calculadora1.valorB;
        double valorCalculado = calculadora1.subtracao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.valorA = 6;
        calculadora1.valorB = 3;

        double valorEsperado = calculadora1.valorA * calculadora1.valorB;
        double valorCalculado = calculadora1.multiplicacao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.valorA = 6;
        calculadora1.valorB = 3;

        double valorEsperado = calculadora1.valorA / calculadora1.valorB;
        double valorCalculado = calculadora1.divisao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.valorA = 6;
        calculadora1.valorB = 3;

        double valorEsperado = calculadora1.valorA / calculadora1.valorB;
        double valorCalculado = calculadora1.divisao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void devePotencializarCorretamenteQuandoNumerosForemInteiros(){
        // Arrange
        Calculadora calculadora1 = new Calculadora();
        calculadora1.valorA = 6;
        calculadora1.valorB = 3;

        double valorEsperado = Math.pow(calculadora1.valorA, calculadora1.valorB);
        double valorCalculado = calculadora1.potenciacao();

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveCalcularSomaDeX1eX2UsandoBhaskaraCorretamenteQuandoNumerosForemInteiros(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.valorA = 3;
        calculadora1.valorB = 6;
        calculadora1.valorC = 1;

        double valorEsperado =
                (((calculadora1.valorB * -1) + Math.sqrt(Math.pow(calculadora1.valorB,2) - (4 * calculadora1.valorA * calculadora1.valorC)))/(2* calculadora1.valorA))
                +
                (((calculadora1.valorB * -1) - Math.sqrt(Math.pow(calculadora1.valorB,2) - (4 * calculadora1.valorA * calculadora1.valorC)))/(2* calculadora1.valorA));
        double valorCalculado = calculadora1.bhaskara();
        System.out.println(valorCalculado);

        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
    }


}
