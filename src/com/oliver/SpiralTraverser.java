package com.oliver;

public class SpiralTraverser<T> {

    // 0 : traverse right
    // 1 : traverse down
    // 2 : traverse left
    // 3 : traverse up
    private int state;
    private int rl;
    private int dl;
    private int ll;
    private int ul;
    private int moves;

    SpiralTraverser() {

        state = rl = dl = ll = ul = moves = 0;
    }

    public void traverse(T[][] array) {

        if(array == null || array.length == 0) return;

        rl = ll = moves = array[0].length - 1;
        dl = ul = array.length - 1;

        int totalMoves = array.length * array[0].length;
        int x = 0;
        int y = 0;

        while(totalMoves > 0) {
            while(moves > 0) {
                System.out.print(array[x][y] + " ");
                x = updateX(x);
                y = updateY(y);
                --totalMoves;
                --moves;
            }
            changeState();
        }
    }

    private void changeState() {

        switch (state) {
            case 0:
                state = 1;
                --ul;
                moves = dl;
                break;
            case 1:
                state = 2;
                --rl;
                moves = ll;
                break;
            case 2:
                state = 3;
                --dl;
                moves = ul;
                break;
            case 3:
                state = 0;
                --ll;
                moves = rl;
                break;
        }
    }

    private int updateX(int x) {

        switch (state) {
            case 0:
                return x;
            case 1:
                return ++x;
            case 2:
                return x;
            case 3:
                return --x;
            default:
                return x;
        }
    }

    private int updateY(int y) {

        switch (state) {
            case 0:
                return ++y;
            case 1:
                return y;
            case 2:
                return --y;
            case 3:
                return y;
            default:
                return y;
        }
    }
}
