package HomeWork;
import java.util.Scanner;
class example21{

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				String[] arr = new String[9];
				//leave above alone!  write your code below
				for(int i=0;i<arr.length;i++) {
					arr[i] = input.next();
					if(arr[i].length()==0){System.out.println();}
					else{
						System.out.println(arr[i].substring(0,3));
					}}}
}
