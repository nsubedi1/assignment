package assignment;
      import java.util.Scanner;

	public class Question19 {

		public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Enter side a:"  );
			int sideA =input.nextInt();
			System.out.println("Enter side b:"  );
			int sideB =input.nextInt();
			System.out.println("Enter side c:"  );
			int sideC =input.nextInt();

			if	((sideA + sideB < sideC) || (sideA+sideC<sideB)||( sideC+sideB<sideA)){
				System.out.println("invalid  triangle");
			}else if(sideA<=0||  sideB<=0||sideC<=0) {
				System.out.println("invalid triangle");
			}else if((sideA==sideB) && (sideA==sideC)){
					System.out.println("euilateral triangle");
				} else if((sideA==sideB) || (sideA==sideC)||(sideB == sideC)){
					System.out.println("isoceles triangle");
				}else {
					System.out.println("scalene triangle");
				}


			}

	}


