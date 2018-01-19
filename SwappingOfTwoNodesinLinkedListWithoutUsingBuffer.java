package Examples;
/*@Author : Ashwini.
 * create a class for swapping of two nodes without using 
 * temp var in Single LinkedList.
 */

public class SwappingOfTwoNodesinLinkedListWithoutUsingBuffer {

	public static SingleLinkedListTest kthPartitionOfList(SingleLinkedListTest head, int xvalue) {
		SingleLinkedListTest smallhead = null;
		SingleLinkedListTest smalltail = null;
		SingleLinkedListTest largehead = null;
		SingleLinkedListTest largetail = null;
		SingleLinkedListTest equalhead = null;
		SingleLinkedListTest equaltail = null;

		while (head != null) {

			if (head.data == xvalue) {
				if (equalhead == null) {
					equalhead = equaltail = head;
				} else {
					equaltail.next = head;
					equaltail = equaltail.next;
				}
			} else if (head.data < xvalue) {

				if (smallhead == null) {
					smallhead = smalltail = head;
				} else {
					smalltail.next = head;
					smalltail = smalltail.next;
				}

			} else if (head.data > xvalue) {
				if (largehead == null) {
					largehead = largetail = head;
				} else {
					largetail.next = head;
					largetail = largetail.next;
				}

			}
			head = head.next;

		}

		if (largetail != null) {
			largetail.next = null;
		}

		if (smallhead == null) {
			if (equalhead == null) {
				return largehead;
			} else {
				equaltail.next = largehead;
				return equalhead;
			}

		}
		if (equalhead == null) {
			smalltail.next = largehead;
			return smallhead;

		}
		smalltail.next = equalhead;
		equaltail.next = largehead;
		return smallhead;

	}

	public static void display(SingleLinkedListTest head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

	public static void main(String args[]) {
		SingleLinkedListTest head = new SingleLinkedListTest(1);
		SingleLinkedListTest second = new SingleLinkedListTest(10);
		SingleLinkedListTest third = new SingleLinkedListTest(3);
		SingleLinkedListTest last = new SingleLinkedListTest(4);
		SingleLinkedListTest least = new SingleLinkedListTest(5);

		head.next = second;
		second.next = third;
		third.next = last;
		last.next = least;

		display(kthPartitionOfList(head, 3));

	}

}
