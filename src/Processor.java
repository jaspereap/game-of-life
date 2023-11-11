public class Processor {
    private final char[][] grid;
    private final Integer gridRows;
    private final Integer gridCols;
    private final Integer iterations;
    char[][] nextGrid;

    public Processor(char[][] grid, Integer iterations) {
        this.grid = grid;
        this.iterations = iterations;
        gridRows = grid.length;
        gridCols = grid[0].length;
        System.out.println("Rows: "+ gridRows + " Columns: " + gridCols);

    }

    public void process() {
        for (int i = 0; i < gridRows; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < gridCols; j++) {
                System.out.println("\tj: "+ j);
                System.out.println("\tGrid value: " + grid[i][j]);
                // check left
                if (j > 0) {
                    char left = grid[i][j - 1];
                    System.out.println("\tLeft: " + left);
                }
                // check top
                if (i > 0) {
                    char top = grid[i - 1][j];
                    System.out.println("\tTop: " + top);
                }
                // check top left
                if (i > 0 && j > 0) {
                    char topLeft = grid[i - 1][j - 1];
                    System.out.println("\tTop Left : " + topLeft);
                }
                // check right
                if (j < gridCols - 1) {
                    char right = grid[i][j + 1];
                    System.out.println("\tRight: " + right);
                }
                // check top right
                if (j < gridCols - 1 && i > 0) {
                    char topRight = grid[i - 1][j + 1];
                    System.out.println("\tTop Right: " + topRight);
                }
                // check bot
                if (i < gridRows - 1) {
                    char bot = grid[i + 1][j];
                    System.out.println("\tBot: " + bot);
                }
                // check bot left
                if (i < gridRows - 1 && j > 0) {
                    char botLeft = grid[i + 1][j - 1];
                    System.out.println("\tBot Left: " + botLeft);
                }
                // check bot right
                if (i < gridRows - 1 && j < gridCols - 1) {
                    char botRight = grid[i + 1][j + 1];
                    System.out.println("Bot Right: " + botRight);
                }
                System.out.println("\t__________");
            }
        }
    }

    public void evaluate() {

    }




}
