public class Doctor extends Person implements UserInter {
    public Doctor() {
    }

    public void onLine() {
        System.out.println("开始看病....");
    }

    public void offLine() {
        System.out.println("停止看病...");
    }
}
