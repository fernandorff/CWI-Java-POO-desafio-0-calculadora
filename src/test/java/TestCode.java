import org.junit.Assert;
import org.junit.Test;

public class TestCode {


    @Test
    public void testarSoma(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.soma(6,3);

    }

    @Test
    public void testarSubtracao(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.subtracao(6,3);

    }

    @Test
    public void testarMultiplicacao(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.multiplicacao(6,3);

    }

    @Test
    public void testarDivisao(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.divisao(6,3);

    }

    @Test
    public void testarPotenciacao(){
        // Arrange
        Calculadora calculadora1 = new Calculadora();
        calculadora1.potenciacao(6,3);
        double valorEsperado = Math.pow(6,3);

        // Act
        double valorCalculado = calculadorComissao.calcularValorComissao();



        // Assert
        Assert.assertEquals(valorEsperado, valorCalculado, 0.01);


    }

    @Test
    public void testarBhaskara(){
        Calculadora calculadora1 = new Calculadora();
        calculadora1.bhaskara(4,3, 2);


    }


}
