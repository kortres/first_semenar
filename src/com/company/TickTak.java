package com.company;

import java.util.Random;
import java.util.Scanner;

public class TickTak {

     final char SIGN_X = 'x';
     final char SIGN_O = 'o';
     final char SIGN_EMPTY = '.';
     char[][] table;
    Random random;
    Scanner scanner;

    public TickTak() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }



}
