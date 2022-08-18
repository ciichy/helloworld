public class Zoo {
    public static void main(String[] args) {

        String[] zwierzaki = new String[5];
        zwierzaki = new String[]{"ssaki", "gady", "plazy", "ptaki", "rybki"};
//        for (int i = 0; i < zwierzaki.length; i++) {
//            System.out.println(zwierzaki[i]);
//        }

        for (String zwierzak : zwierzaki) {
            System.out.println(zwierzak);
        }
    }
}

