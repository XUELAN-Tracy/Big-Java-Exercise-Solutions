package chapter5.exercises;

/**
 * @author LanXue
 * @date 2020-02-09 20:14
 */
public class LexicographicalSorter {

    String s1;
    String s2;
    String s3;

    /**
     * Constructs a lexicographic sorter with given strings.
     * @param s1 the first given string
     * @param s2 the second given string
     * @param s3 the third given string
     */
    public LexicographicalSorter(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public String getSorted() {
        String result = "The inpus in sorted order are: ";
        if (s1.compareTo(s2) <= 0 && s2.compareTo(s3) <= 0) {
            result += "\n" + s1 + "\n" + s2 + "\n" +s3;
        } else if (s1.compareTo(s3) <= 0 && s3.compareTo(s2) <= 0) {
            result += "\n" + s1 + "\n" + s3 + "\n" +s2;
        } else if (s2.compareTo(s1) <= 0 && s1.compareTo(s3) <= 0) {
            result += "\n" + s2 + "\n" + s1 + "\n" +s3;
        } else if (s2.compareTo(s3) <= 0 && s3.compareTo(s1) <= 0) {
            result += "\n" + s2 + "\n" + s3 + "\n" +s1;
        } else if (s3.compareTo(s1) <= 0 && s1.compareTo(s2) <= 0) {
            result += "\n" + s3 + "\n" + s1 + "\n" +s2;
        } else {
            result += "\n" + s3 + "\n" + s2 + "\n" +s1;
        }
        return result;
    }

}
