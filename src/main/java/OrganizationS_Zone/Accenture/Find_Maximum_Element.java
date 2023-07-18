package OrganizationS_Zone.Accenture;

public class Find_Maximum_Element {
    static void findMax(int arr[]) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("The Max Element is  : " + max + " and index location is : " + index);
        System.out.println("find the Minimum Element");
        int min = arr[0];
        int location = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                location = i;
            }
        }
        System.out.println("The Min Element : " + min + " and index is location is : " + location);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{23, 45, 82, 27, 66, 12, 78, 13, 71, 86};
        findMax(arr);
    }
}
