import java.util.Scanner; 

public class ConsumoMedio {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in); 
		double distanciaPercorrida; 
		double combustivelGasto; 
		double consumoMedio;
		System.out.println("Olá, por favor informe a distância percorrida."); 
		distanciaPercorrida = leitor.nextDouble(); 
		System.out.println("Por favor informe quantidade de combustivel consumido"); 
		combustivelGasto = leitor.nextDouble(); 
        consumoMedio = distanciaPercorrida / combustivelGasto ; 
        System.out.println("O consumo médio foi de " + consumoMedio + "."); 
        leitor.close();
		
		

	}

}
