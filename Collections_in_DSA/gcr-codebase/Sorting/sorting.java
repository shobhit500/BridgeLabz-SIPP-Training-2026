class sorting {

    public void SelectionSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.print("Selection Sort: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void BubbleSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Bubble Sort: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void InsertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.print("Insertion Sort: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// public class sorting{
//     public static void main(String[] args) {
//         int arr1[] = {2, 4, 1, 6, 5};
//         int arr2[] = {2, 4, 1, 6, 5};
//         int arr3[] = {2, 4, 1, 6, 5};

//         sorting s = new sorting();

//         s.SelectionSort(arr1);
//         s.BubbleSort(arr2);
//         s.InsertionSort(arr3);
//     }
// }