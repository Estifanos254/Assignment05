import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoDimRaggedArrayUtilityTestStudent {
    @Test
    public void testAverageArray() throws Exception {
        double[][] data = {
                {1.4, 2.5, 3.0}, {1.5, 46.0}, {1.3, 4.7, 3.0, 6.9}
        };

        double average = TwoDimRaggedArrayUtility.getAverage(data);

        // Bloc assert
        //System.out.println(average);
        assertEquals(7.811, average, 0.01);
    }

    @Test
    public void testAverageArray2() throws Exception {
        double[][] array = {{52.0, 10.0, 62.0, 10.0, 33.0, 65.0}, {53.0, 51.0, 69.0, 70.0},
                {97.0, 41.0, 67.0, 12.0, 72.0, 71.0},
                {51.0, 35.0, 59.0, 75.0, 55.0, 56.0, 51.0, 32.0, 33.0, 79.0},
                {82.0, 38.0}, {49.0, 37.0, 4.0, 86.0, 76.0, 54.0, 33.0, 51.0, 6.0, 2.0},
                {92.0, 55.0}, {25.0, 68.0, 63.0, 30.0, 50.0}, {45.0, 64.0, 83.0},
                {58.0, 51.0, 98.0}, {52.0, 52.0, 93.0, 74.0, 33.0, 6.0, 85.0, 30.0, 47.0, 25.0},
                {63.0, 97.0, 23.0, 59.0, 40.0}, {69.0, 49.0, 25.0, 40.0, 21.0, 3.0, 81.0, 79.0, 63.0},
                {12.0, 67.0, 3.0, 3.0, 98.0, 0.0, 1.0, 70.0}, {67.0, 18.0, 46.0, 41.0, 84.0},
                {53.0}, {25.0}, {57.0, 76.0, 37.0, 67.0, 23.0, 53.0},
                {71.0, 53.0, 66.0, 19.0, 53.0, 12.0, 82.0, 81.0, 57.0, 57.0},
                {57.0, 78.0, 31.0, 6.0, 56.0, 51.0, 74.0, 25.0, 33.0}};

        double average = TwoDimRaggedArrayUtility.getAverage(array);

        // Bloc assert
        //System.out.println(average);
        assertEquals(49.85, average, 0.01);
    }

    @Test
    public void getColumnTotalTest() throws Exception {
        double[][] array= {{88.0, 25.0, 88.0, 33.0, 26.0, 98.0, 77.0, 58.0, 71.0},
                {91.0, 0.0, 54.0, 91.0, 31.0, 75.0, 94.0, 21.0, 19.0},
                {38.0, 76.0, 53.0, 62.0}, {83.0}, {49.0, 32.0, 67.0, 31.0, 56.0, 70.0},
                {30.0}, {4.0, 81.0, 24.0, 43.0, 58.0, 0.0}, {59.0}, {97.0, 34.0},
                {7.0, 80.0, 58.0, 96.0, 36.0, 39.0, 33.0, 32.0}, {47.0, 99.0, 96.0},
                {29.0, 16.0, 61.0, 32.0}, {9.0, 28.0, 98.0, 67.0},
                {29.0, 76.0, 16.0, 83.0, 14.0, 74.0, 46.0},
                {38.0, 10.0, 21.0, 32.0, 29.0, 16.0, 36.0, 20.0, 89.0},
                {4.0, 85.0, 14.0, 34.0, 33.0, 49.0, 17.0, 4.0, 17.0}};


        double total = TwoDimRaggedArrayUtility.getColumnTotal(array, 4);

        assertEquals(283.0, total, 0.0);

    }

    @Test
    public void getHighestInArray() throws Exception {
        double[][] array = {{94.0, 100.0, 63.0, 17.0, 53.0}, {44.0},
                {48.0, 20.0, 20.0, 53.0},
                {23.0, 62.0, 78.0, 96.0, 95.0, 13.0, 59.0, 78.0, 5.0},
                {0.0, 62.0, 77.0, 60.0, 41.0, 62.0, 96.0, 82.0},
                {3.0, 52.0, 54.0, 59.0, 58.0},
                {18.0, 76.0, 25.0, 59.0, 90.0, 36.0, 62.0, 21.0, 69.0},
                {30.0, 36.0, 11.0, 41.0, 39.0, 47.0}, {0.0, 81.0, 13.0, 43.0, 15.0, 18.0},
                {73.0, 37.0, 67.0, 86.0, 44.0, 70.0, 60.0}};

        double highest = TwoDimRaggedArrayUtility.getHighestInArray(array);
        assertEquals(100.0, highest, 0.0);
    }


    @Test
    public void getHighestInColumn() throws Exception {
        double[][] array = {{72, 36, 19, 15, 14}, {89, 84, 35, 87, 42}, {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25}, {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87}, {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60}, {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97}, {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13}, {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96}, {20, 89, 31}, {25, 83, 49, 2}, {19}};

        double highest = TwoDimRaggedArrayUtility.getHighestInColumn(array, 2);
        assertEquals(95.0, highest, 0.0);
    }

    @Test
    public void getHighestInColumnIndex() throws Exception {
        double[][] array = {{72, 36, 19, 15, 14}, {89, 84, 35, 87, 42}, {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25}, {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87}, {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60}, {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97}, {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13}, {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96}, {20, 89, 31}, {25, 83, 49, 2}, {19}};

        int highest = TwoDimRaggedArrayUtility.getHighestInColumnIndex(array, 2);
        assertEquals(13, highest, 0.0);
    }

    @Test
    public void getHighestInRow() throws Exception {
        double[][] array = {{72, 36, 19, 15, 14}, {89, 84, 35, 87, 42}, {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25}, {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87}, {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60}, {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97}, {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13}, {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96}, {20, 89, 31}, {25, 83, 49, 2}, {19}};

        double highest = TwoDimRaggedArrayUtility.getHighestInRow(array, 2);
        assertEquals(15.0, highest, 0.0);
    }

    @Test
    public void getHighestInRowIndex() throws Exception {
        double[][] array = {{72, 36, 19, 15, 14}, {89, 84, 35, 87, 42}, {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25}, {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87}, {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60}, {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97}, {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13}, {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96}, {20, 89, 31}, {25, 83, 49, 2}, {19}};

        int highest = TwoDimRaggedArrayUtility.getHighestInRowIndex(array, 2);
        assertEquals(0, highest, 0.0);
    }


    @Test
    public void getLowestInArray() throws Exception {
        double[][] array = {
                {72, 36, 19, 15, 14},
                {89, 84, 35, 87, 42},
                {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25},
                {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87},
                {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60},
                {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97},
                {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13},
                {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96},
                {20, 89, 31},
                {25, 83, 49, 2},
                {19}};

        double lowest = TwoDimRaggedArrayUtility.getLowestInArray(array);
        assertEquals(0, lowest, 0.0);
    }

    @Test
    public void getLowestInColumn() throws Exception {
        double[][] array = {{72, 36, 19, 15, 14}, {89, 84, 35, 87, 42}, {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25}, {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87}, {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60}, {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97}, {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13}, {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96}, {20, 89, 31}, {25, 83, 49, 2}, {19}};

        double lowest = TwoDimRaggedArrayUtility.getLowestInColumn(array, 4);
        assertEquals(0.0, lowest, 0.0);
    }

    @Test
    public void getLowestInColumnIndex() throws Exception {
        double[][] data = {{72, 36, 19, 15, 14}, {89, 84, 35, 87, 42}, {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25}, {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87}, {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60}, {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97}, {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13}, {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96}, {20, 89, 31}, {25, 83, 49, 2}, {19}};

        int lowest = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, 4);
        assertEquals(0, lowest, 0.0);
    }

    @Test
    public void getLowestInRow() throws Exception {
        double[][] array = {{72, 36, 19, 15, 14}, {89, 84, 35, 87, 42}, {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25}, {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87}, {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60}, {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97}, {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13}, {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96}, {20, 89, 31}, {25, 83, 49, 2}, {19}};

        double lowest = TwoDimRaggedArrayUtility.getLowestInRow(array, 8);
        assertEquals(0.0, lowest, 0.0);
    }

    @Test
    public void getLowestInRowIndex() throws Exception {
        double[][] array = {{72, 36, 19, 15, 14}, {89, 84, 35, 87, 42}, {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25}, {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87}, {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60}, {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97}, {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13}, {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96}, {20, 89, 31}, {25, 83, 49, 2}, {19}};

        int lowest = TwoDimRaggedArrayUtility.getLowestInRowIndex(array, 8);
        System.out.println(lowest);
        assertEquals(0.0, lowest, 0.0);
    }

    @Test
    public void getRowTotal() throws Exception {
        double[][] data = {{72, 36, 19, 15, 14}, {89, 84, 35, 87, 42}, {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25}, {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87}, {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60}, {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97}, {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13}, {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96}, {20, 89, 31}, {25, 83, 49, 2}, {19}};

        double total = TwoDimRaggedArrayUtility.getRowTotal(data, 14);

        assertEquals(150, total, 0.0);
    }


    @Test
    public void getTotal() throws Exception {
        double[][] array = {{72, 36, 19, 15, 14}, {89, 84, 35, 87, 42}, {15},
                {56, 29, 4}, {93, 1, 31, 96, 60, 1, 25}, {10, 93, 66, 11, 80, 69},
                {28, 7, 31, 9, 18, 15, 87}, {4, 99, 78, 0, 44, 91},
                {71, 23, 26, 81, 83, 84, 6, 13, 60}, {32, 91, 48}, {69},
                {74, 65, 3, 66, 45, 88, 90, 13, 97}, {1, 72, 6, 28, 22},
                {60, 32, 95, 32, 42, 70, 13}, {59, 74, 17},
                {39, 31, 29, 67, 22, 33, 61, 18, 96}, {20, 89, 31}, {25, 83, 49, 2}, {19}};

        double total = TwoDimRaggedArrayUtility.getTotal(array);

        assertEquals(4309, total, 0.0);
    }


}

