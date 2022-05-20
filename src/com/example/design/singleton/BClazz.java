package com.example.design.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        this.socketClient = SocketClient.getInstance();
//        this.socketClient = new SocketClient(); // private 일때 사용불가
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
