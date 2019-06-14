
/**
 * @author zyf-PC
 * @time 2019年6月14日下午7:18:06
 * 
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Palindromic {
	
	public boolean isPalindrome(int x) {
		
		boolean result = false;
		String temp = String.valueOf(x);
		String reverse = "";
		
		for(int i=temp.length()-1; i>=0; i--) {
			reverse += temp.charAt(i);
		}
		
		if (reverse.equals(temp)) {
			result = true;
		}
		
		return result;
	}
	
	public boolean isPalindromeOfficial(int x) {
		
		boolean result = false;
		if (x < 0 || (x % 10 == 0 && x != 0)) {
			return result;
		}
		
		int reverteNumber = 0;
		while(x > reverteNumber) {
			reverteNumber = x % 10 + reverteNumber * 10;
			x = x / 10;
		}
		
		if (reverteNumber == x || reverteNumber == x / 10) {
			result = true;
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		Palindromic test = new Palindromic();
		boolean result = test.isPalindromeOfficial(10);
		System.out.println(result);
	}

}
