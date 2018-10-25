package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static ServerSocket server = null;
    private static Socket socket = null;
    private static PrintWriter printWr = null;
    private static Scanner sc = null;

    public static void main(String[] args) {

        try {
            server = new ServerSocket(8291);
            System.out.println("Сервер запущен!");
            socket = server.accept();
            System.out.println("Клиент подключился");
            printWr = new PrintWriter(socket.getOutputStream(), true);
            sc = new Scanner(socket.getInputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            try {
                while (true) {
                    String strServer = sc.nextLine();
                    if (strServer.equals("/exit")) {
                        System.out.println("End session");
                        break;
                    }
                    System.out.println("Client: " + strServer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            try {
                Scanner input = new Scanner(System.in);
                while (true) {
                    if (input.hasNext()) {
                        printWr.println(input.nextLine());
                       // printWr.flush();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
