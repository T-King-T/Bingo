package driver;

import java.util.Random;

public class Bingo {

	public static void main(String[] args) 
	{
		
		Random rand = new Random();
		
		int [][] board;			//declare the array for the bingo board
		board = new int[5][5];
		
		boolean [][] markers;		//declare the array for the markers on the bingo board
		markers = new boolean[5][5];
		for (int row = 0; row < markers.length; row++)		//initialize the boolean marker array
		{
			for (int column = 0; column < markers[row].length; column++)
			{
				markers[row][column] = false;
			}
		}
		
		boolean drawn[];			//declare the array for storing previously drawn numbers
		drawn = new boolean[76];
		for (int i = 0; i < 75; i++)
		{
			drawn[i] = false;			
		}
	
		boolean boardNum[];			//declare an array for eliminating duplicate board numbers
		boardNum = new boolean[76];
		for (int i = 0; i < 75; i++)
		{
			boardNum[i] = false;
		}
			
		//___________________________________________________________________________________________
		// assign random integers to the board array
		
        for (int row = 0; row < board.length; row++)
        {
        	int num;
        	do
        	    {
        		num = rand.nextInt(15)+1;
        	    }while(boardNum[num] == true);
        	boardNum[num] = true;
        	board[row][0] = num;       		
        	 			
        	}  	
        
        for (int row = 0; row < board.length; row++)
        {
        	int num; 
        	do
        	    {
        		num = rand.nextInt(15)+16;
        	    }while(boardNum[num] == true);
        	boardNum[num] = true;
        	board[row][1] = num;       		
        	 			
        	}  	
        
        for (int row = 0; row < board.length; row++)
        {
        	int num;
      	    do
        	    {
        		num = rand.nextInt(15)+31;
        	    }while(boardNum[num] == true);
        	boardNum[num] = true;
        	board[row][2] = num;       		
        	 			
        	}  	
        
        for (int row = 0; row < board.length; row++)
        {
        	int num;
        	do
        	    {
        		num = rand.nextInt(15)+46;
        	    }while(boardNum[num] == true);
        	boardNum[num] = true;
        	board[row][3] = num;       		
        	 			
        	}  	
        
        for (int row = 0; row < board.length; row++)
        {
        	int num;
      	    do
        	    {
        		num = rand.nextInt(15)+61;
        	    }while(boardNum[num] == true);
        	boardNum[num] = true;
        	board[row][4] = num;       		
        	 			
        	}  	
        
        //________________________________________________________________________________________
        
		
        for (int row = 0; row < board.length; row++)					//print the initial board
		{
			for (int column = 0; column < board[row].length; column++)   
			{
				System.out.print(board[row][column] + "	");
			}
			System.out.println();
		}
		
		//________________________________________________________________________________________
		boolean BINGO = false;
        while  (BINGO != true) 
		{
        	
		for (int draw = 0; draw < 75; draw++)			//loop to draw a new number w/o duplicates
		{
		int drawNum;
		do
		{
			drawNum = rand.nextInt(75)+1;
		}while (drawn[drawNum] == true);
		drawn[drawNum] = true;
		System.out.println("The drawn number is "+drawNum);
		System.out.println();
		for (int row = 0; row < board.length; row++)
		{
			for (int column = 0; column < board[row].length; column++)   
			{
				if (board[row][column] == drawNum)							//win conditions
				{
					markers[row][column] = true;
				}
				if (markers[0][0]==true && markers[0][1]==true && markers[0][2]==true && markers[0][3]==true && markers [0][4]==true)
	    		{
	    			BINGO = true;
	    		}
	    		else if(markers[1][0]==true && markers[1][1]==true && markers[1][2]==true && markers[1][3]==true && markers [1][4]==true)
	    		{
	    			BINGO = true;
	    		}
	    		else if(markers[2][0]==true && markers[2][1]==true && markers[2][2]==true && markers[2][3]==true && markers [2][4]==true)
	    		{
	    			BINGO = true;
	    		}
	    		else if(markers[3][0]==true && markers[3][1]==true && markers[3][2]==true && markers[3][3]==true && markers [3][4]==true)
	    		{
	    			BINGO = true;
	    		}
	    		else if(markers[4][0]==true && markers[4][1]==true && markers[4][2]==true && markers[4][3]==true && markers [4][4]==true)
	    		{
	    			BINGO = true;
	    		}
	    		else if(markers[0][0]==true && markers[1][0]==true && markers[2][0]==true && markers[3][0]==true && markers [4][0]==true)
	    		{
	    			BINGO = true;
	    		}
	    		else if(markers[0][1]==true && markers[1][1]==true && markers[2][1]==true && markers[3][1]==true && markers [4][1]==true)
	    		{
	    			BINGO = true;
	    		}
	    		else if(markers[0][2]==true && markers[1][2]==true && markers[2][2]==true && markers[3][2]==true && markers [4][2]==true)
	    		{
	    			BINGO = true;
	    		}
	    		else if(markers[0][3]==true && markers[1][3]==true && markers[2][3]==true && markers[3][3]==true && markers [4][3]==true)
	    		{
	    			BINGO = true;
	    		}
	    		else if(markers[0][4]==true && markers[1][4]==true && markers[2][4]==true && markers[3][4]==true && markers [4][4]==true)
	    		{
	    			BINGO = true;
	    		}
			}
		}
		for (int row = 0; row < board.length; row++)			//print the board with drawn numbers marked
		{
			for (int column = 0; column < board[row].length; column++)   
			{
				if(markers[row][column] == false)
				{
				System.out.print(board[row][column] + "	");
				}
				else
				{
					
					System.out.print("#	");
				}
			}
			System.out.println();
		}
		}
		
		
		}
	}
	}




