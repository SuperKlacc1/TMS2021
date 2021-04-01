public class Homework3 {
    public static void main(String[] args) {
        int mass[] = {2, 3, 4, 5, 6};
        int count = 0;
        int i;
        for (i = 0; i < mass.length; i++) {
            count = count + mass[i];
        }
        System.out.println(count / 5);


    }
}
