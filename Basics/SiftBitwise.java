package operators;

public class SiftBitwise {

	public static void main(String[] args) {

		int a= 13;
		int b= a >> 1;
		int c= a << 1;
		System.out.println(b);
		System.out.println(c);
//		13- 1101 when shift right operator is used, the binary numbers 
//		are shifted one place to the right and a zero is added in the begining
//		Thus new number is 0110- 6
		
//		1101-> 0110-> 0010-> 0001-> 0000-> 0000
//		Reverse sequence goes for shift left
		
//		It is equivalent to /2
//		When shift left is used, the binary number is shifted to one place left
//		and zero is added at the end
//		Thus new number is 1010
	}
    

}
