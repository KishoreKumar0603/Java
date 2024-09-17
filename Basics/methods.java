class kk{
    public void add(){
        int a = 20;
        int b = 34;
        System.out.println("addition : "+(a+b));
    }
    public int sub(int a, int b){
        return a - b;
    }
}
public class methods {
    public static void main(String[] args) {
        kk k = new kk();
        k.add();
        int a = k.sub(2, 5);
        System.out.println(a);

    }

    
}
