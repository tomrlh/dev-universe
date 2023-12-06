import java.util.*;
import java.util.stream.IntStream;

class TwoSum {
    public static int[] Solution(int[] array, int targetSum) {
        List<Integer> convertedList = Arrays.stream(array).boxed().collect(Collectors.toList());
        
        int n1 = 0, n2 = 0;
        int[] result = new int[2];
        boolean[] found = {false};
        IntStream.range(0, convertedList.size()).forEach(firstIndex -> {
            IntStream.range(0, convertedList.size()).forEach(secondIndex -> {
                int num1 = convertedList.get(firstIndex);
                int num2 = convertedList.get(secondIndex);
                if(firstIndex != secondIndex) {
                    int nSum = num1 + num2;
                    if(nSum == targetSum) {
                        System.out.println(num1 + " " + num2);
                        result[0] = num1 <= num2 ? num1 : num2;
                        result[1] = num2 > num1 ? num2 : num1;
                        found[0] = true;
                    }
                }
            });
        });
        return found[0] ? result : new int[]{};
    }
}

// A solucao deve estar implementada dentro da função abaixo.
// Dica: Você pode criar outras funções e classes se quiser mas esta é a função principal que será usada.
