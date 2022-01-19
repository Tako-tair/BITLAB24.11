package interfaceLecture;

public class Main {
    public static void main(String[] args) {
        int[] a = {2,5,6,1,3};
        int min = 999999;
        int minMax = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] < min ){
                min = a[i];
                if(min > minMax){
                    minMax = min;
                }
            }
        }
        System.out.println(minMax);
    }
}
