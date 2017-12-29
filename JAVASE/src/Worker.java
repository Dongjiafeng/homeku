public class Worker extends Person implements UserInter {
    public Worker() {
    }

    public void onLine() {
        System.out.println("开始赚钱中.....");
    }

    public void offLine() {
        System.out.println("停止赚钱");
    }
}
