public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a string which is passed as parameter
        // Pass the `toBeReversed` variable to this method to check if it works well
        // At first, solve this task using the `charAt()` function

        String tbr = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI", rbt = "";
        char ch;

        for (int i=0; i<tbr.length(); i++)
        {
            ch = tbr.charAt(i);
            rbt = ch + rbt;

        }

        System.out.println(rbt);

        // Try other solutions when you are done


    }
}