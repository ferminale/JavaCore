package HW2;

public class HW2 {

    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "a"}};
        try {
            try {
                int result = methodArray(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен! Введите корректные значения массива (4х4)");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Неправильное значение в массиве!!");
            System.out.println("Ошибка в ячейке: " + (e.i + 1) + "x" + (e.j + 1));
        }

    }


    public static int methodArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }


}
