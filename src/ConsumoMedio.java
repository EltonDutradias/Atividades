import java.util.Scanner; 

public class ConsumoMedio {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in); 
		double distanciaPercorrida; 
		double combustivelGasto; 
		double consumoMedio;
		System.out.println("Ol�, por favor informe a dist�ncia percorrida."); 
		distanciaPercorrida = leitor.nextDouble(); 
		System.out.println("Por favor informe quantidade de combustivel consumido"); 
		combustivelGasto = leitor.nextDouble(); 
        consumoMedio = distanciaPercorrida / combustivelGasto ; 
        System.out.println("O consumo m�dio foi de " + consumoMedio + "."); 
        leitor.close();
		
		

	}

}
