package decorator;

import componet.饮品;

public class 加醋decorator extends Decorator {

    public 加醋decorator(饮品 yp) {
        super(yp);
    }
    public int price(){
        return yp.price()+2;
    }

    @Override
    public String getName() {
        return "加醋的" +yp.getName();
    }

}
