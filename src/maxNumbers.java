public class maxNumbers {
    public int maxNumber(int[] numbers) {
        Integer max = null;
        for (int number: numbers) {
            if (max == null) {
                max = number;
            } else if (max < number) {
                max = number;
            }
        }

        return max;
    }

}