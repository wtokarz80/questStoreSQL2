package com.codecool.queststore.controller;

import com.codecool.queststore.dao.QuestDao;
import com.codecool.queststore.dao.UserDao;
import com.codecool.queststore.inputProvider.InputProvider;
import com.codecool.queststore.service.QuestService;
import com.codecool.queststore.view.View;

public class SessionController {

    private final UserDao userDao = new UserDao();
    private final InputProvider inputProvider= new InputProvider();
    private final QuestDao questDao = new QuestDao();
    private final View view = new View();

    public UserDao getUserDao() {
        return userDao;
    }

    public InputProvider getInputProvider() {
        return inputProvider;
    }


    public QuestDao getQuestDao() {
        return questDao;
    }

    public View getView() {
        return view;
    }
}
