package com.aurionpro.model;

import java.util.Scanner;

 class Board {
	static char[][] board;

	 Board() {

		board = new char[3][3];
		initBoard();
	}

	 void initBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = ' ';

			}
		}
	}

	 void displayBoard() {
		System.out.println("------------");
		for (int i = 0; i < board.length; i++) {
			System.out.print("|");
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("------------");

		}

	}

	 void placeMark(int row, int column, char mark) {
		if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {
			board[row][column] = mark;

		}
	}

	 boolean colCheck() {
		for (int j = 0; j <= 2; j++) {
			if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
				return true;
			}
		}
		return false;

	}

	 boolean rowCheck() {
		for (int i = 0; i <= 2; i++) {
			if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
				return true;
			}
		}
		return false;
	}

	 boolean diagonalCheck() {
		if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
				|| board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
			return true;
		}

		return false;
	}
}

class Game {
	String name;
	char mark;

	public Game(String name, char mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	public boolean isValid(int row, int column) {
		if (Board.board[row][column] == ' ') {
			return true;
		} 
		return false;
	}

	public void makeMove() {
		Scanner sc = new Scanner(System.in);
		int row ,column;
		do {
			System.out.println("Enter row & column");
			row = sc.nextInt();
			column = sc.nextInt();
			
		}while(!isValid(row,column));

	}
}

class Play{
	
	public static void main(String[] args) {
		Board tictactoe = new Board();
		tictactoe.displayBoard();
		System.out.println();
//		tictactoe.placeMark(0, 0, 'X');
		tictactoe.placeMark(1, 2, 'O');
		tictactoe.placeMark(1, 2, 'X');
		tictactoe.placeMark(2, 0, 'O');
		tictactoe.placeMark(1, 1, 'X');
		tictactoe.placeMark(2, 2, 'X');
//		tictactoe.displayBoard();
		System.out.println(tictactoe.diagonalCheck());
		System.out.println(tictactoe.rowCheck());
		System.out.println(tictactoe.colCheck());
		
	
	}

}

