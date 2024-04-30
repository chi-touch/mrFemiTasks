package africa.semicolon.Chapter14;


public class Task1 {
            public static int highest(int[] numbers) {
                int max = Integer.MIN_VALUE;
                 if (numbers.length == 0 || numbers.length == 1){
                    return 0;
                }
                 for (int i = 0; i < numbers.length; i++) {
                    for (int j = i + 1; j < numbers.length; j++) {

                         if (max <numbers[i] * numbers[j] ) {
                             max = numbers[j] * numbers[i];
                         }
                    }
                    //if(i==j)continue;
                }
                return max;
            }

//    String[] split = word.split(" ");
//    String reversed = "";
//
//        for (int i = split.length-1; i >=0 ; i--) {
//        reversed += split[i] + " ";
//    }
//        return reversed.trim();
}







