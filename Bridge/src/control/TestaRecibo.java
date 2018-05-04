package control;

import model.GeradorDeArquivo;
import model.GeradorDeArquivoTXT;
import model.Recibo;

public class TestaRecibo {

	public static void main (String[] args) {
		
		GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT ();
		Recibo recibo = new Recibo ("K19 Treinamentos", " Marcelo Martins", 1000, geradorDeArquivoTXT);
		recibo.geraArquivo ();
	}
}
