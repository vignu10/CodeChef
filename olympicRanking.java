// In Olympics, the countries are ranked by the total number of medals won. You are given six integers G1, S1, B1, and G2, S2, B2, the number of gold, silver and bronze medals won by two different counties respectively. Determine which country is ranked better on the leaderboard. It is guaranteed that there will not be a tie between the two countries.

// Input Format
// The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.

// The first and only line of each test case contains six space-separated integers G1, S1, B1, and G2, S2, B2.

// Output Format
// For each test case, print "1" if the first country is ranked better or "2" otherwise. Output the answer without quotes.

// Constraints
// 1≤T≤1000
// 0≤G1,S1,B1,G2,S2,B2≤30
// Subtasks
// Subtask #1 (100 points): Original constraints

// Sample Input 1 
// 3
// 10 20 30 0 29 30
// 0 0 0 0 0 1
// 1 1 1 0 0 0
// Sample Output 1 
// 1
// 2
// 1
// Explanation
// Test case 1: Total medals for the first country are 10+20+30=60 and that for the second country are 0+29+30=59. So the first country is ranked better than the second country.

// Test case 2: Total medals for the first country are 0+0+0=0 and that for the second country are 0+0+1=1. So the second country is ranked better than the first country.

// Author:	daanish_adm
// Date Added:	4-08-2021
// Time Limit:	0.5 secs
// Source Limit:	50000 Bytes
// Languages:	CPP14, C, JAVA, PYTH 3.6, CPP17, PYTH, PYP3, CS2, ADA, PYPY, TEXT, PAS fpc, NODEJS, RUBY, PHP, GO, HASK, TCL, PERL, SCALA, LUA, kotlin, BASH, JS, LISP sbcl, rust, PAS gpc, BF, CLOJ, R, D, CAML, FORT, ASM, swift, FS, WSPC, LISP clisp, SQL, SCM guile, PERL6, ERL, CLPS, ICK, NICE, PRLG, ICON, COB, SCM chicken, PIKE, SCM qobi, ST, SQLQ, NEM
// Submit
// Submission Ends In
// 10
// Days
// 2
// Hrs
// 23
// Min
// 31
// Sec
// My SubmissionsAll Submissions
// Successful Submissions







/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try {
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t--> 0)
		    {
		        int g1=sc.nextInt();
		        int s1=sc.nextInt();
		        int b1=sc.nextInt();
		        int g2=sc.nextInt();
		        int s2=sc.nextInt();
		        int b2=sc.nextInt();
		        int med1=g1+s1+b1;
		        int med2=g2+s2+b2;
		        if(med1>med2)
		        {
		            System.out.println("1");
		        }
		        else{
		            System.out.println("2");
		        }
		        
		    }
		    
		} catch(Exception e) {
	
	}
}
}
