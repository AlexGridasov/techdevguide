package com.gri.alex;

/*
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each)
and big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops.
See also: Introduction to MakeBricks http://codingbat.com/doc/practice/makebricks-introduction.html
*/

/**
 * User: Alex
 * Date: 28-May-18
 */
public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {
        int BIG_SIZE = 5;
        if (goal > (small + big * BIG_SIZE)) {
            return false;
        }

        if ((goal % BIG_SIZE) > small) {
            return false;
        }

        return true;
    }
}
