package entities;

public class Triangle {
  
  public double a;
  public double b;
  public double c;
  
  //a seguir a criação da função para método do "Triangle".
  //Math.sqrt chama a raiz quadrada.
  public double area() { 
    double p = (a + b + c) / 2.0;
    return Math.sqrt(p * (p - a) * (p - b) * (p - c));
  }
}
