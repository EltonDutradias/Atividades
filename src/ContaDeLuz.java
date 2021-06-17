import java.util.Scanner;

public class ContaDeLuz {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
       int opcao=0; 
      double residencia=0.60, comercio=0.48, industria=1.29;  
      double valor, kw;  
    
       
      while(opcao !=4) { 
    	   System.out.println("FERRAMENTA DE CÁLCULO DE CONSUMO DE ENERGIA!"); 
    	   System.out.println("Selecione e opção desejada:"); 
    	   System.out.println("1 - CONTA RESIDÊNCIA."); 
    	   System.out.println("2 - CONTA COMERCIO."); 
    	   System.out.println("3 - CONTA INDÚSTRIA.");  
    	   System.out.println("4 - SAIR DO SISTEMA.");
    	   opcao = leitor.nextInt();  
    	   if(opcao !=4) {
    	   System.out.println("Por favor informe o kw/h:"); 
    	   }
    	   switch(opcao)  { 
    	   case 1: 
    		   kw = leitor.nextDouble(); 
    		   valor =  kw *residencia;  
    		   System.out.println("O valor da sua conta é R$:" + valor);
    		   break; 
    		       case 2:  
    		   kw = leitor.nextDouble(); 
    		   valor =  kw *comercio;  
    		   System.out.println("O valor da sua conta é R$:" + valor);
    		   break; 
    	case 3: 
    		   kw = leitor.nextDouble(); 
    		   valor =  kw *industria;  
    		   System.out.println("O valor da sua conta é R$:" + valor);
    		   break; 
    	case 4: 
    		System.out.println("Encerrando sistema...");
    		   
    		   }   
    	   break;
    	     
      
	} 
      leitor.close();
}  
	
}