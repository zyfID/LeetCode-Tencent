import java.util.HashMap;
import java.util.Stack;

/**
 * @author zyf-PC
 * @time 2019年6月15日上午9:39:25
 * 
 * 20.有效的括号
 */
public class Valid {
	
	private HashMap<Character, Character> mappings;
	
	public Valid() {
		
		this.mappings = new HashMap<Character, Character>();
		this.mappings.put(')', '(');
		this.mappings.put(']', '[');
		this.mappings.put('}', '{');

	}
	
	public boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if (this.mappings.containsKey(c)) {
				char top = stack.isEmpty() ? '#' : stack.pop();
				if (this.mappings.get(c) != top) {
					return false;
				}
			}else {
				stack.push(c);
			}
		}
		
		return stack.isEmpty();

	}
	
	public static void main(String[] args) {
		Valid test = new Valid();
		boolean result = test.isValid("()[]{}");
		System.out.println(result);
	}

}
