public class Boss {
    public class Boss extends Person implements UserInter {
        public Boss() {
        }

        public void onLine() {
            System.out.println("开始投资中....");
        }

        public void offLine() {
            System.out.println("停止投资....");
        }
    }
}
