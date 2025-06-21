public class StringDataTypes {
    public static void main(String[] args) {
        String name1 = "Syed";
        String name2 = "Syed";
//        int a = 1;
//        System.out.println(System.identityHashCode(a)) ;
        System.out.println(System.identityHashCode(name1)); // e.g., 366712642
        System.out.println(System.identityHashCode(name2));

        String name3 = new String("Syed");
        String name4 = new String("Syed");
        System.out.println(System.identityHashCode(name3));
        System.out.println(System.identityHashCode(name4));
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1.equals(name3));

        // String methods ...
        String name = "Zaid";
        name.length();
        System.out.println("Name is = " + name.length());
        char character = name.charAt(2);
        System.out.println(character);
        String a = "Zaid Syed";
        String b = "zaid syed";
        System.out.println(a.equalsIgnoreCase(b));
        String substring = a.substring(5,9);
        System.out.println(substring);

        int c = 10;
        String s = String.valueOf(c);
        System.out.println(s+10);
    }
}
