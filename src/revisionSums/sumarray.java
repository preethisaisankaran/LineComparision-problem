package revisionSums;

public class sumarray {
    public static void main(String[] args){
        int a[] = {34, 6, 78, 211};
        int sum = 0;
        for (int i = 0; i <a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}

