package com.ossez.lang.tutorial.tests.lintcode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ossez.lang.tutorial.models.ListNode;

/**
 * <p>
 * 1480
 * <ul>
 * <li>@see
 * <a href= "https://www.cwiki.us/display/ITCLASSIFICATION/Dot+Product">https://www.cwiki.us/display/ITCLASSIFICATION/Dot+Product</a>
 * <li>@see<a href= "https://www.lintcode.com/problem/dot-product/">https://www.lintcode.com/problem/dot-product/</a>
 * </ul>
 * </p>
 * 
 * @author YuCheng
 *
 */
public class LintCode0102HasCycleTest {

	private final static Logger logger = LoggerFactory.getLogger(LintCode0102HasCycleTest.class);

	/**
	 * 
	 */
	@Test
	public void testMain() {
		logger.debug("BEGIN");
		// INIT LINKED LIST
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);

		// CREATE A LOOP
		head.next.next.next.next = head.next.next.next;

		boolean retResult = false;

		// LIKED LIST MAY NULL:
		if (!(head == null || head.next == null)) {
			ListNode s = head;
			ListNode f = head.next;

			while (f.next != null && f.next.next != null) {

				s = s.next;
				f = f.next.next;

				if (f == s) {
					retResult = true;
					break;
				}
			}
		}

		System.out.println(retResult);

	}

}