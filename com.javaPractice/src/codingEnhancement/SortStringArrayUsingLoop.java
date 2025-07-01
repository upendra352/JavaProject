package codingEnhancement;

import java.util.Scanner;

public class SortStringArrayUsingLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n;
        String temp=null;

        System.out.println("Enter the total number of elements in the array:");
        n = sc.nextInt();
        sc.nextLine(); // ⚠️ Consume the leftover newline

        String[] name = new String[n];

        System.out.println("Enter the names you want to sort:");
        for (int i = 0; i < n; i++) {
//            System.out.print("Name " + (i + 1) + ": ");
            name[i] = sc.nextLine();
        }
        
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++){
        		
        		if(name[i].compareTo(name[j])>0) { //is used to compare two strings lexicographically (dictionary order) in Java.
        			
        			/*name[i].compareTo(name[j]) compares the string at index i with the string at index j.
        			It returns:
        			0 → if both strings are equal
        			< 0 → if name[i] comes before name[j]
        			> 0 → if name[i] comes after name[j]  */
        			
        			temp=name[i];
        			name[i]=name[j];
        			name[j]=temp;
        		}
        		
        	}
        }
        
        System.out.println("Sorted Array:");
        for(String nam:name) {
    		
    		System.out.println(nam);
    	}

			
		}
		
	

	}

