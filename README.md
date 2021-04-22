# Periodo-De-Vacinacao-Java
Trabalho acadêmico sobre o período de vacinação.
Neste trabalho fiz a utilização de classes para representar o cidadão e a vacinação.
Utilizei a instancia de objetos para criar o ato da vacijnação recebend como parametro um objeto cidadao.
Dentro do metodo getPeriodoDeVacinacao, utilizei alguns if para determinar o mês de vacinação de acordo com a idade de cada cidaão imputado no sistema:

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
  Desta forma, ao gerar vários cidadões através do JOptionPane, armazenei todos em um ArrayList, converti todos em uma string e imprimi todo na tela ao fim da operação.
