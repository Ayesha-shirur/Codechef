Problem
Alice buys a toy with a selling price of 100100 rupees. There is a discount of xx percent on the toy. Find the amount Alice needs to pay for it.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
The first and only line of each test case contains a single integer, xx — the discount on the toy.
Output Format
For each test case, output on a new line the price that Alice needs to pay.

Constraints
1 \leq T \leq 1001≤T≤100
0 \leq x \lt 1000≤x<100


Sample 1:
Input           |   Output         
4               |    95
5               |    91
9               |    89
11              |    79
21              |

Explanation:
Test case 11: The discount is 55 percent, i.e. 55 rupees. So, Alice will have to pay 100-5=95100−5=95 rupees.


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
	    int t= sc.nextInt();
		while(t-->0)
		{
		    int x=sc.nextInt();
		   System.out.println(100-x);
		    
		}
		
	}
	
}
