package com.pringleaves.HaTak;

/**
 * Created with IntelliJ IDEA.
 * User: trprin
 * Date: 10/4/13
 * Time: 8:54 PM
 * To change this template use File | Settings | File Templates.
 */

import java.util.*;

public class Jumps {
    private List<HashMap<Integer,Integer>> jumpList = new ArrayList<HashMap<Integer,Integer>>();
    public Jumps() {
        // Generate Jumps
        Integer holeCount = 0;
        Integer[][] layout = new Integer[7][11];
        layout[1][5] = 1;
        layout[2][4] = 2;
        layout[2][6] = 3;
        layout[3][3] = 4;
        layout[3][5] = 5;
        layout[3][7] = 6;
        layout[4][2] = 7;
        layout[4][4] = 8;
        layout[4][6] = 9;
        layout[4][8] = 10;
        layout[5][1] = 11;
        layout[5][3] = 12;
        layout[5][5] = 13;
        layout[5][7] = 14;
        layout[5][9] = 15;

        for (Integer rowCount=0; rowCount<7; rowCount++) {
            for (Integer colCount=0; colCount<11; colCount++) {
                if (layout[rowCount][colCount] != 0) {
                    if (layout[rowCount-1][colCount-1] != 0) {
                        if (layout[rowCount + 1][colCount + 1] != 0) {
                            HashMap<Integer, Integer> jump = new HashMap<Integer,Integer>();
                            jump.put(layout[rowCount-1][colCount-1], layout[rowCount + 1][colCount + 1]);
                            jumpList.add(holeCount, jump);
                        }
                    }
                }
            }
        }
    }

    public List<HashMap<Integer, Integer>> getJumpList() {
        return jumpList;
    }

    public void setJumpList(List<HashMap<Integer, Integer>> jumpList) {
        this.jumpList = jumpList;
    }
}
