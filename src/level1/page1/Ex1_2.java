package level1.page1;

public class Ex1_2 {
    public static void main(String[] args) {

        int n = 5;
        int m =0;
        for(int i=1; i<=n ; i++) {
            if(n%i==0) {
                m += i;
            }
        }
        System.out.println(m);

    }
}
