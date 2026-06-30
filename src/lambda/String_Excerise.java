package lambda;

public class String_Excerise {
    public static void main(String[] args) {

        // hello:

        StringProcessor sp = (a) -> {return a;};
        System.out.println(sp.process("hello"));

        StringProcessor spUC = (a) -> a.toUpperCase();
        System.out.println(spUC.process("hello"));

        StringProcessor spBack = (a) -> new StringBuilder(a).reverse().toString();
        System.out.println(spBack.process("hello"));

        StringProcessor spTwo = (a) -> {return a + a;};
        System.out.println(spTwo.process("hello"));

        // Methode Aufruf:
        System.out.println(apply("Good day", spBack));
        System.out.println(apply("Good day", spUC));
        System.out.println(apply("Good day", spTwo));

    }
    public static String apply(String input, StringProcessor processor) {
        return processor.process(input);

    }
}
