public class string {
    public static void main(String[] args){
        String st = "kishore kumar";
        String a = "kishore kumar";
        System.out.println(st.hashCode() +" " + a.hashCode());
        System.out.println(a.equals(st));
        String b = "Kishore KUmar";
        System.out.println(a.hashCode() + " " + b.hashCode());
        System.out.println(a.equals(b));
        System.out.println("Ignoring : " + a.equalsIgnoreCase(b));

        System.out.println("Printing 1st Letter : " + a.charAt(0));
        System.out.println("length : "+a.length());
        System.out.println("upperCase : " + a.toUpperCase());
        System.out.println("lowercase : " + a.toLowerCase());
        System.out.println(a.replace("kishore", "ajith"));
        System.out.println("Checking Contains : "+ a.contains("ki"));
        System.out.println("Checking the string is empty : "+a.isEmpty());
        System.out.println("string is starting with k : " + a.startsWith("k"));
        System.out.println("string Ending with  o : " + a.endsWith("o"));
        System.out.println("substring : " + a.substring(0,6));

        //Convertin String to Array 

        String str = "Kishore Kumar";
        char ab[] = str.toCharArray();
        for(char i : ab){
            System.out.print(" " + i);
        }
        System.out.println("");
        String spaced_str = "   kishore kumar  ";
        System.out.println("Length before Trim : " + spaced_str.length());
        System.out.println("Lenght After Trim : " + spaced_str.trim().length());
    }
}
