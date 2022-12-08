import java.util.Scanner;

public class Battleship {
  public static void main(String[] args) {
    // Create a new game board
    char[][] gameBoard = new char[10][10];

    // Initialize the game board with water ('-')
    for (int i = 0; i < gameBoard.length; i++) {
      for (int j = 0; j < gameBoard[i].length; j++) {
        gameBoard[i][j] = '-';
      }
    }

    // Place a ship on the game board
    int shipRow = (int) (Math.random() * 10);
    int shipCol = (int) (Math.random() * 10);
    gameBoard[shipRow][shipCol] = 'S';

    // Create a Scanner to read user input
    Scanner scanner = new Scanner(System.in);

    // Keep track of the number of turns
    int turns = 0;

    // Keep playing until the player sinks the ship
    while (true) {
      // Print the game board
      for (int i = 0; i < gameBoard.length; i++) {
        for (int j = 0; j < gameBoard[i].length; j++) {
          System.out.print(gameBoard[i][j] + " ");
        }
        System.out.println();
      }

      // Prompt the user to enter row and column coordinates
      System.out.print("Enter row: ");
      int row = scanner.nextInt();
      System.out.print("Enter column: ");
      int col = scanner.nextInt();

      // Increment the number of turns
      turns++;

      // Check if the user has hit the ship
      if (gameBoard[row][col] == 'S') {
        // Print a message to the user
        System.out.println("You sank my battleship in " + turns + " turns!");
        break;
      } else {
        // Update the game board to show that the user missed
        gameBoard[row][col] = 'X';
      }
    }
  }
}
