public class array_method {
    public static int[] sort(int a[]){
        int temp;
        for(int i = 0;i < a.length ; i++){
            for(int j = i + 1 ; j<a.length -1 ;j++){
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[] = {2,1,4,5,10};
        int arr[] = sort(a);
        for(int i: arr){
            System.out.print(" " + i);
        }
        System.out.println("");
    }
}
