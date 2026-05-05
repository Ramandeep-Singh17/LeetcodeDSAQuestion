// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

//  // tigh sala 5 edge case hai and ek alag se method bhi banana pada hai 
//  // chutiyap question hai but important
// class Solution {
//     public int length( ListNode head){
//         int len= 0;
//          ListNode temp = head;
//          while(temp!=null){
//             temp=temp.next;
//             len++;
//          }
//          return len;
//     }
//     public ListNode rotateRight(ListNode head, int k) {
//         if(head==null||head.next==null) return head;
//         int n =length(head);
//         k%=n;
//         if(k==0) return head;
//         ListNode slow = head;
//         ListNode fast = head;
//         for(int i =1;i<=k+1;i++){
//             fast = fast.next;
//         }
//          while (fast!=null){
//             slow = slow.next;
//             fast = fast.next;
//          }
//         ListNode a= slow.next;
//          slow.next = null;// to save from loop
//           ListNode tail = a;
//            while(tail.next != null){
//              tail = tail.next;
//            }
//            tail.next=head;
//            return a;
//     }
// }


//2nd method using ArrayList
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        int n = list.size();
        k = k % n;
        if (k == 0) return head;

        // new head index after rotation
        int cut = n - k;

        // break
        list.get(cut - 1).next = null;

        // connect tail to old head
        list.get(n - 1).next = list.get(0);

        // return new head
        return list.get(cut);
    }
}

