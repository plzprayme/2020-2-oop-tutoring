public abstract class  Machine {
    final static int PRICE = 4000;

    int cost;
    long startTime;
    boolean isRunning;

    public Machine() {
        this.cost = 0;
        this.isRunning = false;
    }



    public abstract void run();

    public boolean insertCoin(int cost) {
        this.cost += cost;
        return isEnoughCoin();
    }

    boolean isEnoughCoin() {
        boolean isEnough = this.cost >= PRICE;
        if (!isEnough) {
            System.out.println("돈을 더 넣으세요!");
        }

        return isEnough;
    }


}
