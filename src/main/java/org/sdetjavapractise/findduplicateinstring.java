package org.sdetjavapractise;
import java.util.*;

public class findduplicateinstring {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str=str.toLowerCase();
        char[] charArray = str.toCharArray();

        Map<Character,Integer>freq=new LinkedHashMap<>();
        for(char c:charArray){
            if(freq.containsKey(c)){
                freq.put(c,freq.get(c)+1);
            }else{
                freq.put(c,1);
            }
        }

        System.out.print("Unique characters in the given string are: "+freq.size()+"  "+freq);
        for(Map.Entry<Character,Integer>entry:freq.entrySet()){
            if(entry.getValue()>1 && entry.getKey()!=' '){
                System.out.print("["+entry.getKey()+" : "+entry.getValue()+"]");

            }
        }
        sc.close();
    }
}


// here we can learn how to find duplicate characters in a string using a HashMap in Java.
// The code reads a string input from the user, converts it to lowercase, and then counts the frequency of each character using a LinkedHashMap.
// Finally, it prints the unique characters and their frequencies, highlighting the duplicate characters using set.
// Here spaces are ignored while counting duplicates.
// but Special characters are considered.
