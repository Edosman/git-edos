package edos;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(){
        super("Не правильная размерность матрицы. Ожидается быть 4х4");
    }
}
