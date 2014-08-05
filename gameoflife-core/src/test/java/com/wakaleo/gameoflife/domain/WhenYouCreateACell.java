package com.wakaleo.gameoflife.domain;

import static com.wakaleo.gameoflife.domain.Cell.DEAD_CELL;
import static com.wakaleo.gameoflife.domain.Cell.LIVE_CELL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

/**
 * 只为了生活
 * @author dylan0514
 * @version $Id: WhenYouCreateACell.java, v 0.1 2014年8月5日 上午9:50:04 dylan0514 Exp $
 */
public class WhenYouCreateACell {

    @Test
    public void aLiveCellShouldBeRepresentedByAnAsterisk() {
        Cell cell = Cell.fromSymbol("*");
        System.out.println(" as");
        assertThat(cell, is(LIVE_CELL));
    }

    @Test
    public void aDeadCellShouldBeRepresentedByADot() {
        Cell cell = Cell.fromSymbol(".");
        assertThat(cell, is(DEAD_CELL));
    }

    @Test
    public void aLiveCellShouldBePrintedAsAnAsterisk() {
        assertThat(Cell.LIVE_CELL.toString(), is("*"));
    }


    @Test
    public void aDeadCellShouldBePrintedAsADot() {
        assertThat(Cell.DEAD_CELL.toString(), is("."));
    }

    @Test
    public void aDeadCellSymbolShouldBeADot() {
        assertThat(Cell.DEAD_CELL.getSymbol(), is("."));
    }

    @Test
    public void aLiveCellSymbolShouldBeAnAsterisk() {
        assertThat(Cell.LIVE_CELL.getSymbol(), is("*"));
    }

}
