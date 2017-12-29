import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Login extends UserData {
    UserInter uderinter;

    public Login() {
    }

    public UserInter show(String yo1, String mi1) {
        for(int i = 0; i < this.user.length; ++i) {
            if (this.user[i][1].equals(yo1) && this.user[i][2].equals(mi1)) {
                System.out.println("登录成功");
                System.out.println("用户 " + this.user[i][0] + "职业 " + this.user[i][3]);
                long l = System.currentTimeMillis();
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String time = df.format(l);
                System.out.println(time);
                if (this.user[i][3].equals("Worker")) {
                    this.uderinter = new Worker();
                } else if (this.user[i][3].equals("Doctor")) {
                    this.uderinter = new Doctor();
                } else if (this.user[i][3].equals("Cooker")) {
                    this.uderinter = new Cooker();
                } else if (this.user[i][3].equals("Boss")) {
                    this.uderinter = new Boss();
                }

                return this.uderinter;
            }
        }

        System.out.println("你的输入错误.");
        return null;
    }
}
