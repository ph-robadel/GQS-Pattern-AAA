#  Padrão AAA  (Arrange-Act-Assert pattern)

Autor: Pedro Henrique Robadel da Silva Camâra

O padrão Arrange-Act-Assert (Organizar, Agir, Afirmar) é um padrão para testes unitários. Ele fornece uma estrutura a ser seguida na escrita de todos os testes de unidades. Abaixo é possível ver a estrutura base utilizada neste padrão, que são sessões divididas em sessões.

#### Sessão organizar

Nesta sessão são configurados as variáveis e objetos que serão utilizadas durante o teste. Utilizada para configurar as dependências e o estado desejado para o teste.

#### Sessão de ação

Nesta sessão a operação a ser testada é executada utilizando os objetos e variáveis da sessão anterior.

#### Sessão de afirmação

Nesta sessão o resultado da operação testada é comparada com o valor esperado segundo a regra de negócio.

### Exemplo de teste unitário seguindo o padrão AAA

Classe e métodos que serão utilizados como referência nos demais exemplos :

~~~java
public class Calculadora{
    public int somar(int primeiroNumero, int segundoNumero){
        return primeiroNumero + segundoNumero;
    }
    
    public int subtrair(int primeiroNumero, int segundoNumero){
        return primeiroNumero - segundoNumero;
    }
    
    public int multiplicar(int primeiroNumero, int segundoNumero){
        return primeiroNumero * segundoNumero;
    }
}
~~~

Classe de teste seguindo o padrão AAA:

~~~java
 
 public class CalculadoraTest{
     @Test
     public void CT001() {
         // Organizar
         int primeiro = 16;                 
         int segundo = 4;                
         Calculadora calculator = new Calculator(); 
  
         // Agir
         int soma = calculator.somar(primeiro, segundo);
  
         // Afirmar
         Assert.Equal(20, soma); 
     }
 }
~~~

### Antipadrão

Um antipadrão do padrão AAA são as multiplas sessões de organização, ação e afirmação em um único teste unitário. Quando um teste contem este antipadrão, significa que o teste verifica mais de um comportamento, passando a ser caracterizado como um teste de integração. Abaixo é possível ver um exemplo do antipadrão:

~~~java
public class CalculadoraTest{
     @Test
     public void CT002() {
         // Organizar
         int primeiro = 10;                 
         int segundo = 4;                
         Calculadora calculator = new Calculator(); 
  
         // Agir
         int soma = calculator.somar(primeiro, segundo);
  
         // Afirmar
         Assert.Equal(14, soma);
         
         // Agir
         int produto = calculator.multiplicar(primeiro, segundo);
  
         // Afirmar
         Assert.Equal(40, produto);
     }
 }
~~~

Outro antipadrão do padrão AAA é a utilização de estruturas condicionais nos testes unitários. Um teste deve ser uma sequência simples de etapas sem ramificações. Nestes casos os testes devem ser divididos em vários testes. Um exemplo do antipadrão pode ser visto abaixo.

~~~java
public class CalculadoraTest{
     @Test
     public void CT003() {
         // Organizar
         int primeiro = 10;                 
         int segundo = 4;                
         Calculadora calculator = new Calculator(); 
  
         // Agir
         int resultado = calculator.somar(primeiro, segundo);
         
         // Condicional
         
         if(resultado % 2 == 0){
             // Agir
             resultado = calculator.multiplicar(resultado, 2);
         }
  
         // Afirmar
         Assert.Equal(28, soma);
     }
 }
~~~

### Diretivas para criar bons testes unitários

#### tamanho ideal para cada sessão do padrão AAA

- **Organizar**
  Esta é a maior sessão. Pode conter diversas linhas, porém, caso a quantidade de linhas se torne volumosa, considere utilizar os padrões *Object Mother* e *Test Data Builder*.
- **Agir**
  Nesta sessão a quantidade ideal é de apenas uma única linha. Nesta linha, deve-se executar um método que encapsule uma operação da regra de negócio. Mas há casos que são necessárias mais operações, como em código utilitário e de infraestruta por exemplo.
- **Afirmar**
  Uma unidade em teste de unidade é uma unidade de comportamento, não uma unidade de código. Pode haver diversos resultados que uma unidade de comportameto exibe. Por tanto, o tamanho desta sessão será quantas linhas forem necessárias para testar os resultados obtidos.

#### Notações para diferenciar as sessões

É importante que as 3 sessões estejam destacadas. É recomentado a utilização de comentários marcando o início de cada sessão, como foi feito nos exemplos acima. Para testes pequenos, também é possível utilizar quebra de linha para diferenciar cada sessão, como foi feito abaixo, utilizando o teste *CT001*.

~~~java
 public class CalculadoraTest{
     @Test
     public void CT001() {
         int primeiro = 16;                 
         int segundo = 4;                
         Calculadora calculator = new Calculator(); 
         
         int soma = calculator.somar(primeiro, segundo);
         
         Assert.Equal(20, soma); 
     }
 }
~~~

### Utilizando JUnit para teste unitários em Java

Nos códigos de exempos utilizados neste respoitório foram feitos utilizando o JUnit, um framework que facilita o desenvolvimento e execução de testes unitários em código Java. JUnit é uma framework de teste de regressão escrita por Erich Gamma e Kent Beck, e é um software de código aberto. O código fonte está disponível no GitHub na página [JUnit](https://github.com/junit-team/junit4). 



### Referências

- [**Making Better Unit Tests: part 1, the AAA pattern**](https://freecontent.manning.com/making-better-unit-tests-part-1-the-aaa-pattern/). [Manning Publications](https://freecontent.manning.com/), 2020. Acessado em 22 de julho de 2021.
- THOMPSON, John. **[Unit Testing with JUnit – Part 2](https://dzone.com/articles/unit-testing-with-junit-pt-2)**. [DZone](https://dzone.com/), 2015. Acessado em 22 de julho de 2021.



