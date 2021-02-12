package colevatti;

import colevatti.action.Tempo;

public class Main {
	private static Tempo tempo = new Tempo();
	public static void main(String[] args) {
		int array[] = new int[10000];
		System.out.println("10000 pos demorou " + tempo.getTempo(array)+" nS");
		int array1[] = new int[100000];
		System.out.println("100000 pos demorou " + tempo.getTempo(array1)+" nS");
	}

}
