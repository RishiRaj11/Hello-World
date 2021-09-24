/*

Have the function treeConstructor(strArr) take the array of strings stored in strArr, which will contain pairs of integers in the following format: (i1,i2), where i1 represents a child node in a tree and the second integer i2 signifies that it is the parent of i1.

For example: if strArr is ["(1,2)", "(2,4)", "(7,2)"], then this forms the following tree:
*/
import java.lang.*;
import java.util.*;

class Main{

    public static void main(String[] args){
        System.out.println("Hello");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        String [] strArr=new String[size];
        for(int i=0;i<size;i++){
            strArr[i]=sc.next();
           // System.out.println(strArr[i].charAt(1));

        }
         System.out.println(treeConstructor(strArr));
         
        
    }

    public static boolean  treeConstructor(String[] strArr){
        boolean temp=false;
        HashSet<Character> set=new HashSet<Character>();
       for(int i=0;i<strArr.length;i++){
           String str=strArr[i];
          // for(int j=0;j<str.length();i++){
               set.add(str.charAt(1));
              
          // }

           
       }
       if(set.size()==strArr.length){
            return true;
       }else{
       false;
       }

   

    }
}