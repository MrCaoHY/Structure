package com.queue.test;

/**
 * @author Caohaiyang
 * @date 2019/1/14-21:46
 */
public class Test1 {
    public static void main(String[] args) {
       // char[][] grid={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
          char[][] grid={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        for (int i = 0; i <grid.length ; i++) {
            for (int j = 0; j <grid[i].length ; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        BFS1 bfs=new BFS1();
        int num=bfs.numIslands(grid);
        System.out.println(num);
    }
}
