package com.blackFlix.services;

import com.blackFlix.dao.MovieDAO;
import com.blackFlix.dao.UserDAO;
import com.blackFlix.models.Movie;
import com.blackFlix.models.UserProfile;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public List<UserProfile> fetchUserList(String status) {
        return userDAO.fetchAllByStatus(status);
    }

    public void updateUserStatus(String email, String newStatus) {
        userDAO.updateUserStatusByEmail(email, newStatus);
    }


}
