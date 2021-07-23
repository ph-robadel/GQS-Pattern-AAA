package br.ufes.patternaaa.testes;

import br.ufes.patternaaa.calculadora.Calculadora;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class CalculadoraPatternTeste {

    @Test
    public void CT001() throws Exception {
        // Organizar
        int primeiro = 16;                 
        int segundo = 4;                
        Calculadora calculator = new Calculadora(); 

        // Agir
        int soma = calculator.somar(primeiro, segundo);

        // Afirmar
        assertEquals(20, soma); 
    }
    
    @Test
    public void CT002() throws Exception {
        // Organizar
        int primeiro = 5;                 
        int segundo = 3;                
        Calculadora calculator = new Calculadora(); 

        // Agir
        int subtracao = calculator.subtrair(primeiro, segundo);

        // Afirmar
        assertEquals(2, subtracao); 
    }
    
    @Test
    public void CT003() throws Exception {
        // Organizar
        int primeiro = 2;                 
        int segundo = 15;                
        Calculadora calculator = new Calculadora(); 

        // Agir
        int produto = calculator.multiplicar(primeiro, segundo);

        // Afirmar
        assertEquals(30, produto); 
    }
    
    @Test
    public void CT004() throws Exception {
        // Organizar
        int divisor = 30;                 
        int dividendo = 2;                
        Calculadora calculator = new Calculadora(); 

        // Agir
        var divisao = calculator.dividir(divisor, dividendo);

        // Afirmar
        assertEquals(15, divisao, 0.1); 
    }
    
}
