public class NamePrinter {
    static {
        System.out.println("sample code");
    }

    public NamePrinter() {
        System.out.println("constructor");
    }

    public void printName() {
        System.out.println("method");
    }

    public static void main(String[] args) {
        NamePrinter output = new NamePrinter();
        output.printName();
    }
}