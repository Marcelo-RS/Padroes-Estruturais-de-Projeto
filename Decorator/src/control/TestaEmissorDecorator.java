package control;

import model.Emissor;
import model.EmissorBasico;
import model.EmissorDecoratorComCompressao;
import model.EmissorDecoratorComCriptografia;

public class TestaEmissorDecorator {

	public static void main (String[] args) {
		
		String mensagem = "";

		Emissor emissorCript = new EmissorDecoratorComCriptografia (new EmissorBasico ());
		emissorCript.envia (mensagem);

		Emissor emissorCompr = new EmissorDecoratorComCompressao (new EmissorBasico ());
		emissorCompr.envia (mensagem);

		Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia (new EmissorDecoratorComCompressao (new EmissorBasico ()));
		emissorCriptCompr.envia (mensagem);
	}
}