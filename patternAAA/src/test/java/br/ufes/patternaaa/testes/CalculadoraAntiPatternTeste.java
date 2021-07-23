package br.ufes.patternaaa.testes;

import br.ufes.patternaaa.calculadora.Calculadora;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Pedro Henrique Robadel
 */
public class CalculadoraAntiPatternTeste {
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
        
        // Agir
        int produto = calculator.multiplicar(primeiro, segundo);
        
        // Afirmar
        assertEquals(64, produto);
    }
    
    @Test
    public void CT002() throws Exception {
        // Organizar
        int a = 5;                 
        int b = 3;                
        Calculadora calculator = new Calculadora();
        int subtracao;
        
        // Agir
        if(a > b){
            subtracao = calculator.subtrair(a, b);
        }else{
            subtracao = calculator.subtrair(b, a);
        }

        // Afirmar
        assertEquals(2,subtracao); 
    }
    
   
}
