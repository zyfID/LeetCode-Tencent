
public class Atoi {
	static final int INT_MAX = (int)Math.pow(2, 31);
	static final int INT_MIN = (int)-Math.pow(2, 31);
	
	public int myAtoi(String str){
		
		//首先将空字符串以及只有“+”、“-”的字符串返回0
		if (str.length() == 0 || str.equals("+") || str.equals("-")) {
			return 0;
		}
		
		StringBuilder sBuilder = new StringBuilder();
		int atoi;
		String ans = "";
		
		//先去掉字符串的首尾空格，并将只包含空格的字符串返回0
		str = str.trim();
		if (str.length()==0) {
			return 0;
		}
		
		//利用字符串第一个字符的ANCI码判断是否是数字或者‘+’、‘-’
		int x = (int)str.charAt(0);
		
		//无效字符条件
		boolean b = (x<48 || x>57) && (x!= 45 && x!=43);
		//是数字的条件
		boolean d = x>=48 && x<=57;
		
		if (b) {
			return 0;
		}
		if (x==45 || x==43) {
			sBuilder.append(str.charAt(0));
			for(int i=1; i<str.length(); i++){
				int y = (int)str.charAt(i);
				boolean c = y>=48 && y<=57;
				if (c && str.charAt(i) != ' ') {
					sBuilder.append(str.charAt(i));
				}else {
					break;
				}
			}
		}
		if(d){
			for(int i=0; i<str.length(); i++){
				int y = (int)str.charAt(i);
				boolean c = y>=48 && y<=57;
				if (c && str.charAt(i) != ' ') {
					sBuilder.append(str.charAt(i));
				}else {
					break;
				}
			}
		}
		
		ans = sBuilder.toString();
		
		
		//判断假如字符串第一个是‘+’、‘-’,后面是无效字符的情况返回0
		if (ans.equals("+") || ans.equals("-")) {
			return 0;
		}
		
		
		//将获得的数字字符串直接转换成整型数据int，利用异常处理机制，假如转换异常则判断第一个字符是正还是负，分别返回最大值、最小值 
		try {
			atoi = Integer.parseInt(ans);
			if (atoi<=INT_MIN) {
				return INT_MIN;
			}else if (atoi>=INT_MAX) {
				return INT_MAX;
			}else {
				return Integer.parseInt(ans);
			}
		} catch (Exception e) {
			// TODO: handle exception
			if (ans.charAt(0) == '-') {
				return INT_MIN;
			}else {
				return INT_MAX;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "-2000000000000000000000000000";
		//char str = '.';
		//System.out.println((int)str);
		Atoi atoi = new Atoi();
		int i = atoi.myAtoi(str);
		System.out.println(i);
	}

}
