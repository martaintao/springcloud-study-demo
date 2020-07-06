package com.martain.study.common.exception;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/3/29 9:28 上午
 */
public class OperationFailingException extends RuntimeException {
    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public OperationFailingException(String message) {
        super(message);
    }
}
