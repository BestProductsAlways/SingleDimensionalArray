public class ArrayInsertionExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = new int[originalArray.length + 1]; // Increase size by 1

        int insertIndex = 2; // Index where the new element will be inserted
        int newValue = 100; // New value to be inserted

        // Copy elements from the original array to the new array with the insertion
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == insertIndex) {
                newArray[i] = newValue; // Insert the new value at the specified index
            } else {
                newArray[i] = originalArray[j++];
            }
        }

        // Print the new array
        System.out.println("New Array after insertion:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}

