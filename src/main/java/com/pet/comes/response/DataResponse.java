package com.pet.comes.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DataResponse<T> {
    private int status;
    private String responseMessage;
    private T data;

    public DataResponse(final int status, final String responseMessage, T data) {
        this.status = status;
        this.responseMessage = responseMessage;
        this.data = data;
    }

    public static<T> DataResponse<T> response(final int status, final String responseMessage, T data) {
        return DataResponse.<T>builder()
                .status(status)
                .responseMessage(responseMessage)
                .data(data)
                .build();
    }
}
