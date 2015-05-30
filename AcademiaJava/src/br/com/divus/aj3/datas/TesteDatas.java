package br.com.divus.aj3.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date data = new Date();
		System.out.println(1900 + data.getYear());
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		Date data2 = cal.getTime();
		System.out.println("data 2 - " +data2);
		
		//cal.add(Calendar.DAY_OF_MONTH, 1);//acrescenta +1 dia
		
		//verificar roll(Calendar.DAY_MONTH, -10)
		
		data2 = cal.getTime();
		System.out.println("data 2 - " +data2);
		
		SimpleDateFormat formatador = new SimpleDateFormat(
				"'manaus 'EEEE dd 'de' MMMM 'de' yyyy ");
		System.out.println(formatador.format(cal.getTime()));
		
		
		String dataDigitada = "17/02/2015";
		
		SimpleDateFormat parser = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Calendar cal2 = Calendar.getInstance();
			cal2.setTime(parser.parse(dataDigitada));
			System.out.println("data formatada: " + formatador.format(cal2.getTime()));
		} catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
