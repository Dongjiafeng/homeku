package decorator;

import componet.饮品;

public class 兑水decorator extends  Decorator{
    public 兑水decorator(饮品 yp) {
        super(yp);
    }

    @Override
    public int price() {
        return yp.price() - 5;
    }

    @Override
    public String getName() {
        return "兑水的"+yp.getName();
    }
}
