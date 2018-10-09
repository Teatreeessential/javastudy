package com.study.Arrays;

class Box{
	
	public static int[][] MakeBox(int a,int b) {
		int[][] arr = new int[a][b];
		int input = 0; 
		for(int i=0;i<arr.length;i++) { //2차원배열의 행의 갯수
			for(int j=0;j<arr[i].length;j++) { //해당 행의 배열 길이
				arr[i][j] = input++; 
			}
		}
		return arr;
	}
	
	public static void ShowBox(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) { //2차원배열의 행의 갯수
			for(int j=0;j<arr[i].length;j++) { //해당 행의 배열 길이
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] TurnBox(int[][] arr){
		int[][] turn_arr = new int[arr.length][arr[0].length];
		int Toturn_num = arr[0].length-1;
		
		for(int i=0;i<arr.length;i++) { //2차원배열의 행의 갯수
			for(int j=0;j<arr[i].length;j++) { //해당 행의 배열 길이
				turn_arr[j][Toturn_num] = arr[i][j];
			}
			Toturn_num--;
		}
		return turn_arr;
	}
}


public class test1 {

	public static void main(String[] args) {
		
		Box.ShowBox(Box.MakeBox(4, 4));
		Box.ShowBox(Box.TurnBox(Box.MakeBox(4, 4)));
		

	}

}
