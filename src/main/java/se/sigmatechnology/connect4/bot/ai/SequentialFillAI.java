package se.sigmatechnology.connect4.bot.ai;

import se.sigmatechnology.connect4.bot.Board;

/**
 * Created by msk on 2016-11-10.
 */
public class SequentialFillAI extends AI {

    private int lastColumn = -1;

    @Override
    public int getNextTurn(Board board) {
        if (lastColumn < 6) {
            return ++lastColumn;
        } else {
            return (lastColumn = 0);
        }
    }
}
