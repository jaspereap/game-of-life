public class Main {
    public static void main(String[] args) {

        Parser parser = new Parser(args[0]);
        char[][] grid = parser.getGrid();
        System.out.println("Initial grid: ");
        Parser.printGrid(grid);

        Processor golProcessor = new Processor(grid, 5);
    }
}