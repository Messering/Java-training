import java.util.Comparator;


 class Cell {
            int row;   // the row number of the cell(row 0 is the top)
            int col;   // the column number of the cell (Column 0 is the left)
            int g;     // the value of the function g of A* and Greedy algorithms
            int h;     // the value of the function h of A* and Greedy algorithms
            int f;     // the value of the function h of A* and Greedy algorithms
            int dist;  // the distance of the cell from the initial position of the robot
                       // Ie the label that updates the Dijkstra's algorithm
            Cell prev; // Each state corresponds to a cell
                       // and each state has a predecessor which
                       // is stored in this variable
            
            public Cell(int row, int col){
               this.row = row;
               this.col = col;
            }
        } // end nested class Cell
      
        /**
         * Auxiliary class that specifies that the cells will be sorted
         * according their 'f' field
         */
         class CellComparatorByF implements Comparator<Cell>{
            @Override
            public int compare(Cell cell1, Cell cell2){
                return cell1.f-cell2.f;
            }
        } // end nested class CellComparatorByF
      
        /**
         * Auxiliary class that specifies that the cells will be sorted
         * according their 'dist' field
         */
         class CellComparatorByDist implements Comparator<Cell>{
            @Override
            public int compare(Cell cell1, Cell cell2){
                return cell1.dist-cell2.dist;
            }
        } // end nested class CellComparatorByDist
      
        