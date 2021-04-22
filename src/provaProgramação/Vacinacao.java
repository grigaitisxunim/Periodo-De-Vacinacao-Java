package provaPrograma��o;

import javax.swing.JOptionPane;

public class Vacinacao {
	private Cidadao cidadao;

	public Vacinacao(Cidadao cidadao) {
		this.cidadao = cidadao;
	}

	public void getPeriodoDeVacinacao(Cidadao cidadao) {
		int idade = cidadao.getIdade();
		String nome = cidadao.getNome();

		if (idade <= 39) {
			JOptionPane.showMessageDialog(null, nome + " seu m�s de vacina��o � Julho ");
		} else if (idade <= 49) {
			JOptionPane.showMessageDialog(null, nome + " seu m�s de vacina��o � Junho ");
		} else if (idade <= 59) {
			JOptionPane.showMessageDialog(null, nome + " seu m�s de vacina��o � Maio ");
		} else if (idade <= 69) {
			JOptionPane.showMessageDialog(null, nome + " seu m�s de vacina��o � Abril ");
		} else {
			JOptionPane.showMessageDialog(null, nome + "O seu per�odo de vacina��o j� passou");
		}
	}
}
