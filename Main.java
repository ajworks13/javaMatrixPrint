import java.util.Random;
import java.lang.Thread;

class Main {

	//global
	public static void heart(){
		System.out.print("\n\n               I               \n");

		System.out.print("      _____       _____        \n");
		System.out.print("     /     \\     /      \\       \n");
		System.out.print("    /       \\   /        \\      \n");
		System.out.print("   /          V           \\     \n");
		System.out.print("  (                        )    \n");
		System.out.print("  \\                       /     \n");
		System.out.print("   \\                     /      \n");
		System.out.print("    \\                   /       \n");
		System.out.print("     \\                 /        \n");
		System.out.print("      \\               /         \n");
		System.out.print("       \\            /           \n");
		System.out.print("         \\        /             \n");
		System.out.print("           \\    /               \n");
		System.out.print("             \\/                 \n");
		System.out.print("      ______ JODY  ______        \n");
		System.out.print("      ______       ______        \n");


	}
	
	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		String[] matrixPrint = { "A", "B", "C", "D", "E", "1", "2", "3", "4",
				"5", "6", "7", "8", "9", "!", "@", "#", "$",
				"%", "^", "&" };

		heart();
		
		do {
			
			int randomNumber = rand.nextInt(21);
			int randomSentenceBreak = rand.nextInt(50);
			int lineBreaker = rand.nextInt(800);
			Thread.sleep(50);

			
			if(randomSentenceBreak == 15){
				System.out.println("");
			}

			if(lineBreaker == 100){
				System.out.println("");
				System.out.println("");
			}else if(lineBreaker == 17){
				System.out.println();
				System.out.println("I like Tuna sandwiches. <3");
				System.out.println();
			}else if(lineBreaker == 1){
				heart();
				System.out.println("You are my Number 1 Jody <3");
			}/*else if(lineBreaker > 799){
				Thread.sleep(150);
			} */

			switch (randomNumber) {
				case 0:
					System.out.print(matrixPrint[0]);
					break;
				case 1:
					System.out.print(matrixPrint[1]);
					break;
				case 2:
					System.out.print(matrixPrint[2]);
					break;
				case 3:
					System.out.print(matrixPrint[3]);
					break;
				case 4:
					System.out.print(matrixPrint[4]);
					break;
				case 5:
					System.out.print(matrixPrint[5]);
					break;
				case 6:
					System.out.print(matrixPrint[6]);
					break;
				case 7:
					System.out.print(matrixPrint[7]);
					break;
				case 8:
					System.out.print(matrixPrint[8]);
					break;
				case 9:
					System.out.print(matrixPrint[9]);
					break;
				case 10:
					System.out.print(matrixPrint[10]);
					break;
				case 11:
					System.out.print(matrixPrint[11]);
					break;
				case 12:
					System.out.print(matrixPrint[12]);
					break;
				case 13:
					System.out.print(matrixPrint[13]);
					break;
				case 14:
					System.out.print(matrixPrint[14]);
					break;
				case 15:
					System.out.print(matrixPrint[15]);
					break;
				case 16:
					System.out.print(matrixPrint[16]);
					break;
				case 17:
					System.out.print(matrixPrint[17]);
					break;
				case 18:
					System.out.print(matrixPrint[18]);
					break;
				case 19:
					System.out.print(matrixPrint[19]);
					break;
				case 20:
					System.out.print(matrixPrint[20]);
					break;
				case 21:
					System.out.print(matrixPrint[21]);
					break;
			}
			
		} while (true);

	}
}
