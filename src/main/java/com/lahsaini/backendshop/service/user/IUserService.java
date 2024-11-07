package com.lahsaini.backendshop.service.user;

import com.lahsaini.backendshop.dto.UserDto;
import com.lahsaini.backendshop.model.User;
import com.lahsaini.backendshop.request.CreateUserRequest;
import com.lahsaini.backendshop.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();
}
