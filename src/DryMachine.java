public class DryMachine  extends Machine{

    public DryMachine() {
        super();
    }

    @Override
    public void run() {
        // 건조기가 이미 동작하고 있기 때문에 동작할 수 없다.
        // 건조기가 동작한지 10분이 넘었으면 건조기를 종료한다.
        if (isRunning) {
            // 시간 비교를 위해 현재시간 가져오기
            long currentTime = System.currentTimeMillis();
            // 작동한 시간 얻기
            long runningTime = (currentTime - startTime) / 1000;
            // 10초 이상 작동헀는지 체크하기
            boolean isDone = runningTime >= 10;
            // 10초 이상 작동 안했으면 아래 코드가 실행되지 않도록 종료
            if (!isDone) {
                System.out.println(">> 건조기가 이미 작동 중입니다! " + (10 - runningTime) + "초 남았습니다!");
                return;
            }

            // 10초 이상 작동 했으면 작동중이 아니도록 변수를 수정
            isRunning = !isRunning;
        }


        // 건조기가 동작하고 있기 때문에 동작할 수 있다.
        if (!isRunning) {
            // 돈 초기화
            this.cost = 0;
            // 실행중인 것 기록
            isRunning = !isRunning;
            // 시간 기록
            startTime = System.currentTimeMillis();

            System.out.println(">> 건조를 시작합니다. 10초가 소요됩니다.");
        }

        System.out.println();
    }
}
