package assignment;

public class PrimeSeries {

    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            boolean flag = true;

            if (i <= 1)
                flag = false;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(i+" ");
            }
        }
    }
}
