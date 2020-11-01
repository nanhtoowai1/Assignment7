import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter row number: ");
		int rc=sc.nextInt();
		sc.close();

		if(rc%2==0) {
			System.out.println("Please enter odd number to display pattern!");
		}else {
			int mid=(rc+1)/2;
			int inc=mid;
			int dec=mid;
			int count;
			
			for(int i=1;i<=rc;i++) {
				if(i<=mid-1){
					count=1;
					for(int j=1;j<=rc;j++) {
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
					for(int j=1;j<=rc;j++) {
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

}
