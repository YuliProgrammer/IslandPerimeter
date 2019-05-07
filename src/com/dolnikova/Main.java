package com.dolnikova;

public class Main {

    public static void main(String[] args) {
        int[][] lakesIsland = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        System.out.println("perimeter = " + landPerimeter(lakesIsland));
    }

    public static int landPerimeter(int[][] grid) {

        int perimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == 1) {

                    if (j == 0 || (j != 0 && grid[i][j - 1] == 0)) {
                        perimeter++;
                    }

                    if (i == 0 || (i != 0 && grid[i - 1][j] == 0)) {
                        perimeter++;
                    }

                    if (j == grid[0].length - 1 || (j != grid[0].length - 1 && grid[i][j + 1] == 0)) {
                        perimeter++;

                    }

                    if (i == grid.length - 1 || (i != grid.length - 1 && grid[i + 1][j] == 0)) {
                        perimeter++;
                    }

                }
            }

        }

        return perimeter;
    }

}