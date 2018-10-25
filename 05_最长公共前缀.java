import java.util.Arrays;

public class CommonPrefix {
	
	public String longestCommonPrefix(String[] strs){
		StringBuilder ans = new StringBuilder("");
		
		//数组为空，返回空字符串
		if (strs.length == 0) {
			return ans.toString();
		}
		String str0 = strs[0];
		int length1 = strs.length;
		int length2 = getShortestLength(strs);
		
		//数组含有空字符串，返回空字符串
		if (length2 == 0) {
			return ans.toString();
		}
		
		//这个循环应当从里到外循环，比较数组内每一个字符串的第i个元素，都相等的话把第i个元素存起来，一旦不相等，跳出循环
		//这里注意外循环的条件是小于最短字符串的长度
		Loop:for(int i=0; i<length2; i++){
			for(int j=1 ;j<length1; j++){
				if (str0.charAt(i) != strs[j].charAt(i)) {
					break Loop;
				}
				
			}
			ans.append(str0.charAt(i));

		}
		
		return ans.toString();
	}
	
	/**
	 * 返回数组最短的元素的长度
	 * */
	
	public int getShortestLength(String[] strs){

		if (strs.length == 0) {
			return 0;
		}
		
		int shortest = strs.length;
		int len[] = new int[shortest];
		for(int i=0; i<strs.length; i++){
			len[i] = strs[i].length();
		}
		Arrays.sort(len);
		
		return len[0];
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonPrefix com = new CommonPrefix();
		String[] strs = new String[]{"","cbc","c","ca"};
		String ans = com.longestCommonPrefix(strs);
		if (ans.isEmpty()) {
			System.out.println("\"\"");
		}else {
			System.out.println(ans);
			
		}

	}

}
