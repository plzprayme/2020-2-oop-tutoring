import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 세탁기 설치
        WashingMachine wm = new WashingMachine();
        DryMachine dm = new DryMachine();

        // 무한반복
        while (true) {
            System.out.println(">> 환영합니다! 무엇을 도와드릴까요?");
            System.out.println(">> 1. 세탁기 사용하기 2. 건조기 사용하기 3. 게임기 사용하기 4. 나가기");
            System.out.print("<< 번호를 입력하세요: ");
            int task = new Scanner(System.in).nextInt();

            switch (task) {
                case 1:
                    // 돈을 넣은 후 세탁기 실행 가능한지 체크
                    if (wm.insertCoin(4000)) {
                        wm.run();
                    }

                    break;
                case 2:
                    if (dm.insertCoin(4000)) {
                        dm.run();
                    }
                    break;
                case 3:
                    // 게임기 사용
                    break;
                case 4:
                    System.out.println(">> 안녕히 가세요!");
                    return;
                default:
                    System.out.println(">> 존재하지 않는 선택지입니다!");
                    break;
            }

        }

    }
}
