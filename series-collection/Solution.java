import java.util.*;

import java.io.*;



class Solution{

    public static void main(String []argh){

        Scanner in = new Scanner(System.in);

        int t=in.nextInt();

 

        for(int i=0;i<t;i++){

            int a = in.nextInt();

            int b = in.nextInt();

            int n = in.nextInt();

            int res = 0;

            int v = 1;

            for(int j = 0; j < n;j++){

               

                res = (v * b) + res;

                v = v*2;

                System.out.print(a+res+" ");



            }

            System.out.println();

           }   }

}
