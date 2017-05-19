package lox;

/**
 * Created by zhangyunjie on 2017/5/19.
 */
public class RuntimeError extends RuntimeException {
    final Token token;
    public RuntimeError(Token token, String s) {
        super(s);
        this.token = token;
    }
}
