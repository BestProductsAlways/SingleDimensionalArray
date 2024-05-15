public class ArrayDeletionExampleWhole {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the array before deletion
        System.out.println("Array before deletion:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a new line

        // Deleting the whole array by assigning null
        numbers = null;

        // Attempting to access the array will result in NullPointerException
        try {
            System.out.println(numbers[0]); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Array is null");
        }
    }
}

