package controle;

import javax.swing.JOptionPane;

public class OrdenarNumeros {
	public static void main(String[] args) {
		String valores = JOptionPane.showInputDialog("Digite valores separados por ,");
		String[] listaNumeros = valores.split(",");
		int n1 = Integer.parseInt(listaNumeros[0]);
		int n2 = Integer.parseInt(listaNumeros[1]);
		int n3 = Integer.parseInt(listaNumeros[2]);


	}
}
