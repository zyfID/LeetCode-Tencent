
import org.junit.Test;

/**
 * @author zyf-PC
 * @time 2019年6月17日上午10:46:53
 */
public class AddTwoNumbers {

	/**
	 * 
	 * @param l1
	 * @param l2
	 * @return ListNode
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode pNode = new ListNode(0);
		ListNode tailer = pNode;
		
		int sum = 0;
		int dec = 0;
				
		while(l1 != null || l2 != null) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;
			
			sum = x + y + dec;
			
			//判断sum是否大于10
			dec = sum / 10;
			sum = sum % 10;
			
			ListNode newNode = new ListNode(sum);
			tailer.next = newNode;
			tailer = newNode;
			
			if (l1 != null) {
				l1 = l1.next;
			}
			
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		
		if (dec == 1) {
			tailer.next = new ListNode(dec);
		}
		
		return pNode.next;
		
	}
	
	@Test
	public void test() {
		ListNode listNode1 = new ListNode(5);
		ListNode listNode2 = new ListNode(5);
				
		ListNode result = addTwoNumbers(listNode1, listNode2);
	}
	
	
}
