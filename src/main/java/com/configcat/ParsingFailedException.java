package com.configcat;

/**
 * Represents an exception which is being thrown when the parsing of a given json fails.
 */
public class ParsingFailedException extends Exception {
    private String json;
    private Exception innerException;

    /**
     * Gets the json string which was failed to parse.
     *
     * @return the json string which was failed to parse.
     */
    public String getJson() {
        return this.json;
    }

    /**
     * Gets the inner exception.
     *
     * @return the inner exception.
     */
    public Exception getInnerException() {
        return this.innerException;
    }

    /**
     * Constructs a parse exception object.
     *
     * @param message the message of the exception.
     * @param json the json string which was failed to parse.
     * @param exception the inner exception.
     */
    public ParsingFailedException(String message, String json, Exception exception) {
        super(message);
        this.json = json;
        this.innerException = exception;
    }
}