
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ttt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[][] board = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		int computerPick;

		// String pick = JOptionPane.showInputDialog(board);
		
		// Check for winner
		while (((board[1][1] != board[0][0]) && (board[1][1] != board[2][2]))
				|| ((board[1][1] != board[0][2]) && (board[1][1] != board[2][0]))
				|| ((board[1][1] != board[1][0]) && (board[1][1] != board[1][2]))
				|| ((board[1][1] != board[0][1]) && (board[1][1] != board[2][1]))
				|| ((board[1][0] != board[0][0]) && (board[0][0] != board[2][0]))
				|| ((board[0][2] != board[0][0]) && (board[0][0] != board[0][1]))
				|| ((board[2][2] != board[2][0]) && (board[2][1] != board[2][2]))
				|| ((board[2][2] != board[0][2]) && (board[1][2] != board[2][2]))) {
			outputArray(board);
			System.out.print("Pick a space: ");
			int pick = input.nextInt();

			if (pick == 1)
				board[0][0] = "X";
			else if (pick == 2)
				board[0][1] = "X";
			else if (pick == 3)
				board[0][2] = "X";
			else if (pick == 4)
				board[1][0] = "X";
			else if (pick == 5)
				board[1][1] = "X";
			else if (pick == 6)
				board[1][2] = "X";
			else if (pick == 7)
				board[2][0] = "X";
			else if (pick == 8)
				board[2][1] = "X";
			else if (pick == 9)
				board[2][2] = "X";
			else
				System.out.print("Invalid move.");

			// Computer move
			computerPick = 1 + (int) (Math.random() * 9);
			
			// Check if user picked that space
			while (computerPick == pick)
				computerPick = 1 + (int) (Math.random() * 9);

			if (computerPick == 1)
				board[0][0] = "O";
			else if (computerPick == 2)
				board[0][1] = "O";
			else if (computerPick == 3)
				board[0][2] = "O";
			else if (computerPick == 4)
				board[1][0] = "O";
			else if (computerPick == 5)
				board[1][1] = "O";
			else if (computerPick == 6)
				board[1][2] = "O";
			else if (computerPick == 7)
				board[2][0] = "O";
			else if (computerPick == 8)
				board[2][1] = "O";
			else if (computerPick == 9)
				board[2][2] = "O";

			System.out.printf("\nComputer picks %d", computerPick);
			System.out.println("\n");
		}
		System.out.println("Tic Tac Toe!");
		
	}

	public static void outputArray(String[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++)
				System.out.printf("%s  ", array[row][column]);
			System.out.println();
		}
	}

}
// How do you determine the winner, Adrian?
