//Enumeration in Java



public class Enumeration {
    enum GameLevel
    {
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        GameLevel a = GameLevel.HIGH;
        System.out.println(a);
        System.out.println(GameLevel.LOW);
        System.out.println(GameLevel.MEDIUM);

        System.out.println("Using FOr each:::::::::: ");
        for(GameLevel i:GameLevel.values())
        {
            System.out.println(i);
        }
    }
}
