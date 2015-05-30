package br.com.divus.aj3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarTelefone {

	public static void main(String[] args) {
		String txt = "(92)98194-5657 (92)8194-5657 92 8194-5657";
		System.out.println(txt);
		Pattern padrao = Pattern.compile("\\(\\d{2}\\)[\\d]{4,5}-\\d{4}");
		Matcher matcher = padrao.matcher(txt);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
