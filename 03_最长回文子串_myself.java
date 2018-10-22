	/*3.最长回文子串
	 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
	 * */
	
	
	/*
	 * 这是第一种方法，第一次想到的程序，比较麻烦，费时也是最久的。
	 * 主要思路是：从头开始遍历，然后利用stringbuilder对象添加s的元素，
	 * 再定义一个stringbuilder将目前的字符长度内的元素倒序添加进去，
	 * 比较两个内的元素是否相等。*/
	public String longestPalindrome(String s){
		if (s.length() == 1) {
			return s;
		}else {
			int length = s.length();
			int lold = 0;
			int lnew = 0;
			String s1 = "";
			String s2 = "";
			
			for(int x=0; x<length; x++){
				StringBuilder str1 = new StringBuilder("");
				
				for(int i=x; i<length; i++){
					StringBuilder str2 = new StringBuilder("");
					
					str1.append(s.charAt(i));
					if (i>=1) {
						for(int j = i; j>=x; j--){
							str2.append(s.charAt(j));
						}
					}
					
					if (str1.toString().equals(str2.toString())) {
						lnew = str1.length();
					}
					
					if (lnew > lold) {
						lold = lnew;
						s1 = str1.toString();
					}
				}
				
				if (s1.length() > s2.length()) {
					s2 = s1;
				}
				
				
			}
			
			return s2;
		}
		
		
	}
	
	
	
	/*
	 * 这是第二种
	 * */
	public String longestPalindrome1(String s){
		int length = s.length();
		int lold = 0;
		int lnew = 0;
		String s1 = "";
		String s2 = "";
		
		for(int i=0; i<length; i++){
			for(int j=i+1; j<=length; j++){
				lold = lnew;
				String s3 = s.substring(i, j);
				StringBuilder str1 = new StringBuilder(s3);
				String s4 = str1.reverse().toString();
				
				if (s3.equals(s4)) {
					lnew = s3.length();
				}
				
				if (lnew > lold) {
					s1 = s3;
				}
			}
			
			if (s1.length() > s2.length()) {
				s2 = s1;
			}
		}
		
		return s2;

	}
	
	
	public String longestPalindrome2(String s){
		int length = s.length();
		int lold = 0;
		int lnew = 0;
		String s1 = "";
		String s2 = "";
		String str2 = "";
		StringBuilder str1 = new StringBuilder("");
		
		
		for(int i=0; i<length; i++){
			str1.delete(0, str1.length());
			
			for(int j=i; j<length; j++){
				str2 = null;
				str1.append(s.charAt(j));
				str2 = str1.reverse().toString();
				str1.reverse();
				
				if (str1.toString().equals(str2)) {
					lnew = str1.toString().length();
				}
				
				if (lnew > lold) {
					lold = lnew;
					s1 = str1.toString();
				}
			}
			
			if (s1.length() > s2.length()) {
				s2 = s1;
			}
		}
		
		return s2;
	}
	
	
	public String longestPalindrome3(String s){
		
		int length = s.length();
		String s1 = "";
		String s2 = "";
		String s3 = "";
		String s4 = "";
		
		for(int i=0; i<length; i++){
			s3 = null;
			for(int j = length; j>i; j--){
				s4 = null;
				s3 = s.substring(i, j);
				StringBuilder str = new StringBuilder(s3);
				s4 = str.reverse().toString();
				
				if (s3.equals(s4)) {
					s1 = s3;
					break;
				}
				
			}
			
			if (s1.length() > s2.length()) {
				s2 = s1;
			}
		}
		
		return s2;

	}
