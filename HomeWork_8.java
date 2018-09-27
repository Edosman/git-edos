/**
 * Java. Level 1. Lesson 8. Homework
 *
 * @author Eduard Krasikov
 * @version Sept 27, 2018
 */


import javax.swing.*;
import java.awt.*;
import java.util.Random;

class HomeWork_8 {
    public static void main(String[] args) {
        new Window();
    }
}

class Window extends JFrame {
    Window() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(700, 300, 250, 425);
        add(new PanelWindow());
        setResizable(false);
        setVisible(true);
    }
}

class Calculation {

    float calculation(float number1, float number2, float result, String operation) {
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        return result;
    }
}

class Protest {
    private Random rand = new Random();
    private int whichMassage = rand.nextInt(9);

    void protest(JTextArea text, JPanel panel1) {

        String array[] = new String[9];
        array[0] = "Спроси что полегче)";
        array[1] = "Не хочу считать!";
        array[2] = "Это ты меня спрашиваешь?";
        array[3] = "А сам(а)?";
        array[3] = "А 2x2 не посчитать?";
        array[4] = "Нуу откуда мне знать?";
        array[5] = "И тебе привет!";
        array[6] = "Посчитай столбиком, а?";
        array[7] = "Говорю же, гуманитарий я!";
        array[8] = "Что за жесть?!";

        for (int i = 0; i < array.length; i++) {
            panel1.setBackground(Color.RED);
            text.setText(array[whichMassage]);
            break;
        }
    }
}
class PanelWindow extends JPanel {
    private float number1 = 0;
    private float number2 = 0;
    private float result = 0;
    private String operation;
    private int cleanText = 0;
    private final int numberOfmesseges = 3;
    private int count = 0;

