public class Explicacao {

    /*
    TRABALHO ATIVIDADE 03 sobrecarga (overloading) e sobreescrita (overriding)

Sobrecarga de métodos (Overload)
A sobrecarga de métodos (overload) é um conceito do polimorfismo que consiste basicamente em criar variações de um mesmo método, ou seja, a criação de dois ou mais métodos com nomes totalmente iguais em uma classe, super classe ou subclasse. A Sobrecarga permite que utilizemos o mesmo nome em mais de um método, contanto que suas listas de parâmetros sejam diferentes para que seja feita a separação dos mesmos.
Para entender melhor a sobrecarga, vamos pensar que estamos implementando uma calculadora simples que some apenas dois valores do mesmo tipo por vez. Nela teremos o método calcula que será sobrecarregado com variações de tipos de soma
EX:

public class calculadora{
 public int calcula( int a, int b){
    return a+b;
  }
public int calcula( int a, int b, int c){
    return a+b+c;
  }
  public double calcula( double a, double b){
     return a+b;
  }


Sobreposição de métodos (Override)
A Sobreposição de métodos (override) é um conceito do polimorfismo que nos permite reescrever um método, ou seja, podemos reescrever nas classes filhas métodos criados inicialmente na classe pai, os métodos que serão sobrepostos, diferentemente dos sobrecarregados, devem possuir o mesmo nome, tipo de retorno e quantidade de parâmetros do método inicial, porém o mesmo será implementado com especificações da classe atual, podendo adicionar um algo a mais ou não.
EX:

public class Animal {
   public String emitirSom() {
      return "Som genérico de animal";
   }
}

public class Cao extends Animal {
   @Override
   public String emitirSom() {
      return "Latido";
   }
}

     */
}
