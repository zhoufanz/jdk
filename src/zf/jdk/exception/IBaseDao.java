package zf.jdk.exception;

/**
 * Created by zf on 2017-02-23.
 */
public interface IBaseDao<T> {
    T insert() throws  BusinessException;
}
