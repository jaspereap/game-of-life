import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Parser {
    private String file;
    private Integer[] gridSize = new Integer[2];
    int rowOffset = 0;
    int colOffset = 0;
    private char[][] grid;
    // X -> +ve horizontal direction
    // Y -> -ve vertical direction

    public Parser(String file) {
        this.file = file;
    }
    public void intialiseGrid(Integer X, Integer Y) {
        grid = new char[X][Y];
    }
    public void addGrid(String line) {
        System.out.println("> Add to grid: " + line);
    }

    public void initialise() {
        
        try {
            Path path = Paths.get(file);
            BufferedReader br = Files.newBufferedReader(path);
            String line;
            boolean processData = false;
            

            while ((line = br.readLine()) != null) {
                if (processData == true) {
                    System.out.println("Line: " + line);
                    addGrid(line);
                    continue;
                }
                String[] terms = line.trim().split(" ");
                switch (terms[0]) {
                    case Constants.COMMENT: continue;
                    case Constants.GRID: {
                        if (terms.length > 3) {
                            System.err.println("Error for GRID:\nProper usage: GRID [X_SIZE] [Y_SIZE]");
                            break;
                        }
                        gridSize[0] = Integer.parseInt(terms[1]); 
                        gridSize[1] = Integer.parseInt(terms[2]); 
                        break;
                    }
                    case Constants.START: {
                        if (terms.length > 3) {
                            System.err.println("Error for START:\nProper usage: START [X_POS] [Y_POS]");
                            break;
                        }
                        rowOffset = Integer.parseInt(terms[1]); 
                        colOffset = Integer.parseInt(terms[2]);
                        break;
                    }
                    case Constants.DATA: {
                        processData = true;
                        intialiseGrid(gridSize[0], gridSize[1]);
                        break;
                    }
                }
            }
            System.out.println("End of loop");

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
