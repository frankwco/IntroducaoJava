package controle;

import javax.swing.JOptionPane;

public class IdentificarFaixaEtaria {
	public static void main(String[] args) {
		String idadeEntrada = 
				JOptionPane.showInputDialog("Idade");
		Integer idade = Integer.parseInt(idadeEntrada);
		String situacaoFaixaEtaria="";
		if (idade >= 18) {
			situacaoFaixaEtaria = "Adulto";
		} else if (idade >= 12) {
			situacaoFaixaEtaria = "Adolescente";
		} else if(idade>0){
			situacaoFaixaEtaria = "Criança";
		}else {
			situacaoFaixaEtaria = "Idade Inválida";
		}
		System.out.println(situacaoFaixaEtaria);
	}
}
