import java.util.Scanner; 

public class ConsumoMedio {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in); 
		double distanciaPercorrida; 
		double combGasto; 
		double consumoMedio;
		System.out.println("Ol�, por favor informe a dist�ncia percorrida."); 
		distanciaPercorrida = leitor.nextDouble(); 
		System.out.println("Por favor informe quantidade de combustivel consumido"); 
		combGasto = leitor.nextDouble(); 
        consumoMedio = distanciaPercorrida / combGasto ; 
        System.out.println("O consumo m�dio foi de " + consumoMedio + "."); 
        leitor.close();
		
		

	}

}
