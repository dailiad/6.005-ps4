/* Copyright (c) 2007-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package minesweeper;

import java.io.File;

/**
 * a mutable board with a size of x rows and y columns of squares
 */
public class Board {
    
    // TODO: Abstraction function, rep invariant, rep exposure, thread safety
    
    // TODO: Specify, test, and implement in problem 2
    
    /**
     * create a new random board 
     * @param sizeX width of the board
     * @param sizeY height of the board
     */
    public Board(int sizeX, int sizeY) {
        
    }
    
    /**
     * create a board with a board file
     * @param f a file to load board information
     */
    public Board(File f) {
        
    }
    
    /**
     * dig the square x,y
     * If either x or y less than 0, or either x or y greater than the board's size,
     * or square x,y is not in the untouched state, do nothing and return true.
     * If square x,y¡¯s state is untouched , change square x,y¡¯s state to dug .
     * If square x,y contains a bomb, change it so that it contains no bomb and return false, else return true
     * If the square x,y has no neighbor squares with bombs, then for each x,y's untouched neighbor squares,
     * change said squares to dug and repeat this step(not the entire procedure) recursively for said neighbor
     * squares unless said square was already dug before said change.
     * contains a bomb, change the state to dug
     * @param x x coordinate of the square to dig
     * @param y y coordinate of the square to dig
     * @return true if the square isn't an untouched bomb, false else.
     */
    public boolean dig(int x, int y) {
        return false;
    }
    
    /**
     * a String representation of the board
     * consists of a series of newline-separated rows of space-separated characters,
     * thereby giving a grid representation of the board¡¯s state with exactly one char for each square.
     * The mapping of characters is as follows:
     *  ¡°-¡± for squares with state untouched .
     *  ¡°F¡± for squares with state flagged .
     *  ¡° ¡± (space) for squares with state dug and 0 neighbors that have a bomb.
     *  integer COUNT in range [1-8] for squares with state dug and COUNT neighbors that have a bomb.
     *   - - - - - - -
     *   - - - - - - -
     *   -           -
     *   -   1 1 1   -
     *   -   1 F 1   -
     *   1   1 1 1   -
     *   F           -
     * @return a String representation of the board.
     */
    @Override
    public String toString() {
        return "";
    }
    
    /**
     * If x and y are both greater than or equal to 0, and less than the board size, 
     * and square x,y is in the untouched state, change it to be in the flagged state
     * otherwise, do nothing.
     * @param x x coordinate of the square
     * @param y y coordinate of the square
     */
    public void flag(int x, int y) {
        return;
    }
    
    /**
     * If x and y are both greater than or equal to 0, and less than the board size, 
     * and square x,y is in the flagged state, change it to be in the untouched state.
     * Otherwise, do nothing.
     * @param x x coordinate of the square
     * @param y y coordinate of the square
     */
    public void deflag(int x, int y) {
        
    }
}
