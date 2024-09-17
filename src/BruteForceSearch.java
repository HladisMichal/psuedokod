public class BruteForceSearch {
    private String text;
    private String vzorek;

    public BruteForceSearch(String text, String pattern) {
        this.text = text;
        this.vzorek = pattern;
    }

    public boolean najdi() {
        int n = text.length();
        int m = vzorek.length();
        int i = 0;
        int j;

        while (i <= n - m) {
            j = 0;
            while (j < m && text.charAt(i + j) == vzorek.charAt(j)) {
                j++;
            }
            if (j == m) {
                return true;
            }
            i++;
        }
        return false;
    }
}