
public class App {

	public static void main(String[] args) {
		int count;
		int inc=5,dec=5;
		for(int i=1;i<=9;i++) {
			if(i<=4){
				count=1;
				for(int j=1;j<=9;j++) {
					if(j<=inc && j>=dec) {
						System.out.print(count);
						count++;
					}
					else {
						System.out.print(" ");
					}
			}
			System.out.println();
			inc++;
			dec--;
			}
			else {
				count=1;
				for(int j=1;j<=9;j++) {
					if(j<=inc && j>=dec) {
						System.out.print(count);
						count++;
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
				inc--;
				dec++;
			}
		}
	}

}
