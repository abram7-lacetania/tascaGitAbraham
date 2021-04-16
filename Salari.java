import java.util.Scanner;
import EmpleatBR;

public class Salari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserti Tipus Empleat (0.Venedor, 1.Encarregat):");
		int tipus = input.nextInt();
		System.out.println("Import de Vendes mes :");
		int vendes = input.nextInt();
		System.out.println("Hores extra mes: ");
		int hores = input.nextInt();
		float salariB = calculSalariBrut(tipus,vendes,hores);
		input.close();
	}

}
