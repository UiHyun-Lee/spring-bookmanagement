package Model.Service;

import dto.User;

public interface UserService {
    User select(String id);
}