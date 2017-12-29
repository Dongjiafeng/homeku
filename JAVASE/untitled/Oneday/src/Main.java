import org.dom4j.DocumentException;

import java.io.IOException;
import java.util.Scanner;
import Exception.Metooexception;
public class Main {

    public static void main(String[] args) throws DocumentException {
        Scanner input = new Scanner(System.in);
        Person person = null;

        while (true) {
            System.out.println("欢迎来到BAT! 1.注册   2.登录");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    input.nextLine();
                    System.out.println("请输入姓名");
                    String name = input.nextLine();
                    System.out.println("请输入你的用户名");
                    String username = input.nextLine();
                    try {
                        Metoo.show(username);
                    } catch (Metooexception e) {
                        e.message();
                    }


                    System.out.println("请输入你的密码");
                    String password = input.nextLine();
                    System.out.println("请选择你的职业:  1.工人  2.教师  3.厨师  4.老板");
                    int choose1 = input.nextInt();
                    switch (choose1) {
                        case 1:
                            person = new Worker(name, username, password, "Worker");
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    try {
                        UserOpern.register(person);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (DocumentException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("请输入用户名");
                    String username1 = input.nextLine();
                    System.out.println("请输入密码");
                    String password1 = input.nextLine();
                    UserOpern.Login(username1, password1);

            }
        }
    }
}
