package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 8291;
    private static Socket socket;
    private static Scanner in;
    private static PrintWriter out;

    public static void main(String[] args) {
        try {
            socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            in = new Scanner(socket.getInputStream());
            out = new PrintWriter(socket.getOutputStream());
            System.out.println("Подключение к серверу успешно");
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            try {
                while (true) {
                    if (in.hasNext()) {
                        String strClient = in.nextLine();
                        if (strClient.equalsIgnoreCase("/exit")){
                            System.out.println("End session");
                            break;
                        }
                        System.out.println("Server: " + strClient);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    socket.close();
                    out.close();
                    in.close();
                } catch (IOException exc) {
                }
            }
        }).start();

        new Thread(() -> {
            try {
                Scanner input = new Scanner(System.in);
                while (true) {
                    if (input.hasNext()) {
                        out.println(input.nextLine());
                        out.flush();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
