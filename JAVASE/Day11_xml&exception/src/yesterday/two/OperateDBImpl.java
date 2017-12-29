package yesterday.two;

import yesterday.one.DatabaseUtil;

public class OperateDBImpl<T> implements OperateDB<T> {

    @Override
    public T operate(T t) {
        DatabaseUtil<T> abc =new DatabaseUtil<>();
        abc.save(t);
        return null;
    }
}
