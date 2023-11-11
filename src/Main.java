public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser("gol/test.gol");
        char[][] grid = parser.getGrid();
        parser.printGrid(grid);
        Processor golProcessor = new Processor(grid, 5);
        golProcessor.process();

    }
}