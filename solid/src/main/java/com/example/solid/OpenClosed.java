package com.example.solid;
class Util {
    public static void sort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void sortDecresingOrder(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

//interface CustomComparator {
//    int compare(int value1, int value2);
//}
//class UtilSolid {
//    public static final void sort(int arr[], CustomComparator customComparator) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (customComparator.compare(arr[i], arr[j]) > 0) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//    }
//}
//
//class IncreaseComparator implements CustomComparator {
//
//    @Override
//    public int compare(int value1, int value2) {
//        return value1 - value2;
//    }
//}
//
//class DecreaseComparator implements CustomComparator {
//
//    @Override
//    public int compare(int value1, int value2) {
//        return value2 - value1;
//    }
//}

public class OpenClosed {
    public static void main(String[] args) {

        int arr[] = new int[]{2, 3, 5, 4, 1};
        Util.sort(arr);
        for(int item: arr) {
            System.out.print(item + " ");
        }

        Util.sortDecresingOrder(arr);
        System.out.println();
        for(int item: arr) {
            System.out.print(item + " ");
        }

//        System.out.println();
//        UtilSolid.sort(arr, new IncreaseComparator());
//        for(int item: arr) {
//            System.out.print(item + " ");
//        }
//
//
//        System.out.println();
//        UtilSolid.sort(arr, new DecreaseComparator());
//        for(int item: arr) {
//            System.out.print(item + " ");
//        }


    }
}
