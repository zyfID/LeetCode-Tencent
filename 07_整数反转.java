/**
 * 7.整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * */


public class Reverse {
	
	public int reverse(int x) {

		String num = String.valueOf(x);
		String newNum = "";
		long result;
		
		for(int i=num.length()-1; i>=0; i--) {
			newNum += num.charAt(i);
		}
		
		if (newNum.endsWith("-")) {
			newNum = newNum.replace("-", "");
			result = -Long.parseLong(newNum);
		}else {
			result = Long.parseLong(newNum);
		}
		
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		}else {
			return (int)result;
		}
		
	}
	
	public int reverseOfficial(int x) {
		int rev = 0;
		int pop;
		
		while(x != 0) {
			pop = x % 10;
			x /= 10;
			
			if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE && pop > 7)) {
				return 0;
			}
			
			if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE && pop < -8)) {
				return 0;
			}
			
			rev = rev * 10 + pop;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		Reverse sol = new Reverse();
		int x = 1654321654;
		int result;
		result = sol.reverseOfficial(x);
		System.out.println(result);
	}

}
