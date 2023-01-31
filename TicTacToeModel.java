package com.monocept.model;

import java.util.Scanner;

public class TicTacToeModel {
	static Scanner sc = new Scanner(System.in);

	public void playGame() {
		char arr[][] = new char[3][3];
		boolean flag = true;
		char chance = 'X';
		while (flag) {
			int row, col;
			System.out.println("Player " + chance + ", enter your move (row[1-3] column[1-3]) :");
			row = sc.nextInt();
			col = sc.nextInt();
			if (arr[row - 1][col - 1] == 'X' || arr[row - 1][col - 1] == 'O') {
				System.out.println("This move at (" + row + " " + col + " ) is not valid. Try again...");
				continue;
			}
			arr[row - 1][col - 1] = chance;
			if (checkWinner(arr, chance)) {
				System.out.println("Player " + "'" + chance + "'" + " won!");
				break;
			}
			if (chance == 'X')
				chance = 'O';
			else
				chance = 'X';

		}
	}

	private boolean checkWinner(char[][] arr, char C) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				System.out.print(arr[i][j] + "|");
			System.out.println();
		}
		if ((arr[0][0] == C && arr[0][1] == C && arr[0][2] == C) || (arr[0][0] == C && arr[1][0] == C && arr[1][1] == C)
				|| (arr[0][0] == C && arr[1][1] == C && arr[2][2] == C)
				|| (arr[0][1] == C && arr[1][1] == C && arr[2][1] == C)
				|| (arr[0][0] == C && arr[1][0] == C && arr[2][0] == C)
				|| (arr[0][2] == C && arr[1][2] == C && arr[2][2] == C)
				|| (arr[0][2] == C && arr[1][1] == C && arr[2][0] == C)
				|| (arr[1][0] == C && arr[1][1] == C && arr[1][2] == C)
				|| (arr[2][0] == C && arr[2][1] == C && arr[2][2] == C)) {
			return true;

		}

		return false;
	}

}
