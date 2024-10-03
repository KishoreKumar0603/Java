public class String_buffer_builder {
    public static void main(String[] args){
        StringBuffer buffer = new StringBuffer("kishore");
        System.out.println(buffer);
        buffer.append(" kumar");
        System.out.println(buffer);
        buffer.insert(0,"S ");
        System.out.println(buffer);
        buffer.replace(0, 4, "@@@@");
        System.out.println(buffer);
        buffer.delete(0, 4);
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);


        StringBuffer a = new StringBuffer();
        System.out.println(a.capacity());
        a.append("kishore kumar sfddsagdg");
        System.out.println(a.capacity()); // (old capacity * 2) + 2
    }
}
