package Day01;

public class CallbyReference {
    //배열 총합 구하는 연습 코드 예제

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        //배열의 총합을 구하여 출력하시요.
        int result = addArray(a);
        System.out.println("총합 : " + result);
    }
    //배열의 길이만큼 반복을 돌려서 배열 값을 더하는 함수
    public static int addArray(int[] arrayRefer){
        int totalSum = 0;
        for(int i = 0; i < arrayRefer.length; i++){
            totalSum += arrayRefer[i];
        }

        return totalSum;
    }
}
