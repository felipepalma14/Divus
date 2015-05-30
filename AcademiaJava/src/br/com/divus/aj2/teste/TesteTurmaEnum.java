package br.com.divus.aj2.teste;

import br.com.divus.aj2.enumeracoes.OpcoesTurno;
import br.com.divus.aj2.modelo.Turma;



public class TesteTurmaEnum {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Turma turma = new Turma("Academia Java");
		turma.setSala("Sala 1");
		turma.setTurno(OpcoesTurno.MATUTINO);
		
		System.out.println(turma);
		
		System.out.println("\nPrintar Turnos");
		
	
		for (OpcoesTurno turno: OpcoesTurno.values()){
			System.out.println(turno);
		}
		
	}

}
