package com.example.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){
    } // private 으로 생성못하게 막아버림

    public static SocketClient getInstance() {

        if(socketClient == null) {
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
