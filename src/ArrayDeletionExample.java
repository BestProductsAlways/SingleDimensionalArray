public class ArrayDeletionExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 30, 50};
        int valueToDelete = 30;

        // Count occurrences of the value to delete
        int count = 0;
        for (int num : numbers) {
            if (num == valueToDelete) {
                count++;
            }
        }

        // Create a new array without the elements to delete
        int[] newArray = new int[numbers.length - count];
        int newIndex = 0;

        for (int num : numbers) {
            if (num != valueToDelete) {
                newArray[newIndex++] = num;
            }
        }

        // Print the new array
        System.out.println("Array after deleting " + valueToDelete + ":");
        for (int num : newArray) {
            System.out.println(num);
        }
    }
}

