package minSwap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        List<Integer> sortedList = getSortedList(arr);
        Map<Integer, Integer> valueToIndex = getIndexMap(arr);
        return getElementsToSwap(arr, sortedList, valueToIndex);
    }

    static List<Integer> getSortedList(int arr[]){
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
    
        Collections.sort(list);
        return list;
    }

    static Map<Integer, Integer> getIndexMap(int [] arr) {
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        for (int i =0 ; i<arr.length; i++) {
            integerHashMap.put(arr[i], i);
        }
        return integerHashMap;
    }

    static int getElementsToSwap(int [] unsortedArr, List<Integer> sortedList, Map<Integer, Integer> valueToIndex){
        int total = 0;
        for (int index = 0; index< sortedList.size(); index++) {
            if (unsortedArr[index] != sortedList.get(index)) {
                swap(index, sortedList.get(index), unsortedArr, valueToIndex);
                total ++;
            }
        }
        return total;
    }

    static void swap(int indexB, int nodeA, int[] unsortedArr, Map<Integer, Integer> valueToIndex) {
        int indexA = valueToIndex.get(nodeA);
        int nodeB = unsortedArr[indexB];
        unsortedArr[indexA] = nodeB;
        unsortedArr[indexB] = nodeA;
        valueToIndex.put(nodeA, indexB);
        valueToIndex.put(nodeB, indexA);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);
System.out.println(res);

        scanner.close();
    }
}