package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    TickTak tick = new TickTak();
    public void game() {
        initTable();
        while (true) {
            turnHuman();
            if (checkWin(tick.SIGN_X)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(tick.SIGN_O)) {
                System.out.println("AI WIN!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        printTable();
    }

    void initTable() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                tick.table[row][col] = tick.SIGN_EMPTY;
    }

    void printTable() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(tick.table[row][col] + " ");
            System.out.println();
        }
    }

    void turnHuman() {
        int x, y;
        do {
            System.out.println("Enter X and Y (1..3):");
            x = tick.scanner.nextInt() - 1;
            y = tick.scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        tick.table[y][x] = tick.SIGN_X;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= 3|| y >= 3)
            return false;
        return tick.table[y][x] == tick.SIGN_EMPTY;
    }

    void turnAI() {
        int x, y;
        do {
            x = tick.random.nextInt(3);
            y = tick.random.nextInt(3);
        } while (!isCellValid(x, y));
        tick.table[y][x] = tick.SIGN_O;
    }

    boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++)
            if ((tick.table[i][0] == dot && tick.table[i][1] == dot &&
                    tick.table[i][2] == dot) ||
                    (tick.table[0][i] == dot && tick.table[1][i] == dot &&
                            tick.table[2][i] == dot))
                return true;
        if ((tick.table[0][0] == dot && tick.table[1][1] == dot &&
                tick.table[2][2] == dot) ||
                (tick.table[2][0] == dot && tick.table[1][1] == dot &&
                        tick.table[0][2] == dot))
            return true;
        return false;
    }

    boolean isTableFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (tick.table[row][col] == tick.SIGN_EMPTY)
                    return false;
        return true;
    }
}
