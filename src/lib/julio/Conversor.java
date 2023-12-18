package lib.julio;

/**
 * A classe Conversor fornece métodos para realizar conversões entre unidades de medida (temperatura, distância e tempo).
 */
public class Conversor {
	
	/**
     * Converte a temperatura de Celcius para Fahrenheit.
     * 
     * @param celcius A temperatura em Celcius a ser convertida.
     * @return O resultado da conversão em Fahrenheit.
     */
	public static double converterCelciusParaFahrenheit(double celcius) {
		return (celcius * 1.8) + 32;
	}
	
	/**
     * Converte a temperatura de Fahrenheit para Celcius.
     * 
     * @param fahrenheit A temperatura em Fahrenheit a ser convertida.
     * @return O resultado da conversão em Celcius.
     */
	public static double converterFahrenheitParaCelcius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}
	
	/**
     * Converte a distância de Milha para Quilômetros.
     * 
     * @param milha A distância em milha a ser convertida.
     * @return O resultado da conversão em Quilômetros.
     */
	public static double converterMilhaParaQuilometro(double milha) {
		return milha * 1.609 ;
	}
	
	/**
     * Converte a distância de Quilômetros para Milha.
     * 
     * @param km A distância em Quilômetros a ser convertida.
     * @return O resultado da conversão em Milhas.
     */
	public static double converterQuilometroParaMilha(double km) {
		return km / 1.609 ;
	}
	
	/**
     * Transforma a velocidade de Quilômetros por Hora para Metros por Segundos.
     * 
     * @param kmHora A velocidade em Km/Hora a ser transformada.
     * @return O resultado da transformação em Metro/Segundo.
     */
	public static double converterKmHoraParaMetroSegundo(double kmHora) {
		return kmHora / 3.6;
	}
	
	/**
     * Transforma a velocidade de Metros por Segundos para Quilômetros por Hora.
     * 
     * @param metroSeg A velocidade em Metro/Segundo a ser transformada.
     * @return O resultado da transformação em Km/Hora.
     */
	public static double converterMetroSegundoParaKmHora(double metroSeg) {
		return metroSeg * 3.6;
	}
	
	/**
     * Converte o tempo de Segundos para Minutos.
     * 
     * @param seg O tempo em Segundos a ser convertido.
     * @return O resultado da conversão em Minutos.
     */
	public static double converterSegundoParaMinuto(double seg) {
		return seg / 60;
	}
	
	/**
     * Converte o tempo de Segundos para Horas.
     * 
     * @param seg O tempo em Segundos a ser convertido.
     * @return O resultado da conversão em Horas.
     */
	public static double converterSegundoParaHora(double seg) {
		return seg / 3600;
	}
	
	/**
     * Converte o tempo de Minutos para Segundos.
     * 
     * @param min O tempo em Minutos a ser convertido.
     * @return O resultado da conversão em Segundos.
     */
	public static double converterMinutoParaSegundo(double min) {
		return min * 60;
	}
	
	/**
     * Converte o tempo de Minutos para Horas.
     * 
     * @param min O tempo em Minutos a ser convertido.
     * @return O resultado da conversão em Horas.
     */
	public static double converterMinutoParaHora(double min) {
		return min / 60;
	}
	
	/**
     * Converte o tempo de Horas para Segundos.
     * 
     * @param hora O tempo em Horas a ser convertido.
     * @return O resultado da conversão em Segundos.
     */
	public static double converterHoraParaSegundo(double hora) {
		return hora * 3600;
	}
	
	/**
     * Converte o tempo de Horas para Minutos.
     * 
     * @param hora O tempo em Horas a ser convertido.
     * @return O resultado da conversão em Minutos.
     */
	public static double converterHoraParaMinuto(double hora) {
		return hora * 60;
	}
	
}
