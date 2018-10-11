package edos;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int row, int col){
        super(String.format("Неправильно задана ячейка матрицы. Расположение: строка %d, столбец %d", row, col));
    }
}
