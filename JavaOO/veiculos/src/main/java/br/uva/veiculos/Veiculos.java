package br.uva.veiculos;

import br.uva.veiculos.modelos.Aviao;
import br.uva.veiculos.modelos.Carro;
import br.uva.veiculos.modelos.Lancha;
import br.uva.veiculos.modelos.Motor;

public class Veiculos {

	public static void main(String[] args) {
		
		Motor[] motores = new Motor[5];
		Lancha[] lanchas = new Lancha[5];
		Aviao[] avioes = new Aviao[5];
		Carro[] carros = new Carro[5];
		
		motores[0] = new Motor(5000.0,100000,400,"V4", 100000.0);
		motores[1] = new Motor(4500.0,1000000,600,"V6", 800000.0);
		motores[2] = new Motor(15000.0,800000,800,"V8", 1800000.0);
		motores[3] = new Motor(6000.0,100000,550,"V10", 100000.0);
		motores[4] = new Motor(900000.0,100000000,600,"V12", 5100000.0);
		
		avioes[0] = new Aviao("Boeing","737","BRANCO",90.0,80.0,90000000.0,motores[4],motores[4],motores[4],motores[4],"B777B0");
		avioes[1] = new Aviao("Airbus","A320","BRANCO E AZUL",90.0,80.0,90000000.0,motores[4],motores[4],motores[4],motores[4],"AA320BZ");
		avioes[2] = new Aviao("DC-9","MD-80","AZUL",90.0,80.0,90000000.0,motores[4],motores[4],motores[4],motores[4],"DMD80A0");
		avioes[3] = new Aviao("Bombardier","Q Series","BRANCO E VERMELHO",90.0,80.0,80000000.0,motores[4],motores[4],motores[4],motores[4],"BQS00BV");
		avioes[4] = new Aviao("Boeing","777","BRANCO E PRETO",90.0,80.0,90000000.0,motores[4],motores[4],motores[4],motores[4],"B777B0");
		
		carros[0] = new Carro("FIAT", "UNO","PRATA",3.0,1.5,16000.0,motores[0],"FUP-3110");
		carros[1] = new Carro("RENAULT", "KWID","PRETO",3.0,1.5,39000.0,motores[0],"RKP-3130");
		carros[2] = new Carro("HYUNDAI", "HB20","VERMELHO",3.0,1.5,49555.0,motores[0],"HHV-3110");
		carros[3] = new Carro("VOLKSWAGEM", "GOL","BRANCO",3.0,1.5,54116.0,motores[0],"VGB-3150");
		carros[4] = new Carro("PEOGEOT", "206","PRATA",3.0,1.5,8000.0,motores[0],"FUK-3180");
		
		lanchas[0] = new Lancha("XSpeed", "120", "BRANCO", 12.0, 4.0, 5000000.0,motores[3]);
		lanchas[0] = new Lancha("Ventura", "195 Crossover", "BRANCO", 12.0, 4.0, 8000000.0,motores[2]);
		lanchas[0] = new Lancha("Real", "220", "BRANCO", 12.0, 4.0, 200000.0,motores[1]);
		lanchas[0] = new Lancha("FS", "230 Scappare", "BRANCO", 12.0, 4.0, 6000000.0,motores[3]);
		lanchas[0] = new Lancha("SOLARA", "235 Cabin", "BRANCO", 12.0, 4.0, 870000.0,motores[3]);
		
		for (Carro c : carros) {
			if (c != null) {
				c.imprimir();
			}
		}

		for (Lancha l : lanchas) {
			if (l != null) {
				l.imprimir();
			}
		}

		for (Aviao a : avioes) {
			if (a != null) {
				a.imprimir();
			}
		}
	}

}
