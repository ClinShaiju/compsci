import java.util.Arrays;
        import java.util.Random;
        
        public class SelectionSort {
            public static void main(String[] args) { 
                Random rand = new Random();
                int[] array = new int[10];
        
                for (int i = 0; i < array.length; i++) {
                    array[i] = rand.nextInt(101);
                }
        
                System.out.println("Original: " + Arrays.toString(array));
                System.out.println("Sorted: " + Arrays.toString(selectionSort(array)));
            }
        
            public static int[] selectionSort(int[] original) {
                for (int i = 0; i < original.length; i++) {
                    boolean isSorted = true;
                    int minIndex = i;
                    int temp = original[i];
        
                    for (int j = i; j < original.length; j++) {
                        if (original[j] < original[minIndex]) minIndex = j;
                        if ((j != original.length-1) && (original[j+1] <= original[j])) isSorted = false;
        
                    }
        
                    if (isSorted) break;
        
                    original[i] = original[minIndex];
                    original[minIndex] = temp;
        
                    System.out.println("Pass " + (i+1) + ": " + Arrays.toString(original));
                }
        
                return original;
            }
        
        
        }