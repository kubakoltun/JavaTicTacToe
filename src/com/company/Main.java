package com.company;

import java.util.Random;
import java.util.Scanner;

//develop the game so it could be cosidered as a project
//ideas are: UI, simple AI enemy
public class Main {
    private final static char[][] board =
            {{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};
    private static boolean computer = true;
    private final static Scanner input = new Scanner(System.in);
    private static boolean checkResult() {
        if ((board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] != ' ') ||
                (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[2][1] != ' ') ||
                (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] != ' ') ||
                (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] != ' ') ||
                (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][2] != ' ') ||
                (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][2] != ' ') ||
                (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != ' ') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != ' ')) {
            if (computer) {
                System.out.println("Computer won");
            } else {
                System.out.println("You won");
            }
            return true;
        }
        if (board[0][0] != ' ' && board[1][0] != ' ' && board[2][0] != ' ' &&
                board[0][1] != ' ' && board[1][1] != ' ' && board[2][1] != ' ' &&
                board[0][2] != ' ' && board[1][2] != ' ' && board[2][2] != ' ') {
            System.out.println("Draw!");
            return true;
        }

        computer = !computer;
        return false;
    }

    private static void computerMove() {
        for (int i=0; i<3; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == ' ') {
                board[i][2] = 'X';
                return;
            }
            if (board[i][0] == 'X' && board[i][2] == 'X' && board[i][1] == ' ') {
                board[i][1] = 'X';
                return;
            }
            if (board[i][2] == 'X' && board[i][1] == 'X' && board[i][0] == ' ') {
                board[i][0] = 'X';
                return;
            }
            if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == ' ') {
                board[2][i] = 'X';
                return;
            }
            if (board[0][i] == 'X' && board[2][i] == 'X' && board[1][i] == ' ') {
                board[1][i] = 'X';
                return;
            }
            if (board[2][i] == 'X' && board[1][i] == 'X' && board[0][i] == ' ') {
                board[0][i] = 'X';
                return;
            }
        }
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == ' ') {
            board[2][2] = 'X';
            return;
        }
        if (board[0][0] == 'X' && board[2][2] == 'X' && board[1][1] == ' ') {
            board[1][1] = 'X';
            return;
        }
        if (board[2][2] == 'X' && board[1][1] == 'X' && board[0][0] == ' ') {
            board[0][0] = 'X';
            return;
        }
        if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == ' ') {
            board[2][0] = 'X';
            return;
        }
        if (board[0][2] == 'X' && board[2][0] == 'X' && board[1][1] == ' ') {
            board[1][1] = 'X';
            return;
        }
        if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == ' ') {
            board[0][2] = 'X';
            return;
        }

        for (int i=0; i<3; i++) {
            if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == ' ') {
                board[i][2] = 'X';
                return;
            }
            if (board[i][0] == 'O' && board[i][2] == 'O' && board[i][1] == ' ') {
                board[i][1] = 'X';
                return;
            }
            if (board[i][2] == 'O' && board[i][1] == 'O' && board[i][0] == ' ') {
                board[i][0] = 'X';
                return;
            }
            if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == ' ') {
                board[2][i] = 'X';
                return;
            }
            if (board[0][i] == 'O' && board[2][i] == 'O' && board[1][i] == ' ') {
                board[1][i] = 'X';
                return;
            }
            if (board[2][i] == 'O' && board[1][i] == 'O' && board[0][i] == ' ') {
                board[0][i] = 'X';
                return;
            }
        }
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == ' ') {
            board[2][2] = 'X';
            return;
        }
        if (board[0][0] == 'O' && board[2][2] == 'O' && board[1][1] == ' ') {
            board[1][1] = 'X';
            return;
        }
        if (board[2][2] == 'O' && board[1][1] == 'O' && board[0][0] == ' ') {
            board[0][0] = 'X';
            return;
        }
        if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == ' ') {
            board[2][0] = 'X';
            return;
        }
        if (board[0][2] == 'O' && board[2][0] == 'O' && board[1][1] == ' ') {
            board[1][1] = 'X';
            return;
        }
        if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == ' ') {
            board[0][2] = 'X';
            return;
        }

        boolean done = false;
        Random random = new Random();
        int a,b;
        while (!done) {
            a = random.nextInt(3);
            b = random.nextInt(3);
            if (board[a][b] == ' ') {
                board[a][b] = 'X';
                done = true;
            }
        }
    }

    private static void userMove() {
        boolean correct = false;
        System.out.println("Enter coordinates: ");
        while (!correct) {
            String coord = input.next();
            if (coord.length() != 2) {
                System.out.println("Invalid coordinates");
            } else if (coord.charAt(0) != 'a' &&
                    coord.charAt(0) != 'b' &&
                    coord.charAt(0) != 'c') {
                System.out.println("Invalid beginning of coordinates start with letter");
            }  else if (coord.charAt(1) != '1' &&
                    coord.charAt(1) != '2' &&
                    coord.charAt(1) != '3') {
                System.out.println("Invalid ending of coordinates end with number");
            } else {
                int a, b;
                if (coord.charAt(0) == 'a') {
                    a = 0;
                } else if (coord.charAt(0) == 'b') {
                    a = 1;
                } else {
                    a = 2;
                }
                if (coord.charAt(1) == '1') {
                    b = 0;
                } else if (coord.charAt(1) == '2') {
                    b = 1;
                } else {
                    b = 2;
                }
                if (board[a][b] != ' ') {
                    System.out.println("Field already occupied");
                } else {
                    board[a][b] = 'O';
                    correct = true;
                }
            }
        }
    }

    private static void printTable() {
        System.out.println();
        System.out.println("    1 2 3");
        System.out.println("a   " + board[0][0]+ "|" + board[0][1]+ "|" + board[0][2]);
        System.out.println("b   " + board[1][0]+ "|" + board[1][1]+ "|" + board[1][2]);
        System.out.println("c   " + board[2][0]+ "|" + board[2][1]+ "|" + board[2][2]);

    }

    public static void main(String[] args) {
        while (!checkResult()) {
            printTable();
            if (computer) {
                computerMove();
            } else {
                userMove();
            }
        }
        printTable();
    }
}
