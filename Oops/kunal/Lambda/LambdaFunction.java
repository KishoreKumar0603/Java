package Oops.kunal.Lambda;

import java.util.ArrayList;
// import java.util.function.Consumer;

public class LambdaFunction {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i< 5;i++) arr.add(i);

        // arr.forEach((item) -> System.out.print(item+" "));
        // Consumer<Integer> fun = (item) -> System.out.print(item * 2+" ");
        // arr.forEach(fun);

        Operation sum = (a, b) ->  a + b;
        Operation product = (a, b) ->  a * b;
        Operation diff = (a, b) ->  a - b;

        LambdaFunction calc = new LambdaFunction();

        System.out.println("sum :"+ calc.operate(3, 5, sum));
        System.out.println("Difference :"+ calc.operate(3, 5, diff));
        System.out.println("Product :"+ calc.operate(3, 5, product));


    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }

}

interface Operation{
    int operation(int a, int b);
} 