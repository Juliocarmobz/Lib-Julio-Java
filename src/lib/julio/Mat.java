package lib.julio;

/**
 * A classe Mat fornece métodos matemáticos adicionais, como potência e raiz quadrada.
 */
public class Mat {
	
	/**
     * Calcula a potência de um número.
     * 
     * @param base A base.
     * @param expoente O expoente (deve ser não negativo).
     * @return O resultado da potência.
     * @throws IllegalArgumentException Se o expoente for negativo.
     */
    public static double pot(double base, int expoente) {
    	if (expoente < 0) {
			throw new IllegalArgumentException("O expoente não pode ser negativo.");
		}
		
		double resultado = 1.0;
		for (int i = 0; i < expoente; i++) {
			resultado *= base;
		}
		return resultado;
    }

    /**
     * Calcula a raiz quadrada de um número.
     * 
     * @param radicando O número a ser radicado (deve ser não negativo).
     * @return A raiz quadrada do número.
     * @throws IllegalArgumentException Se o número for negativo.
     */
    public static double raizquad(double radicando) {
    	if (radicando < 0) {
          throw new IllegalArgumentException("O número não pode ser negativo.");
      }

      double aproximacao = radicando;
      for (int i = 0; i < 10; i++) {
          aproximacao = 0.5 * (aproximacao + radicando / aproximacao);
      }
      return aproximacao;
    }
	
}
