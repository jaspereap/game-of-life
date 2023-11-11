public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser("gol/test.gol");
        char[][] grid = parser.getGrid();
        System.out.println("Initial grid: ");
        Parser.printGrid(grid);

        Processor golProcessor = new Processor(grid, 5);
    }
}