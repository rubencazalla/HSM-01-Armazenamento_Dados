//Em um processo seletivo para trainee em uma fintech, foi solicitada a criação de um programa 
//que permita calcular as médias dos valores de ações na bolsa ao longo de um mês.
//Nesse caso, considere que os meses têm 28 dias e quatro semanas.
//O programa deve apresentar as médias semanais (a menor e maior) e mensal.

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
			

			System.out.println("Média Semanal : "+Math.round(semanal/acao[linha].length));		
			System.out.println("====================================================================");
			System.out.println("");
		}
		
		System.out.println("Média Mensal :"+Math.round(mensal/dias));
		
		
	}

}
