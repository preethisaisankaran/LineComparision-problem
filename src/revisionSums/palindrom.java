package revisionSums;

public class palindrom {
    public static void main(String[] args) {
        int num = 565;
        int pal=num;
        int temp ;
        int check = 0;
        while (num > 0) {
            temp = num % 10;
            check = ((check * 10) + temp);
            num = num / 10;
        }
        if (pal==check)
            System.out.println("It is palindrom");
        else
            System.out.println("It is not palindrom");
    }
}
