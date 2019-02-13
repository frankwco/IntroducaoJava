package controle;

import javax.swing.JOptionPane;

public class AnaliseNome {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome");
		Integer quantidadeCaracteresNome = nome.length();
		System.out.println(quantidadeCaracteresNome);
		
		String[] palavrasNome=nome.split(" ");
		System.out.println(palavrasNome[0]);
		for(int x=0;x<palavrasNome.length;x++) {
			System.out.println(palavrasNome[x]);
		}
		
		for(String palavra:palavrasNome) {
			System.out.println(palavra);
		}
	}
}
