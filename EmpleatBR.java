
public class EmpleatBR {
	
	public static Float calculSalariBrut(int tipus,int vendes, int hores) {
		Float salari=0.0f;
		if (tipus==0) {
			salari = salari + 1000;
		}
		if (tipus==1) {
			salari = salari + 1500;
		}
		if (vendes>=1500) {
			salari = salari + 200;
		}
		if (vendes>=1000 && vendes<1500) {
			salari = salari + 100;
		}
		if (hores>0) {
			salari = salari + (hores*20);
		}
		return salari;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
