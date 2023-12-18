package lib.julio;

/**
 * A classe Calculadora fornece métodos para realizar operações matemáticas básicas e cálculos geométricos.
 */
public class Calculadora {
	
	/**
     * Calcula a soma de uma lista de números.
     * 
     * @param numeros Os números a serem somados.
     * @return A soma dos números.
     */
	public static double somar(double... numeros) {
		double resultado = 0;
		for (double numero : numeros) {
			resultado += numero;
		}
		return resultado;
	}
	
	/**
     * Calcula a subtração de uma lista de números.
     * 
     * @param numeros Os números a serem subtraídos.
     * @return A subtração dos números.
     */
	public static double subtrair(double... numeros) {
		double resultado = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			resultado -= numeros[i];
		}
		return resultado;
	}
	
	/**
     * Calcula a multiplicação de uma lista de números.
     * 
     * @param numeros Os números a serem multiplicados.
     * @return O produto dos números.
     */
	public static double multiplicar(double... numeros) {
		double resultado = 1;
		for (double numero: numeros) {
			resultado *= numero;
		}
		return resultado;
	}
	
	/**
     * Calcula a divisão entre dois números.
     * 
     * @param numerador O numerador.
     * @param denominador O denominador (não pode ser zero).
     * @return O resultado da divisão.
     * @throws IllegalArgumentException Se o denominador for zero.
     */
	public static double dividir(double numerador, double denominador) {
		if (denominador ==0) {
			throw new IllegalArgumentException("Não é possível dividir por zero.");
		}
		return numerador / denominador;
	}
	
	/**
	 * Calcula a área de um quadrado.
	 * 
	 * @param lado O comprimento do lado do quadrado.
	 * @return A área do quadrado.
	 * @see Mat.pot(double, int)
	 *      Utiliza o método pot da classe Mat para calcular a potência do lado.
	 */
	public static double calcularAreaQuadrado(double lado) {
		return Mat.pot(lado, 2); //botar o see do javadoc para ver o see also mat.pot igual no exemplo date.class see also: java.lang.System.currentTimeMillis()
	}
	
	/**
	 * Calcula a área de um retângulo.
	 * 
	 * @param comprimento O comprimento do retângulo.
	 * @param largura A largura do retângulo.
	 * @return A área do retângulo.
	 */
	public static double calcularAreaRetangulo(double comprimento, double largura) {
		return comprimento * largura;
	}
	
	/**
	 * Calcula a área de um círculo.
	 * 
	 * @param raio O raio do círculo.
	 * @return A área do círculo.
	 * @see Mat.pot(double, int)
	 *      Utiliza o método pot da classe Mat para calcular a potência do raio.
	 */
	public static double calcularAreaCirculo(double raio) {
		return 3.14 * Mat.pot(raio, 2);
	}
	
	/**
	 * Calcula a área de um triângulo.
	 * 
	 * @param base A base do triângulo.
	 * @param altura A altura do triângulo.
	 * @return A área do triângulo.
	 */
	public static double calcularAreaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	
	/**
	 * Calcula o perímetro de um quadrado.
	 * 
	 * @param lado O comprimento do lado do quadrado.
	 * @return O perímetro do quadrado.
	 */
	public static double calcularPerimetroQuadrado(double lado) {
		return 4 * lado;
	}
	
	/**
	 * Calcula o perímetro de um retângulo.
	 * 
	 * @param comprimento O comprimento do retângulo.
	 * @param largura A largura do retângulo.
	 * @return O perímetro do retângulo.
	 */
	public static double calcularPerimetroRetangulo(double comprimento, double largura) {
		return 2 * (comprimento + largura);
	}
	
	/**
	 * Calcula o perímetro de um círculo.
	 * 
	 * @param raio O raio do círculo.
	 * @return O perímetro do círculo.
	 */
	public static double calcularPerimetroCirculo(double raio) {
		return 2 * 3.14 * raio;
	}
	
	/**
	 * Calcula o perímetro de um triângulo.
	 * 
	 * @param lado1 O comprimento do primeiro lado.
	 * @param lado2 O comprimento do segundo lado.
	 * @param lado3 O comprimento do terceiro lado.
	 * @return O perímetro do triângulo.
	 * @throws IllegalArgumentException Se os lados não formarem um triângulo válido.
	 */
	public static double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
	    if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
	        throw new IllegalArgumentException("Os lados do triângulo devem ter valores positivos.");
	    }
	    if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
	        throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido.");
	    }
	    return lado1 + lado2 + lado3;
	}
	
	/**
     * Calcula o volume de um cubo.
     * 
     * @param aresta O comprimento da aresta do cubo.
     * @return O volume do cubo.
     * @throws IllegalArgumentException Se a aresta for menor ou igual a zero.
     */
	public static double calcularVolumeCubo(double aresta) {
		if (aresta <= 0) {
			throw new IllegalArgumentException("Aresta não pode ser zero");
		}
        return aresta * aresta * aresta;
    }
	
	/**
	 * Calcula os juros simples.
	 * 
	 * @param capital O valor inicial do capital.
	 * @param taxa A taxa de juros por período.
	 * @param tempo O número de períodos.
	 * @return O montante após a aplicação dos juros simples.
	 */
	public static double calcularJurosSimple(double capital, double taxa, int tempo) {
		return capital * taxa * tempo;
	}
	
	/**
	 * Calcula os juros compostos.
	 * 
	 * @param capital O valor inicial do capital.
	 * @param taxa A taxa de juros por período.
	 * @param tempo O número de períodos.
	 * @return O montante após a aplicação dos juros compostos.
	 * @see Mat.pot(double, int)
	 *      Utiliza o método pot da classe Mat para calcular a potência.
	 */
	public static double calcularJurosCompostos(double capital,double taxa, int tempo) {
		return capital * Mat.pot(1 + taxa, tempo) - capital;
	}

	
}