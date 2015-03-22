/*
Kevin Guo
HackerRank Solution: Even Tree
https://www.hackerrank.com/challenges/even-tree
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
    int id;
    Node parent;
    ArrayList<Node> children = new ArrayList<Node>();
    int totalnodes = 0;
    public Node(int ident){
        id = ident;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s = in.readLine();
	    HashMap<String, Node> nodes = new HashMap<String,Node>();
	    Node root = new Node(1);
	    nodes.put("1", root);
	    while ((s = in.readLine()) != null/* && s.length() != 0*/){
	    	String[] parts = s.split(" ");
	    	int id = Integer.parseInt(parts[0]);
	    	Node nnode = new Node(id);
	    	nnode.parent = nodes.get(parts[1]);
	    	nnode.parent.children.add(nnode);
	    	nodes.put(parts[0], nnode);
	    }
	    computeChildren(root);
	    System.out.println(removal(root)-1);
    }
    
    public static int removal(Node root){
    	int cuts = 0;
    	for (int i = 0; i < root.children.size(); i++){
    		cuts += removal(root.children.get(i));
    	}
    	if (root.totalnodes%2 == 0){
    		cuts++;
    	}
    	return cuts;
    }
    
    public static int computeChildren(Node root){
    	int children = 0;
    	for (int i = 0; i < root.children.size(); i++){
    		children += computeChildren(root.children.get(i));
    	}
    	children += 1;
    	root.totalnodes = children;
    	return children;
    }
}