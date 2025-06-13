package com.loiloop.LoiloopRoom.service.interfac;

import com.loiloop.LoiloopRoom.dto.LoginRequest;
import com.loiloop.LoiloopRoom.dto.Response;
import com.loiloop.LoiloopRoom.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
