package Java_Assignment22;
/*
 * a program to print the following pattern:

*     a
*   a b a
* a b c b a
*   a b a
*     a
*     
*     This will  for Loops and nested loops, typecasting.
 */

public class Java_Assignment2_2
{

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//declaring all the variables 
		int CharCounter=1;
		int RevCharCnt=0;
		int SpaceLength=2; //Number of Spaces in first line
		int JoinIncremetor =1 ;
		int SpaceCounter=0;
		
		//loop for Number of lines to print
		for (RevCharCnt=2; RevCharCnt<5; RevCharCnt++) // RevCharCnt condition should be 2 + number of lines to be printed
		{
			//loop to print space
			for (SpaceCounter=SpaceLength;SpaceCounter>0 ;SpaceCounter--)
			{
				System.out.print(" ");
			}
			
			//loop to print the incremental character
			for(CharCounter=1;CharCounter<RevCharCnt;CharCounter++)
			{
				System.out.print((char)(CharCounter+96));
			}
			//loop to print the decremental character
			for(CharCounter--;CharCounter>1;CharCounter--)
			{
				System.out.print((char)((CharCounter-1)+96));
			}
			//Line break
			System.out.println(" ");
			//Reinitialize variables
			SpaceLength--;
		}
		//Reinitialize to 2 for spacelength
		SpaceLength=2;
		
		//loop for Number of lines to print in reverse
		for (RevCharCnt=SpaceLength; RevCharCnt>=1; RevCharCnt--) // j condition should be 2 + number of lines to be printed
		{
			//loop to print space
			for (SpaceCounter=1;SpaceCounter <=JoinIncremetor ;SpaceCounter++)
			{
				System.out.print(" ");
				
			}
			//loop to print the incremental character
			for(CharCounter=1;CharCounter<=RevCharCnt;CharCounter++)
			{
				System.out.print((char)(CharCounter+96));
			}
			//loop to print the decremental character
			for(CharCounter=SpaceLength;CharCounter>1;CharCounter--)
			{
				System.out.print((char)((CharCounter-1)+96));
			}
			
			//Line break
			System.out.println(" ");
			
			//Reinitialize variables
			SpaceLength--;
			JoinIncremetor++;
		}
		

	}

}
