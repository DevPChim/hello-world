public class YourClassNameHere {
    public static void main(String[] args) {

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        boolean greater = true;

        int comp = Integer.compare(f1, f2);
        if(comp>0) {
            greater = true;
        } else {
            greater = false;
        }

        System.out.println(greater);

    }
}