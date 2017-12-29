public class Cooker {
    public class Cooker extends Person implements UserInter {
        public Cooker() {
        }

        public void onLine() {
            System.out.println("开始做菜....");
        }

        public void offLine() {
            System.out.println("停止做菜...");
        }
    }

}
1312