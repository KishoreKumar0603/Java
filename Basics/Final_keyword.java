class Test 
{
    final int MIN=1; //cant change the value
    final int NORMAL;
    final int MAX;
    Test(int normal,int max)
    {
        NORMAL = normal;
        MAX = max;
        // MIN=2;//it will show error
    }
    public void display()
    {
        System.out.println("MIN     :"+MIN);
        System.out.println("NORMAL  :"+NORMAL);
        System.out.println("MAX     :"+MAX);
    }


}
 class Final_keyword {
    public static void main(String[] args) {
        Test a = new Test(20, 100);
        a.display();
    }    
}
