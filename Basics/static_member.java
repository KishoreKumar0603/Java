class mathematical{
    public static int power(int a, int b){
        int pow =1;
        for(int i = 0 ; i < b; i++){
            pow*=a;
        }
        return pow;
    }
}
public class static_member {
    public static void main(String[] args) {
        System.out.println(mathematical.power(2,3));
    }
}
