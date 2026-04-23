/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        // Intersection of two linkedlists
        Node temp1 = p, temp2 = q;

        while (temp1 != temp2) {
            temp1 = (temp1 == null) ? q : temp1.parent;
            temp2 = (temp2 == null) ? p : temp2.parent;
        }
        return temp1;
    }
}