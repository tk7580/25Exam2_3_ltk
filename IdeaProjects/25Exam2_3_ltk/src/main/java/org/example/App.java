package org.example;

public class App {

    public void run() {
        System.out.println("== 명언 앱 실행 ==");

        wiseSayingController wiseSayingController = new wiseSayingController();
        wiseSayingService wiseSayingService = new wiseSayingService();

        while (true) {
            System.out.print("명령어 : ");
            String cmd = Container.getScanner().nextLine().trim();
            if (cmd.equals("등록")) {


            }

        }


    }
}
