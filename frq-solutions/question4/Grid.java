  // PART A TESTS:
    System.out.println(test1.getNextLoc(0, 0)); // neighbor to right
    System.out.println(test1.getNextLoc(1, 3)); // neighbor below
    System.out.println(test1.getNextLoc(2, 4)); // neighbor below
    System.out.println(test1.getNextLoc(4, 3)); // neighbor to right


    int[][] grid2 = {{12, 30, 40, 25, 5},
                     {11, 3, 22, 15, 43},
                     {7, 2, 9, 4, 0},
                     {8, 33, 18, 6, 1},
                    };
    
    GridPath test2 = new GridPath(grid2);

    // PART B TEST:
    System.out.println(test2.sumPath(1, 1)); // expected result: 19
  }
}

public class Location {
  private int theRow;
  private int theCol;
    
  public Location(int r, int c) {
    theRow = r;
    theCol = c;
  }
  
  public int getRow() { 
    return theRow; 
  }
  
  public int getCol() { 
    return theCol; 
  }

  // added to see results on screen
  public String toString() {
    return theRow + " " + theCol;
  }
}
