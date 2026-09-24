/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */
package GFG;

class Solution {
    int GetMiddle(Node head) {
        // code here
    int count = 0;
    Node temp = head;
    while (temp != null) {
        count++;
        temp = temp.next;
    }
        int middle = count / 2;
        temp = head;
        for (int i = 0; i < middle; i++) {
        temp = temp.next;
        }
        return temp.data;
            }
        }
    
