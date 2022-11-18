
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * Manipulates a two-dimensional ragged array of doubles. This utility class will be used to create
 * a Sales Report for Retail District. It will accommodate positive and negative numbers.
 *
 * @author
 */
public class TwoDimRaggedArrayUtility {


    /**
     * Reads from a file and returns a ragged array of doubles The maximum rows is 10 and the maximum
     * columns for each row is 10 Each row in the file is separated by a new line Each element in the
     * row is separated by a space Suggestion: You need to know how many rows and how many columns
     * there are for each row to create a ragged array. 1. Read the doubles from the file into an a
     * temporary array [10][10] of Strings which was initialized to nulls. 2. Find out how many rows
     * there are (any row that has the first element != null is a valid row) 3. Create the array based
     * on the num of rows, i.e. double[][]array = new double[#rows][] 4. Determine the number of
     * columns for the first row (any element != null is a valid element) 5. Create the first row,
     * i.e. array[0] = new double[#columns] 6. Put the values from the temporary array into in the row
     * (don't forget to convert from strings to doubles) 7. Repeat for all rows
     *
     * @param file the file to read from
     * @return a two dimensional ragged (depending on data) array of doubles if the file is not empty,
     * returns a null if file is empty
     * @throws FileNotFoundException
     */
    public static double[][] readFile(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        int rowIndex = 0;
        String[][] elt = new String[10][];

        // read file and pass numbers to temp array as Strings
        while (sc.hasNextLine()) {
            String[] row = sc.nextLine().split(" ");
            elt[rowIndex] = new String[row.length];
            for (int i = 0; i < row.length; i++) {
                elt[rowIndex][i] = row[i];
            }
            rowIndex++;
        }
        // Create double data array and parse numbers as doubles
        double[][] array = new double[rowIndex][];
        for (int i = 0; i < rowIndex; i++) {
            array[i] = new double[elt[i].length];
            for (int j = 0; j < elt[i].length; j++) {
                System.out.print(elt[i][j] + " ");
                array[i][j] = Double.parseDouble(elt[i][j]);
            }
            System.out.println();
        }

        sc.close();
        return array;
    }

    /**
     * Writes the ragged array of doubles into the file. Each row is on a separate line within the
     * file and each double is separated by a space.
     *
     * @param data       two dimensional ragged array of doubles
     * @param outputFile the file to write to
     * @throws FileNotFoundException
     */

