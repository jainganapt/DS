package String;

import java.util.Arrays;
import java.util.List;

public class longestPanlin { 
  

    static int process(String str) { 
         
        int count[] = new int[256]; 
  
        
        for (int i = 0; i < str.length(); i++) { 
            count[str.charAt(i)]++; 
        } 
  
        
        String beg = "", mid = "", end = ""; 
  
      
        for (char ch = 'a'; ch <= 'z'; ch++) { 
             
            if (count[ch] % 2 == 1) { 
                 
                mid = String.valueOf(ch); 
  
               
                count[ch--]--; 
            }  
            else { 
               
                for (int i = 0; i < count[ch] / 2; i++) { 
                    beg += ch; 
                } 
            } 
        } 
  
        
        end = beg; 
 
        String ans = ""; 
        char[] try1 = end.toCharArray(); 
  
        for (int i = try1.length - 1; i >= 0; i--) { 
            ans += try1[i]; 
        } 
        end=ans;
  
        String st=beg + mid + end; 
        
        return st.length();
    } 
  
 
  
    
    public static void main(String[] args) { 
    	
		/*
		 * URL path = ClassLoader.getSystemResource("input.txt"); File f = new
		 * File(path.getFile());
		 * 
		 * 
		 * 
		 * BufferedReader reader = null; try { reader = new BufferedReader(new
		 * FileReader(f)); } catch (FileNotFoundException e1) { // TODO Auto-generated
		 * catch block e1.printStackTrace(); }
		 * 
		 * String str; StringBuilder ab = new StringBuilder(); try { while ((str =
		 * reader.readLine()) != null) ab.append(str); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 */
    	
    	 String[] word = {"abc","boom","abc2","boom2"};
    	 
    	 List wordist = Arrays.asList(word);
    	 
    	 
    	 wordist.stream().forEach(System.out::print);
    	
         System.out.println(process("JavaLanguage")); 
    } 
} 