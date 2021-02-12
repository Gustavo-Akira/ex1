package colevatti.action;

public class Tempo {
	public Double getTempo(int[] array) {
		double tempoTotal = System.nanoTime();
		for(int x=0;x<array.length;x++) {
			int y = array[x];
		}
		double tempoFinal = System.nanoTime();
		tempoTotal = tempoFinal - tempoTotal;
		return tempoTotal;
	}
}
