package com.example.design;

import com.example.design.adapter.*;
import com.example.design.aop.AopBrowser;
import com.example.design.decorator.*;
import com.example.design.facade.Ftp;
import com.example.design.facade.Reader;
import com.example.design.facade.SftpClient;
import com.example.design.facade.Writer;
import com.example.design.observer.Button;
import com.example.design.observer.IButtonListener;
import com.example.design.proxy.Browser;
import com.example.design.proxy.BrowserProxy;
import com.example.design.proxy.IBrowser;
import com.example.design.singleton.AClazz;
import com.example.design.singleton.BClazz;
import com.example.design.singleton.SocketClient;
import com.example.design.strategy.*;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
//        Singleton 패턴
//        AClazz aClazz = new AClazz();
//        BClazz bClazz = new BClazz();
//
//        SocketClient bClient = bClazz.getSocketClient();
//        SocketClient aClient = aClazz.getSocketClient();
//
//        System.out.println("두개의 객체가 동인한가?");
//        System.out.println(aClient.equals(bClient));
//
////        Adapter 패턴
//        HairDryer hairDryer = new HairDryer();
//        connect(hairDryer);
//
//        Cleaner cleaner = new Cleaner();
//
//        Electronic110V adapter = new SocketAdapter(cleaner);
//        connect(adapter);
//
//        AirConditioner airConditioner = new AirConditioner();
//        Electronic110V airAdapter = new SocketAdapter(airConditioner);
//        connect(airAdapter);

//         proxy 패턴
//        Browser browser = new Browser("www.naver.com");
//        browser.show();
//        browser.show();

//        browser.show();
//        browser.show();

//        IBrowser browser = new BrowserProxy("www.naver.com");
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();
//        browser.show();

//         Aop
//        AtomicLong start = new AtomicLong();
//        AtomicLong end = new AtomicLong();
//        IBrowser aopBrowser = new AopBrowser("www.naver.com",
//                ()->{
//                    System.out.println("before");
//                    start.set(System.currentTimeMillis());
//                },
//                ()->{
//                    long now = System.currentTimeMillis();
//                    end.set(now - start.get());
//                });
//
//        aopBrowser.show();
//        System.out.println("loading time :" + end.get());
//
//        aopBrowser.show();
//        System.out.println("loading time :" + end.get());

////        데코레이터 패턴
//        ICar audi = new Audi(1000);
//        audi.showPrice();
//
////        a3
//        ICar audi3 = new A3(audi, "A3");
//        audi3.showPrice();
//
////        a4
//        ICar audi4 = new A4(audi, "A4");
//        audi4.showPrice();
//
////        a5
//        ICar audi5 = new A5(audi, "A5");
//        audi5.showPrice();

//        Button button = new Button("버튼");
//        button.addListener(new IButtonListener() {
//            @Override
//            public void clickEvent(String event) {
//                System.out.println(event);
//            }
//        });
//
//        button.click("메시지 전달 : click1");
//        button.click("메시지 전달 : click2");
//        button.click("메시지 전달 : click3");
//        button.click("메시지 전달 : click4");


//        Facade 패턴

//        Ftp ftpClient = new Ftp("www.foo.co.kr", 22,"/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileDisconnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileDisconnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disConnect();
//
////      Facade 로 간략하게 코드를 줄임
//        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
//        sftpClient.connect();
//
//        sftpClient.write();
//
//        sftpClient.read();
//
//        sftpClient.disConnect();

        Encoder encoder = new Encoder();

//      base64 전략
        EncodingStrategy base64 = new Base64Strategy();

//      normal 전략
        NormalStrategy normal = new NormalStrategy();

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }
//    콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
