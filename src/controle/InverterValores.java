package controle;

import javax.swing.JOptionPane;

public class InverterValores {

	public static void main(String[] args) {
		String valores = JOptionPane.showInputDialog
				("Digite valores separados por ,");
		
		String[] listaNumeros = valores.split(",");
		
		for(int x=(listaNumeros.length-1); x>=0; x-- ) {
			System.out.println(listaNumeros[x]);
		}
		
	}
}
