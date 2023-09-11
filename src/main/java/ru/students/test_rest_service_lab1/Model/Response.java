package ru.students.test_rest_service_lab1.Model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Response {

    private String uid;
    private String operationUid;
    private String systemTime;
    private String code;
    private String codeError;
    private String errorMessage;

}
