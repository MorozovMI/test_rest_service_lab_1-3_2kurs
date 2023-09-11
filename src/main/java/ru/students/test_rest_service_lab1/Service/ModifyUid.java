package ru.students.test_rest_service_lab1.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.test_rest_service_lab1.Model.Response;

@Service
@Qualifier("ModifyUid")
public class ModifyUid implements MyModifyService{

    @Override
    public Response modify(Response response) {
        response.setUid("New Uid");

        return response;
    }
}
