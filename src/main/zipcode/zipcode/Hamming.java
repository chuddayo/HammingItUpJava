package zipcode;

public class Hamming {
    String s1;
    String s2;
    public Hamming(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
        if (s1.length() != s2.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    public int getHammingDistance() throws IllegalArgumentException {
        int hammingDistance = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) hammingDistance++;
        }
        return hammingDistance;
    }
}
