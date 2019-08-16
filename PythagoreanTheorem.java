public class PythagoreanTheorem {
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across the right angle. 
        // calculate the value of c given legA and legB

        // double the leg values
        double legC = (legA)^2 + (legB)^2;

        // square root the sum of legC
        double squareRoot = Math.sqrt(legC);

        // return the result to the program
        return squareRoot;
    }
}