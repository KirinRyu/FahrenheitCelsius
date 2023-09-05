import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //Declaração de scan. (Tipo scanf da linguagem C)
		int escolha = 1; // Variável que promove o loop do-while
		do {
			System.out.print("Quantos graus está em Fahrenheit: " );
			int Fahrenheit = input.nextInt();
			input.nextLine(); //Limpa o input do comando "ENTER"
			Scanner day = new Scanner(System.in);
			System.out.print("Dia e mês desta temperatura: ");
			String diaSemana = day.nextLine(); //Este método permite escrever frases com espaços presentes.
			double Celsius = (5.0/9) * (Fahrenheit - 32);
			System.out.println();
			System.out.println("- Temperatura do dia -");
			String plural = (Celsius <= 1 && Celsius >= -1) ? "grau" : "graus"; // esquerda é true e direita é false
			System.out.printf("No dia %s, estará em Celsius: %,.1f %s\n\n", diaSemana, Celsius, plural); //A vírgula no %f coloca os pontinhos para separação de milhas  
			
			try {
				Thread.sleep(1000); //Linha de código pausa 1 seg.
			}catch(InterruptedException e){} //Caso dê erro, oculte.
			
			System.out.printf("Gostaria de fazer outra verificação?\n1 = Sim\n2 = Não\n\nDecisão: ");
			escolha = input.nextInt();
			System.out.println("\n\n\n\n");
		} while(escolha  == 1); // Uso de do-while para interação com interface básica.
		System.out.print("Até logo!!\n\n");
	}
}