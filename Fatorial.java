public class Fatorial{
  // Versao iterativa do calculo de fatorial
  public int calcularFatorial(int n) throws IllegalArgumentException {
    if (n<0) 
      throw new IllegalArgumentException("não existem fatorial para numero negativos");
    
    int resultado = 1;
    if (n != 0){
	for (int i = 2; i <= n; i++)
	  resultado*= i;
    }
    return resultado;
  }
}