# Calculadora
Como exercício para a aula de hoje deve ser implementado uma calculadora. Todas as operações pedidas devem receber dois números e retornar o resultado da operação. As operações necessárias serão:

* Subtração
* Soma
* Multiplicação
* Divisão


# ATENÇÃO: 

* Exceto nos desafios, deve ser utilizado apenas o que foi visto em aula! Não se apressem, tudo terá seu tempo.
* Para os desafios, pesquisar sobre a classe Math.

# Exemplo de Teste

``` Java   
@Test
public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
    //Arrange
    double valor1 = 2;
    double valor2 = 2;
    double resultadoEsperado = 4;
    Calculadora calculadora = new Calculadora();

    //Act
    double valorCalculado = calculadora.soma(valor1, valor2);

    //Assert
    Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
}
```

# Desafios Opcionais
`Desafio 1 (opcional)`
Quem achar que está muito fácil pode fazer também os métodos de raiz quadrada e exponenciação. 


`Desafio 2 (opcional)`
Quem tá vivendo no modo insane pode tentar desenvolver o método de bhaskara. O método deve receber os valores de `a`, `b` e `c` e retornar a `soma` de x' e x''.

# Referências
[Tutorial sobre Teste Unitário](https://github.com/AlexandreSNeto/testes-com-mockito)

## Testes Obrigatórios

* Devem existir **obrigatóriamente** na solução entregue testes unitários com os seguintes nomes:

    - deveSomarCorretamenteQuandoOsValoresForemInteiros
    - deveDividirCorretamenteQuandoNumerosForemInteiros
    - deveMultiplicarCorretamenteQuandoNumerosForemInteiros
    - deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes
