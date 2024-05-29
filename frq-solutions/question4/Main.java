public class Main {
  public static void main(String[] args) {
    System.out.println("2024 FRQ #4");

    int[][] grid1 = {{12, 3, 4, 13, 5},
                     {11, 21, 2, 14, 16},
                     {7, 8, 9, 15, 0},
                     {10, 17, 20, 19, 1},
                     {18, 22, 30, 25, 6}
                    };
      
    GridPath test1 = new GridPath(grid1);
    System.out.println(test1);
