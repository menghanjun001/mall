package mall.common.exception;

import mall.common.api.IErrorCode;

/**
 * @Created by menghanjun
 * @Date 2020/11/24 4:15 下午
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
