import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        playTicTacToe();
    }

    public static void playTicTacToe() {
        char[][] field = createField();
        resetField(field);
        showField(field);
        char whoseMove = 'O';
        do {
            whoseMove = makeMove(field, whoseMove);
        } while (!checkWinUniversal(field) && !checkDraw(field));
    }

    static char makeMove(char[][] field, char whoseMove) {
        if (whoseMove == 'O') {
            whoseMove = 'X';
            playerMove(field);
        } else {
            whoseMove = 'O';
            computerMove(field);
        }
        showField(field);
        return whoseMove;
    }

    public static boolean checkDraw(char[][] field) {
        boolean flag = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == '-') flag = false;
            }
        }
        if (flag) {
            System.out.println("That's a draw");
        }
        return flag;
    }

    public static boolean checkWin(char[][] field) {
        if (checkHorizontalBigField(field) || checkVerticalBigField(field) || checkStraightDiagonalsBigField(field) || checkReverseDiagonalsBigField(field))
            return true;
        return false;
    }

    static boolean checkWinUniversal(char[][] field){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (makeSplash(field, i, j)){
                    if (field[i][j] == 'X') System.out.println("You win!"); else System.out.println("Loser!");
                    return true;
                }
            }
        }
        return false;
    }

    static boolean makeSplash(char[][] field, int i, int j){
        if (makeHorizontal(field, i, j) || makeVertical(field, i, j) || makeDiagonal(field, i, j)) return true;
        return false;
    }

    static boolean makeHorizontal(char[][] field, int i, int j){
        int counter = 1;
        for (int k = 0; k < 3; k++)
        {
            if ((j+1)< field.length) {
                if ((field[i][j] == field[i][j + 1]) && (field[i][j] != '-')) {
                    counter++;
                }
                j++;
            }
        }
        if (counter > 3) return true;
        return false;
    }

    static boolean makeVertical(char[][] field, int i, int j){
        int counter = 1;
        for (int k = 0; k < 3; k++)
        {
            if ((i+1)< field[0].length) {
                if ((field[i][j] == field[i + 1][j]) && (field[i][j] != '-')) {
                    counter++;
                }
                i++;
            }
        }
        if (counter > 3) return true;
        return false;
    }

    static boolean makeDiagonal(char[][] field, int i, int j){
        int counter = 1;
        for (int k = 0; k < 3; k++)
        {
            if (((i+1)< field[0].length) && ((j+1)<field.length)) {
                if ((field[i][j] == field[i + 1][j + 1]) && (field[i][j] != '-')) {
                    counter++;
                }
                i++;
                j++;
            }
        }
        if (counter > 3) return true;
        return false;
    }

    static boolean checkHorizontalBigField(char[][] field) {
        int counter = 1;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < (field[0].length - 1); j++) {
                if (field[i][j] != field[i][j + 1]) {
                    if (counter < 4) {
                        counter = 1;
                    }
                } else {
                    if (field[i][j] != '-') {
                        counter++;
                    }
                }
            }
            if ((counter > 3) && (field[i][1] != '-')) {
                whoIsTheWinner(field[i][1]);
                return true;
            }
            counter = 1;
        }
        return false;
    }

    static boolean checkVerticalBigField(char[][] field) {
        int counter = 1;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < (field[0].length - 1); j++) {
                if (field[j][i] != field[j + 1][i]) {
                    if (counter < 4) {
                        counter = 1;
                    }
                } else {
                    if (field[j][i] != '-') {
                        counter++;
                    }
                }
            }
            if ((counter > 3) && (field[1][i] != '-')) {
                whoIsTheWinner(field[1][i]);
                return true;
            }
            counter = 1;
        }
        return false;
    }

    static boolean checkStraightDiagonalsBigField(char[][] field) {
        int counter = 1;
        int counter1 = 1;
        int counter2 = 1;
        for (int i = 0, j = 0; i < (field.length - 1); i++, j++) {
            if (field[i][j] == field[i + 1][j + 1]) {
                if (field[i][j] != '-') {
                    counter++;
                }
            }
        }
        for (int i = 1, j = 0; i < (field.length - 1); i++, j++){
            if (field[i][j] == field[i + 1][j + 1]) {
                if (field[i][j] != '-') {
                    counter1++;
                }
            }
        }
        for (int i = 0, j = 1; j < (field.length - 1); i++, j++){
            if (field[i][j] == field[i + 1][j + 1]) {
                if (field[i][j] != '-') {
                    counter2++;
                }
            }
        }
        if ((counter > 3) && (field[1][1] != '-')) {
            whoIsTheWinner(field[1][1]);
            return true;
        }
        if ((counter1 > 3) && (field[1][0] != '-')) {
            whoIsTheWinner(field[2][1]);
            return true;
        }
        if ((counter2 > 3) && (field[0][1] != '-')) {
            whoIsTheWinner(field[1][2]);
            return true;
        }
        return false;
    }

    static boolean checkReverseDiagonalsBigField(char[][] field) {
        int counter = 1;
        int counter1 = 1;
        int counter2 = 1;
        for (int i = 0, j = 0; i < (field.length - 1); i++, j++) {
            if (field[i][field[0].length - j - 1] == field[i + 1][field[0].length - j - 2]) {
                if(field[i][field[0].length - j - 1] != '-'){
                    counter++;
                }
            }
        }
        for (int i = 1, j = 0; i < (field.length - 1); i++, j++) {
            if (field[i][field[0].length - j - 1] == field[i + 1][field[0].length - j - 2]) {
                if(field[i][field[0].length - j - 1] != '-'){
                    counter1++;
                }
            }
        }
        for (int i = 0, j = 1; i < (field.length - 2); i++, j++) {
            if (field[i][field[0].length - j - 1] == field[i + 1][field[0].length - j - 2]) {
                if(field[i][field[0].length - j - 1] != '-'){
                    counter2++;
                }
            }
        }
        if ((counter>3) && (field[0][field.length - 2] != '-')) {
            whoIsTheWinner(field[0][field.length - 2]);
            return true;
        }
        if ((counter1>3) && (field[1][field.length - 1] != '-')) {
            whoIsTheWinner(field[1][field.length - 1]);
            return true;
        }
        if ((counter2>3) && (field[0][field.length - 2] != '-')) {
            whoIsTheWinner(field[0][field.length - 2]);
            return true;
        }
        return false;
    }



    static boolean checkHorizontal(char[][] field) {
        boolean overlap = true;
        boolean flagBigField = field.length == 5;
        int counter = 1;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < (field[0].length - 1) && overlap; j++) {
                if (field[i][j] != field[i][j + 1]) {
                    overlap = false;
                }
            }
            if (overlap && (field[i][0] != '-')) {
                whoIsTheWinner(field[i][0]);
                return true;
            }
            overlap = true;
        }
        return false;
    }

    static boolean checkVertical(char[][] field) {
        boolean overlap = true;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < (field[0].length - 1) && overlap; j++) {
                if (field[j][i] != field[j + 1][i]) {
                    overlap = false;
                }
            }
            if (overlap && (field[0][i] != '-')) {
                whoIsTheWinner(field[0][i]);
                return true;
            }
            overlap = true;
        }
        return false;
    }

    static boolean checkStraightDiagonal(char[][] field) {
        boolean overlap = true;
        for (int i = 0, j = 0; i < (field.length - 1) && overlap; i++, j++) {
            if (field[i][j] != field[i + 1][j + 1]) {
                overlap = false;
            }
        }
        if (overlap && (field[0][0] != '-')) {
            whoIsTheWinner(field[0][0]);
            return true;
        }
        return false;
    }

    static boolean checkReverseDiagonal(char[][] field) {
        boolean overlap = true;
        for (int i = 0, j = 0; i < (field.length - 1) && overlap; i++, j++) {
            if (field[i][field[0].length - j - 1] != field[i + 1][field[0].length - j - 2]) {
                overlap = false;
            }
        }
        if (overlap && (field[0][field.length - 1] != '-')) {
            whoIsTheWinner(field[0][field.length - 1]);
            return true;
        }
        return false;
    }

    static void whoIsTheWinner(char playerSign) {
        if (playerSign == 'X') System.out.println("Congratulations!!! You are winner");
        else
            System.out.println("You're loose(");
    }

    public static char[][] createField() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of field");
        int fieldSize = sc.nextInt();
        return new char[fieldSize][fieldSize];

    }

    public static void playerMove(char[][] field) {
        int x;
        int y;
        boolean isCorrectCoordinates;
        boolean isEmptyCell;
        do {
            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input X coordinates");
                x = sc.nextInt() - 1;
                System.out.println("Input Y coordinates");
                y = sc.nextInt() - 1;
                isCorrectCoordinates = checkCoordinates(x, y, field);
                notifyIncorrectCoordinates(isCorrectCoordinates);
            } while (!isCorrectCoordinates);
            isEmptyCell = isCellEmpty(x, y, field);
            notifyOccupiedCell(isEmptyCell);
        } while (!isCellEmpty(x, y, field));
        field[x][y] = 'X';
    }

    public static boolean isCellEmpty(int x, int y, char[][] field) {
        return field[x][y] == '-';
    }

    public static boolean checkCoordinates(int x, int y, char[][] field) {
        return (x >= 0 && x < field.length) && (y >= 0 && y < field.length);
    }

    public static void notifyOccupiedCell(boolean isOccupied) {
        if (!isOccupied) {
            System.out.println("Incorrect coordinates! Occupied cell.");
        }
    }

    public static void notifyIncorrectCoordinates(boolean isCorrect) {
        if (!isCorrect) {
            System.out.println("Incorrect coordinates!");
        }
    }

    public static void computerMove(char[][] field) {
        int x;
        int y;
        Random rnd = new Random();
        do {
            x = rnd.nextInt(field.length);
            y = rnd.nextInt(field.length);
        } while (!isCellEmpty(x, y, field));
        field[x][y] = 'O';

    }

    public static void resetField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = '-';
            }
        }
    }

    public static void showField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(new char[]{field[i][j], ' '});
            }
            System.out.println();
        }
    }
}
