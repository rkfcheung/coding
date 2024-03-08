package com.rkfcheung.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
36. Valid Sudoku in a String https://leetcode.com/problems/valid-sudoku/
*/
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return false;
        }

        List<Set<Character>> colsSeen = new ArrayList<>();
        for (int col = 0; col < board[0].length; col++) {
            colsSeen.add(new HashSet<>());
        }

        for (int row = 0; row < board.length; row++) {
            Set<Character> rowSeen = new HashSet<>();
            for (int col = 0; col < board[row].length; col++) {
                char c = board[row][col];
                if (c != '.' && rowSeen.contains(c)) {
                    return false;
                }
                rowSeen.add(c);

                Set<Character> colSeen = colsSeen.get(col);
                if (c != '.' && colSeen.contains(c)) {
                    return false;
                }
                colSeen.add(c);

                if (row % 3 == 0 && col % 3 == 0) {
                    if (!validSubBox(board, row, col)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private boolean validSubBox(char[][] board, int row, int col) {
        Set<Character> seen = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = board[row + i][col + j];
                if (c != '.' && seen.contains(c)) {
                    return false;
                }
                seen.add(c);
            }
        }

        return true;
    }
}
