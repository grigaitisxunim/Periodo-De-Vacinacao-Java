package provaProgramação;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class testeVacinação {
	public static void main(String[] args) {

		Cidadao cid1;
		boolean sair = false;
		ArrayList<Cidadao> listaVacinacao = new ArrayList();
		while (!sair) {
			String nome = JOptionPane.showInputDialog("Digite seu nome");

			if (!nome.equalsIgnoreCase("sair")) {
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade"));
				cid1 = new Cidadao(nome, idade);
				listaVacinacao.add(cid1);
				Vacinacao vacina1 = new Vacinacao(cid1);
				vacina1.getPeriodoDeVacinacao(cid1);
			} else {
				sair = true;
			}
		}
		
		String totalDeNomes = "Lista de Vacinação do dia: " + LocalDateTime.now() + "\n";
		for (int i = 0; i < listaVacinacao.size(); i++) {
			totalDeNomes = totalDeNomes + listaVacinacao.get(i).getNome() + "\n";
		}
		
		JOptionPane.showMessageDialog(null, totalDeNomes);

	}
}
