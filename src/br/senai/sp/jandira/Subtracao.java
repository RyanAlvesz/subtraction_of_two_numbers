package br.senai.sp.jandira;

import javax.swing.JOptionPane;

public class Subtracao {

	public static void main(String[] args) {

		String strValor1, strValor2;
		double valor1, valor2, subtracao;
		
		strValor1 = JOptionPane.showInputDialog("Digite o primeiro valor");
		strValor2 = JOptionPane.showInputDialog("Digite o segundo valor");
		
		valor1 = Double.parseDouble(strValor1);
		valor2 = Double.parseDouble(strValor2);
		
		if (valor1 <= valor2) {
			subtracao = valor2 - valor1;
		}else {
			subtracao = valor1 - valor2;
		}
		
		JOptionPane.showMessageDialog(null, "O resultado da subtração é: " + subtracao);
	
	}

}
