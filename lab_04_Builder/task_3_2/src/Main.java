public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String string1 = stringBuilder.add("hello")
                .add(" my world")
                .addToPosition("dear ",9)
                .build();
        System.out.println("String 1: "+string1);
        StringBuilder stringBuilder1 = new StringBuilder();
        String string2 = stringBuilder1.add("I")
                .add(" love")
                .add(" design patterns))")
                .build();

        System.out.println("String 2: "+string2);

    }
}
