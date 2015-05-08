/**
 * Write three functions that compute the sum of integers in a
 * given list, using a for-loop, a while loop, and recursion.
 *
 * @author: todyertuz@plainitricacy.wordpress.com
 */

package LNS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the list of numbers(separated by space):");
        String[] parts = input.nextLine().split(" ");
        input.close();
        List<Integer> LNS = new ArrayList<Integer>();
        for(int i=0; i<parts.length; i++){
            LNS.add(Integer.parseInt(parts[i]));
        }
        System.out.println("For-loop sum: " + FL(LNS));
        System.out.println("While-loop sum: " + WL(LNS));
        System.out.println("Recursion sum: " + REC(LNS, 0,0));

    }

    public static int FL(List<Integer> q){
        int sum=0;
        for(int i=0; i<q.size(); i++){
            sum+=q.get(i);
        }
        return sum;
    }

    public static int WL(List<Integer> q){
        int sum=0, i=0;
        while(i<q.size()){
            sum+=q.get(i);
            i++;
        }
        return sum;
    }

    public static int REC(List<Integer> q, int x, int s){
        if(x<q.size()){
            s+=q.get(x);
            x+=1;
            return REC(q,x,s);
        }else{
            return s;
        }
    }

}
