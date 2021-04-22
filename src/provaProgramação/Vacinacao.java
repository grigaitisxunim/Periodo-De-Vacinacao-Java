package provaProgramação;

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
			JOptionPane.showMessageDialog(null, nome + " seu mês de vacinação é Julho ");
		} else if (idade <= 49) {
			JOptionPane.showMessageDialog(null, nome + " seu mês de vacinação é Junho ");
		} else if (idade <= 59) {
			JOptionPane.showMessageDialog(null, nome + " seu mês de vacinação é Maio ");
		} else if (idade <= 69) {
			JOptionPane.showMessageDialog(null, nome + " seu mês de vacinação é Abril ");
		} else {
			JOptionPane.showMessageDialog(null, nome + "O seu período de vacinação já passou");
		}
	}
}
