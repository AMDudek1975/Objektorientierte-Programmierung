
public class Fakultät {
    public static void main(String[] args) {
        int n = 4;
        long result = 1;
  
        for (int i = 2; i <= n; i = i +1) {
            result = result * i;
        }
        System.out.println(result);
    }
}
