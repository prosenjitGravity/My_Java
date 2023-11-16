package OrganizationS_Zone.Accenture;

public class NonRepeating {
    public static void main(String[] args) {
        System.out.println(nonrepeating("abcabcbb"));
        nonrepeating("abcabcbb");
    }

    static String nonrepeating(String str) {
        String store = "";
        for (int i = 0; i < str.length(); i++) {
            int j;
            for (j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }
            if (i == j) {
                store += str.charAt(i);
            }
        }
        return store;
    }
}
