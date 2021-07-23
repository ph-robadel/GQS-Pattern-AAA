package br.ufes.patternaaa.calculadora;

/**
 *
 * @author Pedro Henrique Robadel
 */
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
    
    public double dividir(int dividendo, int divisor){
        return dividendo / divisor;
    }
}