public class Person {

    private double height;
    private  int age;

    public Person(double height) {
        this.height = height;
    }

    public Person(double height, int age) {
        this.height = height;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void birthday(){
        age++;
        // alder = alder + 1;
    }
}