    public static void writeToFile(double[][] array, File outputFile) throws FileNotFoundException {
        PrintWriter file = new PrintWriter(outputFile);

        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j <= array[i].length; j++) {
                file.write(array[i][j] + " ");
            }
        }

        file.close();
    }


    public static double getTotal(double[][] array) {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
            }
        }
        return total;
    }

    /**
     * Returns the average of the elements in the two dimensional array
     *
     * @param data the two dimensional array getting the average of
     * @return the average of the elements in the two dimensional array (total of elements/num of
     * elements)
     */
    public static double getAverage(double[][] array) {
        int elts = 0;
        double total = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
                elts++;
            }

        }
        return total / elts;
    }

    /**
     * Returns the total of the selected row in the two dimensional array index 0 refers to the first
     * row.
     *
     * @param data the two dimensional array
     * @param row  the row index to take the total of (0 refers to the first row)
     * @return the total of the row
     */
    public static double getRowTotal(double[][] array, int row) {
        double total = 0;
        for (int i = 0; i < array[row].length; i++) {
            total += array[row][i];
        }
        return total;
    }

    /**
     * Returns the total of the selected column in the two dimensional array index 0 refers to the
     * first column. If a row in the two dimensional array doesn't have this column index, it is not
     * an error, it doesn't participate in this method.
     *
     * @param data the two dimensional array
     * @param col  the column index to take the total of (0 refers to the first column)
     * @return the total of the column
     */
    public static double getColumnTotal(double[][] array, int col) {
        double totColumn = 0;
        for (int i = 0; i < array.length; i++) {
            if (col >= array[i].length) {
                continue;
            }
            totColumn += array[i][col];
        }
        return totColumn;
    }

    /**
     * Returns the largest element of the selected row in the two dimensional array index 0 refers to
     * the first row.
     */
    public static double getHighestInRow(double[][] array, int row) {
        double highest = 0;

        if (row <= 0) {
            return 0;
        }
        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] > highest) {
                highest = array[row][i];
            }
        }
        return highest;
    }

    /**
     * Returns the largest element of the selected row in the two dimensional array index 0 refers to
     * the first row.
     *
     * @param data the two dimensional array
     * @param row  the row index to find the largest element of (0 refers to the first row)
     * @return the largest element of the row
     */
    public static int getHighestInRowIndex(double[][] array, int row) {
        double highest = 0;
        int index = 0;
        if (row <= 0) {
            return 0;
        }

        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] > highest) {
                highest = array[row][i];
                index = i;
            }
        }
        return index;
    }


    /**
     * Returns the smallest element of the selected row in the two dimensional array index 0 refers to
     * the first row.
     *
     * @param data the two dimensional array
     * @param row  the row index to find the smallest element of (0 refers to the first row)
     * @return the smallest element of the row
     */
    public static double getLowestInRow(double[][] array, int row) {
        double lowest = 0;

        if (row <= 0) {
            return 0;
        }

        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] < lowest) {
                lowest = array[row][i];
            }

        }
        return lowest;
    }

    /**
     * Returns the index of the smallest element of the selected row in the two dimensional array
     * index 0 refers to the first row.
     *
     * @param data the two dimensional array
     * @param row  the row index to find the smallest element of (0 refers to the first row)
     * @return the index of the smallest element of the row
     */

    public static int getLowestInRowIndex(double[][] array, int row) {
        double lowest = 0;
        int index = 0;

        for (int i = 0; i < array[row].length; i++) {
            if (array[row][i] < lowest) {
                lowest = array[row][i];
                index = i;
            }

        }
        return index;
    }

    /**
     * Returns the largest element of the selected column in the two dimensional array index 0 refers
     * to the first column. If a row in the two dimensional array doesn't have this column index, it
     * is not an error, it doesn't participate in this method.
     *
     * @param data the two dimensional array
     * @param col  the column index to find the largest element of (0 refers to the first column)
     * @return the largest element of the column
     */


    public static double getHighestInColumn(double[][] array, int col) {
        double highest = 0;


        for (int i = 0; i < array.length; i++) {

         try{
             if (array[i][col] > highest) {
                 highest = array[i][col];
             }
         }catch (Exception exception){}

        }
        if (col < 0) {
            return 0;
        }
        return highest;
    }


    /**
     * Returns the total of all the elements of the two dimensional array
     *
     * @param data the two dimensional array getting total of
     * @return the sum of all the elements in the two dimensional array
     */

    /**
     * Returns index of the largest element of the selected column in the two dimensional array index
     * 0 refers to the first column. If a row in the two dimensional array doesn't have this column
     * index, it is not an error, it doesn't participate in this method.
     *
     * @param data the two dimensional array
     * @param col  the column index to find the largest element of (0 refers to the first column)
     * @return the index of the largest element of the column
     */

    public static int getHighestInColumnIndex(double[][] array, int col) {
        double highest = 0;
        int index = 0;

        if (col < 0) {  // I will delete this once the program is halfway done
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
           try{
               if (array[i][col] > highest) {
                   highest = array[i][col];
                   index = i;
               }
           }catch (Exception exception){}

        }
        return index;
    }

    /**
     * Returns the smallest element of the selected column in the two dimensional array index 0 refers
     * to the first column. If a row in the two dimensional array doesn't have this column index, it
     * is not an error, it doesn't participate in this method.
     *
     * @param data the two dimensional array
     * @param col  the column index to find the smallest element of (0 refers to the first column)
     * @return the smallest element of the column
     */


    public static double getLowestInColumn(double[][] data, int col) {
        double lowest = 0;

        if (col < 0) {// delete this as well
            return 0;
        }

        for (int i = 0; i < data.length; i++) {
            try {
                if (data[i][col] < lowest) {
                    lowest = data[i][col];
                }
            } catch (Exception exception) {

            }


        }
        return lowest;
    }

    /**
     * Returns the index of the smallest element of the selected column in the two dimensional array
     * index 0 refers to the first column. If a row in the two dimensional array doesn't have this
     * column index, it is not an error, it doesn't participate in this method.
     *
     * @param data the two dimensional array
     * @param col  the column index to find the smallest element of (0 refers to the first column)
     * @return the index of the smallest element of the column
     */
    public static int getLowestInColumnIndex(double[][] array, int col) {
        double lowest = 0;
        int index = 0;

        if (col < 0) {// delete this too
            return 0;
        }

        for (int i = 0; i < array.length; i++) {
            try {
                if (array[i][col] < lowest) {
                    lowest = array[i][col];
                    index = i;
                }
            } catch (Exception exception) {

            }

        }
        return index;

    }

    /**
     * Returns the largest element in the two dimensional array
     *
     * @param data the two dimensional array
     * @return the largest element in the two dimensional array
     */
    public static double getHighestInArray(double[][] array) {
        double highest = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > highest) {
                    highest = array[i][j];
                }
            }

        }
        return highest;
    }

    /**
     * Returns the smallest element in the two dimensional array
     *
     * @param data the two dimensional array
     * @return the smallest element in the two dimensional array
     */

    public static double getLowestInArray(double[][] data) {
        double lowest = 0;

        for (int i = 0; i < data.length; i++) {
           try {
               for (int j = 0; i < data[i].length; j++) {
                   if (data[i][j] < lowest) {
                       lowest = data[i][j];
                   }
               }
           }catch (Exception exception){

           }

        }
        return lowest;
    }


}

