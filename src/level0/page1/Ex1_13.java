package level0.page1;

public class Ex1_13 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int[] answer = {};

        answer = new int[numbers.length];
        for(int i=0; i< numbers.length ;i++) {
            answer[i] = numbers[i]*2;
        }
    }
}
