package edos;

public class Main {

    public static void main(String[] args) {
        String[][] array = {
                {"4", "6", "5", "5"},
                {"3", "8", "5", "p"},
                {"9", "3", "25", "87"},
                {"12", "5", "66", "8"}
        };
        try {
            metod(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    static void metod(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4)
                throw new MyArraySizeException();
            for (int j = 0; j < array.length; j++) {
                if (array.length != 4)
                    throw new MyArraySizeException();
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException((i + 1), (j + 1));
                }
            }
        }
        System.out.println("Сумма чисел массива составляет: " + sum);
    }
}
