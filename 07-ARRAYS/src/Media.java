import java.util.Scanner;
	
 
public class Media {
	
	String[] alunos = {"Ana","eu","professor"};
	float[]notas = new float[4];
	Scanner objScanner = new Scanner(System.in);
	
	 void listarAlunos( ) {
		
		//System.out.println(" + alunos[1]);
		//System.out.println("3�" +1�" + alunos[0]);
		//System.out.println("2�" alunos[2]);
		//System.out.println("4�" + alunos[3]);
		
		
   for(int indice = 0; indice < alunos.length; indice++) { 
   
	// System.out.println((indice+1) + "� NOME ALUNO(A): " + alunos[indice]);
   
	   System.out.println("NOTAS DO ALUNO(A):  " + alunos[indice]);
	   
	   int cont = 0;
	   while(cont < 4) { 
		   
		 
		   System.out.println("Digite " + (cont + 1) + "� NOTA");
		   notas[cont] = objScanner.nextFloat();
		   cont++;
		   
		   	
	   		}
	   	
   		}
		
   		System.out.println("LISTAGEM DE NOTAS: ");
   		int cont = 0;
   		while(cont < notas.length ) {
   				
   				
   			System.out.println( (cont +1) + "� NOTA: " + notas[cont]);
   			cont++;
   				}
   
   
   		System.out.println("TOTAL DE ALUNOS:" + alunos.length);	
		
		
	}

}

    