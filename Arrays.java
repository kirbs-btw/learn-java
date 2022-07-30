public class Arrays {
    public static void main(String[] args) {
        String[] persons = {"Jim", "Bob", "Norm", "Gordon"};
        int[] nums = {3, 0, 1, 2};

        // System.out.println(persons[0]);
        // System.out.println(nums[2]);
        // System.out.println(persons.length);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(nums[i]);
            System.out.println(persons[nums[i]]);
        }
    }
}
