package stack;

import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_in_String_II_2 {

	 public static class Node{
	        char data;
	        int freq ;
	        public Node(char data , int freq){
	            this.data =data;
	            this.freq=freq;
	        }
	     }
	    public String removeDuplicates(String s, int k) {
	        Stack<Node> st = new Stack<>();
	        for(int i=0;i<s.length();i++){
	            if(st.isEmpty()){
	                Node newNode = new Node(s.charAt(i),1);
	                st.push(newNode);
	                continue;
	            }
	            Node temp = st.peek();
	            if(s.charAt(i)==temp.data){
	                 
	                if(temp.freq==k-1){
	                    st.pop();
	                }else{ 
	                    st.peek().freq++;
	                }
	            }else{
	                Node newNode = new Node(s.charAt(i),1);
	                st.push(newNode);
	            } 
	        } 
	        StringBuilder sb = new StringBuilder();
	        while(!st.isEmpty()){
	             Node temp = st.pop();
	            int index = temp.freq;
	            for(int i=0;i<index;i++){
	                sb.append(temp.data);
	            }
	        }
	        return sb.reverse().toString();
	    }
}
