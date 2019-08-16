public class PythagoreanTheoremTest {
    public static void main(String[] args) {

        // call back on PythagoreanTheorem.java
        PythagoreanTheorem result = new PythagoreanTheorem();

        // values for legA & legB
        double output = result.calculateHypotenuse(3,4);

        // prints output (legC) to the console
        System.out.println(output);
    }
}