    PanelWindow() {
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        Font font = new Font("Font", Font.BOLD, 20);
        Font font2 = new Font("Font", Font.BOLD, 12);
        JLabel label = new JLabel("Протестный калькулятор");
        JTextArea textArea = new JTextArea("0", 2, 20);
        JRadioButton radioButtonOnOff = new JRadioButton("On/Off", true);
        JButton buttonClean = new JButton("C");
        JButton buttonDell = new JButton("<<");
        JButton buttonOne = new JButton("1");
        JButton buttonTwo = new JButton("2");
        JButton buttonThere = new JButton("3");
        JButton buttonFour = new JButton("4");
        JButton buttonFive = new JButton("5");
        JButton buttonSix = new JButton("6");
        JButton buttonSeven = new JButton("7");
        JButton buttonEight = new JButton("8");
        JButton buttonNine = new JButton("9");
        JButton buttonZero = new JButton("0");
        JButton buttonPlus = new JButton("+");
        JButton buttonMinus = new JButton("-");
        JButton buttonMultiply = new JButton("*");
        JButton buttonDiv = new JButton("/");
        JButton buttonEqual = new JButton("=");
        JButton buttonPoint = new JButton(".");
        JButton buttonReadMe = new JButton("ReadMe");

        // Задаём размер панелей
        panel1.setPreferredSize(new Dimension(250, 80));
        panel2.setPreferredSize(new Dimension(250, 330));
        textArea.setLineWrap(true);
        textArea.setFont(font2);

        // Устанавливаем шрифт
        buttonClean.setFont(font);
        buttonDell.setFont(font);
        buttonOne.setFont(font);
        buttonTwo.setFont(font);
        buttonThere.setFont(font);
        buttonFour.setFont(font);
        buttonFive.setFont(font);
        buttonSix.setFont(font);
        buttonSeven.setFont(font);
        buttonEight.setFont(font);
        buttonNine.setFont(font);
        buttonZero.setFont(font);
        buttonPlus.setFont(font);
        buttonMinus.setFont(font);
        buttonMultiply.setFont(font);
        buttonDiv.setFont(font);
        buttonEqual.setFont(font);
        buttonPoint.setFont(font);

        // Устанавливаем цвет фона
        panel1.setBackground(Color.LIGHT_GRAY);
        panel2.setBackground(Color.BLACK);

        //Добавляем элементы на понели
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
        panel1.add(label);
        panel1.add(textArea);
        panel2.add(radioButtonOnOff).setBounds(15, 10, 70, 30);
        panel2.add(buttonClean).setBounds(90, 10, 70, 30);
        panel2.add(buttonDell).setBounds(165, 10, 70, 30);
        panel2.add(buttonSeven).setBounds(15, 50, 50, 50);
        panel2.add(buttonEight).setBounds(70, 50, 50, 50);
        panel2.add(buttonNine).setBounds(125, 50, 50, 50);
        panel2.add(buttonPlus).setBounds(185, 50, 50, 50);
        panel2.add(buttonFour).setBounds(15, 105, 50, 50);
        panel2.add(buttonFive).setBounds(70, 105, 50, 50);
        panel2.add(buttonSix).setBounds(125, 105, 50, 50);
        panel2.add(buttonMinus).setBounds(185, 105, 50, 50);
        panel2.add(buttonOne).setBounds(15, 160, 50, 50);
        panel2.add(buttonTwo).setBounds(70, 160, 50, 50);
        panel2.add(buttonThere).setBounds(125, 160, 50, 50);
        panel2.add(buttonMultiply).setBounds(185, 160, 50, 50);
        panel2.add(buttonZero).setBounds(15, 215, 50, 50);
        panel2.add(buttonPoint).setBounds(70, 215, 50, 50);
        panel2.add(buttonEqual).setBounds(125, 215, 50, 50);
        panel2.add(buttonDiv).setBounds(185, 215, 50, 50);
        panel2.add(buttonReadMe).setBounds(155, 270, 80, 20);

        // Слушатели
        buttonClean.addActionListener(e -> {
            textArea.setText("");
            number1 = 0;
            number2 = 0;
            result = 0;
            cleanText = 0;
            panel1.setBackground(Color.LIGHT_GRAY);
        });

        buttonDell.addActionListener(e -> {
            String temp = textArea.getText();
            textArea.setText(temp.substring(0, temp.length() - 1));
        });

        buttonOne.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setFont(font);
            textArea.setColumns(13);
            textArea.setRows(1);
            textArea.setText(textArea.getText() + "1");
            cleanText++;
        });
        buttonTwo.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setText(textArea.getText() + "2");
            cleanText++;
        });
        buttonThere.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setText(textArea.getText() + "3");
            cleanText++;
        });
        buttonFour.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setText(textArea.getText() + "4");
            cleanText++;
        });
        buttonFive.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setText(textArea.getText() + "5");
            cleanText++;
        });
        buttonSix.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setText(textArea.getText() + "6");
            cleanText++;
        });
        buttonSeven.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setText(textArea.getText() + "7");
            cleanText++;
        });
        buttonEight.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setText(textArea.getText() + "8");
            cleanText++;
        });
        buttonNine.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setText(textArea.getText() + "9");
            cleanText++;
        });
        buttonZero.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setText(textArea.getText() + "0");
            cleanText++;
        });
        buttonPoint.addActionListener(e -> {
            if (cleanText == 0) {
                textArea.setText("");
            }
            textArea.setText(textArea.getText() + ".");
            cleanText++;
        });

        buttonPlus.addActionListener(e -> {
            number1 = Float.valueOf(textArea.getText());
            textArea.setText("");
            operation = "+";
        });

        buttonMinus.addActionListener(e -> {
            number1 = Float.valueOf(textArea.getText());
            textArea.setText("");
            operation = "-";
        });

        buttonMultiply.addActionListener(e -> {
            number1 = Float.valueOf(textArea.getText());
            textArea.setText("");
            operation = "*";
        });

        buttonDiv.addActionListener(e -> {
            number1 = Float.valueOf(textArea.getText());
            textArea.setText("");
            operation = "/";
        });

        buttonEqual.addActionListener(e -> {
            number2 = Float.valueOf(textArea.getText());
            Calculation calc = new Calculation();
            if (radioButtonOnOff.isSelected()) {
                Protest protest = new Protest();
                protest.protest(textArea, panel1);
                if (count == numberOfmesseges) {
                    textArea.setText("Окей-Окей!\nОтвет: " + String.valueOf(calc.calculation(number1, number2, result, operation)));
                    panel1.setBackground(Color.GREEN);
                    count = 0;
                }
                count++;
            } else {
                textArea.setText("Ответ: " + String.valueOf(calc.calculation(number1, number2, result, operation)));
                panel1.setBackground(Color.GREEN);
            }
            number1 = 0;
            number2 = 0;
            result = 0;
            cleanText = 0;
        });

        buttonReadMe.addActionListener(e -> {
            panel1.setBackground(Color.LIGHT_GRAY);
            textArea.setText("Этот калькулятор нужно настойчиво упрашивать и тогда он снизойдёт!");
        });
    }
}
