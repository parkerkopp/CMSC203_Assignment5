import java.io.*;
import java.util.*;

public class TwoDimRaggedArrayUtility {

	
	public static double getTotal(double[][] arr) {
		
		double sum = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) 
				
				sum += arr[row][col];
			
		}
		
		return sum;
		
	}
	
	public static double getAverage(double[][] arr) {
		
		double sum = 0;
		int total = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				sum += arr[row][col];
				total++;
				
			}
			
		}
		
		return (double)(sum/total);
		
	}
	
	public static double getRowTotal(double[][] arr, int rowIndex) {
		
		double sum = 0;
		
		for(int col = 0; col < arr[rowIndex].length; col++) 
			
			sum += arr[rowIndex][col];
			
		return sum;
		
	}
	
	public static double getColumnTotal(double[][] arr, int colIndex) {
		
		double sum = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			if(colIndex < arr[row].length)
				
				sum += arr[row][colIndex];
			
		}
		
		return sum;
		
	}
	
	public static double getHighestInRow(double[][] arr, int rowIndex) {
		
		int highestIndex = 0;
		
		for(int col = 0; col < arr[rowIndex].length; col++) { 
			
			if(arr[rowIndex][col] > arr[rowIndex][highestIndex])
				
				highestIndex = col;
			
		}
		
		return arr[rowIndex][highestIndex];
		
	}
	
	public static int getHighestInRowIndex(double[][] arr, int rowIndex) {
		
		int highestIndex = 0;
		
		for(int col = 0; col < arr[rowIndex].length; col++) { 
			
			if(arr[rowIndex][col] > arr[rowIndex][highestIndex])
				
				highestIndex = col;
			
		}
		
		return highestIndex;
		
	}
	
	public static double getLowestInRow(double[][] arr, int rowIndex) {
		
		int lowestIndex = 0;
		
		for(int col = 0; col < arr[rowIndex].length; col++) { 
			
			if(arr[rowIndex][col] < arr[rowIndex][lowestIndex])
				
				lowestIndex = col;
			
		}
		
		return arr[rowIndex][lowestIndex];
		
	}
	
	public static int getLowestInRowIndex(double[][] arr, int rowIndex) {
		
		int lowestIndex = 0;
		
		for(int col = 0; col < arr[rowIndex].length; col++) { 
			
			if(arr[rowIndex][col] < arr[rowIndex][lowestIndex])
				
				lowestIndex = col;
			
		}
		
		return lowestIndex;
		
	}
	
	public static double getHighestInColumn(double[][] arr, int colIndex) {
		
		int highestIndex = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			if(colIndex < arr[row].length && arr[row][colIndex] > arr[highestIndex][colIndex])
				
				highestIndex = row;
			
		}
		
		return arr[highestIndex][colIndex];
		
	}
	
	public static int getHighestInColumnIndex(double[][] arr, int colIndex) {
		
		int highestIndex = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			System.out.println(highestIndex + " " + row);
			
			if(colIndex < arr[row].length && arr[row][colIndex] > arr[highestIndex][colIndex])
				
				highestIndex = row;
			
		}
		
		return highestIndex;
		
	}
	
	public static double getLowestInColumn(double[][] arr, int colIndex) {
		
		int lowestIndex = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			if(colIndex < arr[row].length && arr[row][colIndex] < arr[lowestIndex][colIndex])
				
				lowestIndex = row;
			
		}
		
		return arr[lowestIndex][colIndex];
		
	}
	
	public static int getLowestInColumnIndex(double[][] arr, int colIndex) {
		
		int lowestIndex = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			if(colIndex < arr[row].length && arr[row][colIndex] < arr[lowestIndex][colIndex])
				
				lowestIndex = row;
			
		}
		
		return lowestIndex;
		
	}
	
	public static double getHighestInArray(double[][] arr) {
		
		int highestRow = 0;
		int highestCol = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				if(arr[row][col] > arr[highestRow][highestCol]) {
					
					highestRow = row;
					highestCol = col;
					
				}
				
			}
			
		}
		
		return arr[highestRow][highestCol];
		
	}
	
	public static double getLowestInArray(double[][] arr) {
		
		int lowestRow = 0;
		int lowestCol = 0;
		
		for(int row = 0; row < arr.length; row++) {
			
			for(int col = 0; col < arr[row].length; col++) {
				
				if(arr[row][col] < arr[lowestRow][lowestCol]) {
					
					lowestRow = row;
					lowestCol = col;
					
				}
				
			}
			
		}
		
		return arr[lowestRow][lowestCol];
		
	}
	
	public static double[][] readFile(File file) throws FileNotFoundException{
		
		double[][] arr = new double[6][];
		
        int row=0;
        
        Scanner inFile = new Scanner(file);
        
        while (inFile.hasNextLine()) {
        	
            String[] temp = inFile.nextLine().split(" ");
            arr[row] = new double[temp.length];
            
            for (int col=0;col<temp.length;col++)
            	
                arr[row][col] = Double.parseDouble(temp[col]);
            
            row++;
            
        }
        
        inFile.close();
        return arr;
		
	}
	
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException{
		
		PrintWriter pw = new PrintWriter(outputFile);
        for (int row=0;row<data.length;row++) {
            for (int col=0;col<data[row].length;col++) {
                pw.printf("%.2f ",data[row][col]);
            }
            pw.println();
        }
        pw.close();
		
	}
	
}
