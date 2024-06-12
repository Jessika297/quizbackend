package com.example.quiz.service;

import com.example.quiz.PlayertoQuiz;
import com.example.quiz.PlayertoQuizKey;
import com.example.quiz.dao.PlayertoQuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class PlayertoQuizService {

    @Autowired
    private PlayertoQuizDao playertoQuizDao;

    public List<PlayertoQuiz> getAllPlayertoQuizzes() {
        return playertoQuizDao.findAll();
    }

    public Optional<PlayertoQuiz> getPlayertoQuizById(PlayertoQuizKey id) {
        return playertoQuizDao.findById(id);
    }

    public PlayertoQuiz addPlayertoQuiz(PlayertoQuiz playertoQuiz) {
        return playertoQuizDao.save(playertoQuiz);
    }

    public void deletePlayertoQuiz(PlayertoQuizKey id) {
        playertoQuizDao.deleteById(id);
    }
}
