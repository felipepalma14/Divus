package br.com.divus.aj4.labs.lab02_02.br.com.globalcode.util;

import java.io.*;

public class Teclado {

    public static String le() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String texto = reader.readLine();
        return texto;
    }
}
