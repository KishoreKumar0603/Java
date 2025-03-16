class need{
    static {
        System.out.println("First Static object");
    }
    static {
        System.out.println("second Static object");
    }
}
public class Static_Block {
    static {
        System.out.println("First Static");
    }
    public static void main(String[] args) {
        need a = new need();
        System.out.println("Main func"+a);
    }
    static {
        System.out.println("Second static");
    }
}
