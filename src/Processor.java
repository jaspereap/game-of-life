public class Processor {
    char[][] grid;
    private final Integer gridRows;
    private final Integer gridCols;
    private final Integer iterations;
    char[][] nextGrid;

    public Processor(char[][] grid, Integer iterations) {
        this.grid = grid;
        this.iterations = iterations;
        gridRows = grid.length;
        gridCols = grid[0].length;
        nextGrid = new char[gridRows][gridCols];
        run(iterations);
    }

    public void run(Integer iterations) {
        for (int i = 0; i < iterations; i++) {
            process();
            System.out.println("Iteration " + i);
            Parser.printGrid(grid);
        }
    }

    public void process() {
        for (int i = 0; i < gridRows; i++) {
            // System.out.println("i: " + i);
            for (int j = 0; j < gridCols; j++) {
                // System.out.println("\tj: "+ j);
                // System.out.println("\tGrid value: " + grid[i][j]);

                Integer aliveNeighbours = checkNeighbours(i,j);
                // System.out.println("Alive neighbours: " + aliveNeighbours);
                switch (aliveNeighbours) {
                    // 0-1 alive neighbours, dies
                    case 0: 
                    case 1: 
                        // System.out.println("0-1, dies");
                        nextGrid[i][j] = Constants.UNSHADED;
                        break;
                    // 2-3 alive neighbours, remain status quo
                    case 2: 
                        // System.out.println("2, remains");
                        nextGrid[i][j] = grid[i][j];
                        break;
                    // if 3 alive neighbours and cell is dead, rebirth cell
                    case 3: {
                        if (grid[i][j] == Constants.UNSHADED) {
                            // System.out.println("3, revives");
                            nextGrid[i][j] = Constants.SHADED;
                        } else {
                            // System.out.println("3, remains");
                            nextGrid[i][j] = grid[i][j];
                        }
                        break;
                    }
                    // >4 alive neighbours, dies
                    case 4: 
                    default:
                        // System.out.println(">4, dies");
                        nextGrid[i][j] = Constants.UNSHADED;
                        break;
                }

            }
        }
        grid = nextGrid;
        nextGrid = new char[gridRows][gridCols];
    }

    public Integer checkNeighbours(int i, int j) {
        Integer aliveNeighbours = 0;
        // check left
        if (j > 0) {
            char left = grid[i][j - 1];
            // System.out.println("\tLeft: " + left);
            if (left == Constants.SHADED) {
                aliveNeighbours++;
            }
        }
        // check top
        if (i > 0) {
            char top = grid[i - 1][j];
            // System.out.println("\tTop: " + top);
            if (top == Constants.SHADED) {
                aliveNeighbours++;
            }
        }
        // check right
        if (j < gridCols - 1) {
            char right = grid[i][j + 1];
            // System.out.println("\tRight: " + right);
            if (right == Constants.SHADED) {
                aliveNeighbours++;
            } 
        }
        // check bot
        if (i < gridRows - 1) {
            char bot = grid[i + 1][j];
            // System.out.println("\tBot: " + bot);
            if (bot == Constants.SHADED) {
                aliveNeighbours++;
            }
        }
        // check top left
        if (i > 0 && j > 0) {
            char topLeft = grid[i - 1][j - 1];
            // System.out.println("\tTop Left : " + topLeft);
            if (topLeft == Constants.SHADED) {
                aliveNeighbours++;
            }
        }
        // check top right
        if (j < gridCols - 1 && i > 0) {
            char topRight = grid[i - 1][j + 1];
            // System.out.println("\tTop Right: " + topRight);
            if (topRight == Constants.SHADED) {
                aliveNeighbours++;
            }
        }
        // check bot left
        if (i < gridRows - 1 && j > 0) {
            char botLeft = grid[i + 1][j - 1];
            // System.out.println("\tBot Left: " + botLeft);
            if (botLeft == Constants.SHADED) {
                aliveNeighbours++;
            }
        }
        // check bot right
        if (i < gridRows - 1 && j < gridCols - 1) {
            char botRight = grid[i + 1][j + 1];
            // System.out.println("\tBot Right: " + botRight);
            if (botRight == Constants.SHADED) {
                aliveNeighbours++;
            }
        }
        // System.out.println("Alive neighbours: " + aliveNeighbours);
        return aliveNeighbours;
    }


    public void evaluate() {

    }




}
