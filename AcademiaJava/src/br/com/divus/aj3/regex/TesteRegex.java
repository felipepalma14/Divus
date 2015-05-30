package br.com.divus.aj3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "carlinhos-eduardo@gmail.com" + "felipepalma14@gmail.com"
				+ "carlinhos@gmail" + "carlinhos@.com"
				+ "felipe_palma14@gmail.com" + "roberlandio@gmail.com"
				+ "felipe_est@fucapi.com" + "carlinhos@gmail.c9m";

		System.out.println(txt);

		Pattern padrao = Pattern.compile("[\\w.-]+@([A-Za-z]+\\.)+([A-Za-z])+");
		// duas contra-barras p/ indicar "\" >> contra-barra
		Matcher matcher = padrao.matcher(txt);

		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
