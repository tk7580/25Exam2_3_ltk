package org.example;

public class App {

    public void run() {
        System.out.println("== 명언 앱 실행 ==");

        wiseSayingController wiseSayingController = new wiseSayingController();

        while (true) {
            System.out.print("명령어 : ");
            String cmd = Container.getScanner().nextLine().trim();
            if (cmd.equals("등록")) {
                wiseSayingController.add();
            }else if (cmd.equals("목록")) {
                wiseSayingController.list();
            }else if (cmd.startsWith("수정")){
                wiseSayingController.edit();
            }else if (cmd.startsWith("상세보기")){
                wiseSayingController.detail();
            }

        }


    }
}
