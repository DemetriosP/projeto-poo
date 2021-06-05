package model;

import java.util.ArrayList;

public class DisciplinaModel {
	
	private String nome;
	
	public DisciplinaModel(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public static ArrayList<DisciplinaModel> pesquisarDisciplinas(ArrayList<DisciplinaModel> disciplinas, String nome) {
	
		ArrayList<DisciplinaModel> disciplinaPesquisada = new ArrayList<DisciplinaModel>();
		
		for(DisciplinaModel disciplina:disciplinas) 
			if(disciplina.getNome().toLowerCase().contains(nome.toLowerCase())) 
				disciplinaPesquisada.add(disciplina);
		
		return disciplinaPesquisada;
		
	}

}