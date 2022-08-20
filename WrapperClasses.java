public class WrapperClasses{

    public static void main(String[] args) {
        Integer n = 5;
        Double f = 4.33;
        Character l = 'A';

        System.out.println(n);
        System.out.println(f);
        System.out.println(l);

        System.out.println(n.intValue());
        System.out.println(f.doubleValue());
        System.out.println(l.charValue());

        String r = n.toString();
        System.out.println(r);
    }

}