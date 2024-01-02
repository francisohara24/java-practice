package programming_with_java._1_javafundamentals.assignment1.question2.java2darray;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int currentSum;
        int maximumSum = arr.get(0).get(0) + arr.get(0).get(1) + arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0) + arr.get(2).get(1) + arr.get(2).get(2);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                currentSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                if (currentSum > maximumSum)
                    maximumSum = currentSum;
            }
        }

        System.out.println(maximumSum);
    }
}
