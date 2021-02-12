package colevatti.action;

public class Tempo {
	public Double getTempo(int[] array) {
		double tempoTotal = System.nanoTime();
		for(int n : array) {
		}
		double tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoTotal;
		return tempoTotal;
	}
}
