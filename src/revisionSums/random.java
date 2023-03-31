package revisionSums;


import java.util.Random;
public class random {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i =1; i <= 5; i++) {
            System.out.println(random.nextInt(6 )+1);
        }

    }
}
