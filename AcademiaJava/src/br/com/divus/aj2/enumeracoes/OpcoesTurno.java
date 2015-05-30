package br.com.divus.aj2.enumeracoes;

public enum OpcoesTurno {
	//MATUTINO, VESPERTINO
	MATUTINO("8:00 as 13:30"), VESPERTINO("14:00 as 18:00");
	private String hora;
	
	OpcoesTurno(String hora){
		this.hora = hora;
	}
	
	public String getHora(){
		return this.hora;
	}
	/**
	 * 
	 */
}
