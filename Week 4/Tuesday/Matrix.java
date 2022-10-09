class Matrix {
    public static void main(String[] args) {
        // - Create a two dimensional array dynamically with the following content.
        //   Note that a two dimensional array is often called matrix if every
        //   internal array has the same length.
        //   Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        //   Its length should depend on a variable
        //
        // - Print this two dimensional array to the output

        // length of my matrix

        int columns = 4;
        int rows = 4;

        //creating array

        String[][] newArray = new String[columns][rows];

        newArray[0][0] = "1";
        newArray[0][1] = "0";
        newArray[0][2] = "0";
        newArray[0][3] = "0";

        newArray[1][0] = "0";
        newArray[1][1] = "1";
        newArray[1][2] = "0";
        newArray[1][3] = "0";

        newArray[2][0] = "0";
        newArray[2][1] = "0";
        newArray[2][2] = "1";
        newArray[2][3] = "0";

        newArray[3][0] = "0";
        newArray[3][1] = "0";
        newArray[3][2] = "0";
        newArray[3][3] = "1";

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.println(newArray[i][j]);
            }
        }


    }
}