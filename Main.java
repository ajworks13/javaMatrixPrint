import java.util.Random;
import java.lang.Thread;

class Main {
	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		String[] matrixPrint = { "A", "B", "C", "D", "E", "1", "2", "3", "4",
				"5", "6", "7", "8", "9", "!", "@", "#", "$",
				"%", "^", "&" };
		int count = 0;

		do {
			
			int randomNumber = rand.nextInt(21);
			Thread.sleep(100);
			count+=1;
			
			if(count == 15){
				System.out.println("-----");
			}

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
					System.out.println(matrixPrint[5]);
					break;
				case 6:
					System.out.println(matrixPrint[6]);
					break;
				case 7:
					System.out.println(matrixPrint[7]);
					break;
				case 8:
					System.out.println(matrixPrint[8]);
					break;
				case 9:
					System.out.println(matrixPrint[9]);
					break;
				case 10:
					System.out.println(matrixPrint[10]);
					break;
				case 11:
					System.out.print(matrixPrint[11]);
					break;
				case 12:
					System.out.println(matrixPrint[12]);
					break;
				case 13:
					System.out.println(matrixPrint[13]);
					break;
				case 14:
					System.out.println(matrixPrint[14]);
					break;
				case 15:
					System.out.print(matrixPrint[15]);
					break;
				case 16:
					System.out.println(matrixPrint[16]);
					break;
				case 17:
					System.out.println(matrixPrint[17]);
					break;
				case 18:
					System.out.print(matrixPrint[18]);
					break;
				case 19:
					System.out.println(matrixPrint[19]);
					break;
				case 20:
					System.out.println(matrixPrint[20]);
					break;
				case 21:
					System.out.println(matrixPrint[21]);
					break;
			}
			
		} while (true);

	}
}
