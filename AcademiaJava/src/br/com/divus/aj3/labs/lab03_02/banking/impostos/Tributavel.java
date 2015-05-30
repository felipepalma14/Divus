/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package br.com.divus.aj3.labs.lab03_02.banking.impostos;

public interface Tributavel {
	public String getDescricaoTributavel();

	public String getNomeImposto();

	public double calcularImpostos();
}
