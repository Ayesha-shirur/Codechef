Problem
Chef considers the climate HOT if the temperature is above 2020, otherwise he considers it COLD. You are given the temperature CC, find whether the climate is HOT or COLD.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
The first and only line of each test case contains a single integer, the temperature CC.
Output Format
For each test case, print on a new line whether the climate is HOT or COLD.

You may print each character of the string in either uppercase or lowercase (for example, the strings hOt, hot, Hot, and HOT will all be treated as identical).

Constraints
1 \leq T \leq 501≤T≤50
0 \leq C \leq 400≤C≤40


Sample 1: 
Input     |  Output
2         |  HOT
21        |  COLD
16

Explanation:
Test case 11: The temperature is 2121, which is more than 2020. So, Chef considers the climate HOT.

Test case 22: The temperature is 1616, which is not more than 2020. So, Chef considers the climate COLD.
  
Solution :
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1; i<=t; i++)
		{
		    int c =sc.nextInt();
		    if(c>20)
		    {
		        System.out.println("HOT");
		    }
		    else
		    {
		        System.out.println("COLD");
		    }
		}
	}
}

/* Time Complexity will remain constant as O (1) */
