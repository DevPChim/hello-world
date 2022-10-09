public class Doubling {
    public static void main(String[] args) {
// - Create an integer variable named `baseNumber` and assign the value `123` to it

        int baseNumber = 123;
        doubleNumber(baseNumber);

    }
    // - Create a function called `doubleNumber()` that doubles its integer input parameter
    //   and returns the doubled value
    // - Print the result of `doubleNumber(baseNumber)`

    public static void doubleNumber(int baseNumber) {

        baseNumber *= 2;
        System.out.println(baseNumber);
    }
//   and returns the doubled value
// - Print the result of `doubleNumber(baseNumber)`
}