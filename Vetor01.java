//Em um processo seletivo para trainee em uma fintech, foi solicitada a cria��o de um programa 
//que permita calcular as m�dias dos valores de a��es na bolsa ao longo de um m�s.
//Nesse caso, considere que os meses t�m 28 dias e quatro semanas.
//O programa deve apresentar as m�dias semanais (a menor e maior) e mensal.

public class Vetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[][]acao = new double[4][7];
		double semanal;
		double mensal=0;
		int dias = 0;
		
		System.out.println("====================================================================");
		
		for(int linha = 0; linha <= acao.length-1;linha++){
			System.out.println("Semana: "+(linha+1));
			
			semanal =0;
			
			for(int coluna=0;coluna<=acao[linha].length -1; coluna++) {	
				dias+=1;
				acao[linha][coluna]=(double)Math.round((Math.random()*100 ) );
				semanal+=acao[linha][coluna];
				
			}
			
			mensal+=semanal;
			

			System.out.println("M�dia Semanal : "+Math.round(semanal/acao[linha].length));		
			System.out.println("====================================================================");
			System.out.println("");
		}
		
		System.out.println("M�dia Mensal :"+Math.round(mensal/dias));
		
		
	}

}
