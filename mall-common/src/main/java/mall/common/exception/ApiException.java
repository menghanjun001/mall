package mall.common.exception;

import lombok.Data;
import mall.common.api.IErrorCode;

/**
 * 自定义异常
 * @Created by menghanjun
 * @Date 2020/11/24 3:59 下午
 */
@Data
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode iErrorCode) {
        super(iErrorCode.getMessage());
        this.errorCode = iErrorCode;
    }
    public ApiException() {
        super();
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
