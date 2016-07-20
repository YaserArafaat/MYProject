import java.util.Scanner;
public class pizza {

	 public void solve(int num, String strt, String mid, String end) 
	 {
	       if (num == 1) 
	       {
	           System.out.println(strt + " -> " + end);
	       } else 
	       {
	           solve(num - 1, strt, end, mid);
	           System.out.println(strt + " -> " + end);
	           solve(num - 1, mid, strt, end);
	       }
	   }
	 public static void main(String[] args) {
	       pizza towersOfHanoi = new pizza();
	       System.out.print("Enter number of discs: ");
	       Scanner scanner = new Scanner(System.in);
	       int discs = scanner.nextInt();
	       towersOfHanoi.solve(discs, "A", "B", "C");
	   }
	}
