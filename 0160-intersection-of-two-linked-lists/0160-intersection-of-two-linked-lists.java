public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        // hm try kar rhe hai  dono LL ka length nikal le and phir uske baad 
        // dono ko subtract kar lenge and jitna differnece aayeha utna ka advantage
        // de denge ek temp node ko bade wala ko and phir jaha dono meet karega wo
        // answer ho jayega 

        int len1=0;
        ListNode temp1 = head1;
        while(temp1 !=null){
            temp1=temp1.next;
            len1++;
        }

        int len2=0;
        ListNode temp2 = head2;
        while(temp2 !=null){
            temp2=temp2.next;
            len2++;
        }

        temp1 = head1;/////// ye karna jaruri hai
        temp2 = head2;/////// ye pahle hi null per ho jayega problem

        if(len1>len2){ // len1 bada hai tu temp 1 ko bhejenge utne diff se
            for(int i =1;i<=len1-len2;i++){
                temp1=temp1.next;////// isliye ki agr nhi kiye tab pahle hi temp null 
                // per hoga and next ka mtlb nhi hoga 
            }
        }
        else{ // temp2 ko aage bhejna
            for(int i =1;i<=len2-len1;i++){
                temp2=temp2.next;
            }
        }

        while(temp1 !=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return temp1; // yahin intersection node milega (ya null)
    }
}
