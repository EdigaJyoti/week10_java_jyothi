package com.corenuts.assessment.jan11;

public class HaloSquarePattern {
	
	public static void main(String[] args) {
		
		int value=5;
		
		for(int row=1;row<=value;row++)
		{
			for(int column=1;column<=value;column++) 
			{
				
				if(row==1||column==1||row==value||column==value)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
