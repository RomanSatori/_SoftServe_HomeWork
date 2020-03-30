package HW4;

public class PR1 {
    public static void main(String[] args){
        int[] array = {-1, -2, -3, -4, -5, 6, 7, 8, 9, 10};
        int max = array[0];
        int i = 0;

        //максимальне число
        while (i < array.length){
            if (array[i] > max){
                max = array[i];
            }
            i++;
        }
        System.out.println("Max = "+max);

        //сума позитивних
        int sum = 0;
        int j = 0;
        for  (j = 0; j < array.length; j++){
            if (array[j] > 0){
                sum += array[j];
            }

        }
        System.out.println("sum = "+sum);

        //кількість відємних
        int count = 0;
        int k = 0;
        for (k = 0; k < array.length; k++){
            if (array[k] < 0){
                count++;
            }

        }
        System.out.println("negative number = "+count);

    }

}
