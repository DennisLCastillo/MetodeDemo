public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1.72, 14);
        System.out.print(p1.getHeight());
        System.out.println();

        p1.setHeight(1.79);
        System.out.println("ny højde " + p1.getHeight());
        p1.birthday();
        System.out.println(p1.getAge());
    }
}
