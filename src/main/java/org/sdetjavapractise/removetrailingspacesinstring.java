package org.sdetjavapractise;

public class removetrailingspacesinstring {

    public static void main (String[] args){
        String str = "   Hello, World!   ";
        String trimmedStr = str.trim();
        System.out.println("Original string: '" + str + "'");
        System.out.println("Trimmed string: '" + trimmedStr + "'");
    }
}


// diffence between trim() and strip() method in java
// The trim() method removes leading and trailing whitespace characters (spaces, tabs, newlines) from a string.
// It is part of the String class in Java and has been available since Java 1.0.
// Example: "   Hello   ".trim() results in "Hello".
// The strip() method, introduced in Java 11, also removes leading and trailing whitespace characters but is more Unicode-aware.
// It can handle a wider range of whitespace characters defined by the Unicode standard.
// Example: "   Hello   ".strip() also results in "Hello", but it can handle additional Unicode whitespace characters that trim() might not remove.
// In summary, while both methods serve to remove unwanted spaces from the beginning and end of a string, strip() is more comprehensive in its handling of whitespace characters due to its Unicode support.
// actually what unicode do here is it is a standard for encoding characters used in most of the world’s writing systems. It assigns a unique number (code point) to each character, regardless of the platform, program, or language. This allows for consistent representation and manipulation of text across different systems.