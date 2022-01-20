/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author maria
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("~OPERADORES ARITMÉTICOS~");
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);
        System.out.println("-------------------");
        System.out.println("~OPERADORES UNÁRIOS~");
        int numero = 5;
        int valor = numero++;
        System.out.println(numero);
        
        int valor2 = numero--;
        System.out.println(numero);
        System.out.println("-------------------");
        
        int valor3 = 5 + numero++;
        System.out.println(valor3);
        System.out.println(numero);
        
        int valor4 = 5 + ++numero;
        System.out.println(valor4);
        System.out.println(numero);
        System.out.println("-------------------");    
        
        System.out.println("~+ OPERADORES UNÁRIOS~");
        int x1 = 5;
        x1 += 2; //x = x + 2
        System.out.println("x += 2 é " + x1);
        
        int x2 = 5;
        x2 -= 2; //x = x - 2
        System.out.println("x -= 2 é " + x2);
        
        int x3 = 5;
        x3 *= 2; //x = x * 2
        System.out.println("x *= 2 é " + x3);
        
        float x4 = 5;
        x4 /= 2; //x = x / 2
        System.out.println("x /= 2 é " + x4);
        
        int x5 = 5;
        x5 %= 2; //x = x % 2
        System.out.println("x %= 2 é " + x5);
        System.out.println("-------------------");
        
        System.out.println("~ARREDONDAMENTOS~");
        float v1 = 8.3f;
        int ar1 = (int) Math.floor(v1);
        System.out.println("arredondando para baixo: " + ar1);
        
        float v2 = 8.5f;
        int ar2 = (int) Math.round(v2);
        System.out.println("arredondando aritméticamente: " + ar2);
        System.out.println("-------------------");
        
        System.out.println("~GERADOR DE NÚMEROS~");
        double ale = Math.random(); // gera um número qualquer entre 0 e 1
        System.out.println(ale);
        
        int n = (int) (5 + ale * (10-5));
                        //no lugar do 5 -> colocar o menor número do sorteador
                        //no lugar do 10 -> colocar o maior número do sorteador
        System.out.println(n);
     
        
        
        
    }
    
}
