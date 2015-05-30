package br.com.divus.aj2.modelo;

import br.com.divus.aj2.enumeracoes.OpcoesTurno;

public class Turma {
	private String nome;
	private String sala;
	private OpcoesTurno turno;
	
	public Turma(String nome){
		this.nome = nome;
	}
	public Turma(String nome, String sala){
		this(nome);
		this.sala = sala;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: "+ this.getNome()+"\nSala:"+ this.getSala()+"\nTurno: "+ turno.getHora();
	}
	

	
		
		//geT E sET

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public void setTurno(OpcoesTurno turno) {
		this.turno = turno;
	}
	
	public OpcoesTurno getTurno() {
		return turno;
	}
	
	
}
