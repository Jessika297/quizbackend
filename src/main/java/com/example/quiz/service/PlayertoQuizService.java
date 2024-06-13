package com.example.quiz.service;

import com.example.quiz.Playertoquiz;
import com.example.quiz.dao.PlayertoQuizDao;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Transactional
@Service
public class PlayertoQuizService {

    @Autowired
    private PlayertoQuizDao playertoQuizDao;

    @Autowired
    private EntityManager manger;

    public List<Playertoquiz> getAllPlayertoQuizzes() {
        return playertoQuizDao.findAll();
    }

    public Optional<Playertoquiz> getPlayertoQuizById(UUID id) {
        return playertoQuizDao.findById(id);
    }

    public Playertoquiz addPlayertoQuiz(Playertoquiz playertoQuiz) {
        return playertoQuizDao.save(playertoQuiz);
    }

    public void deletePlayertoQuiz(UUID id) {
        playertoQuizDao.deleteById(id);
    }

    public List<PlayertoquizDTO> getPlayertoquizByQuizId(UUID quizid) {
        List<Object[]> results = playertoQuizDao.findByQuizIdWithPlayerName(quizid);
        return results.stream().map(result -> {
            Playertoquiz playertoquiz = (Playertoquiz) result[0];
            String playerName = (String) result[1];
            return PlayertoquizDTO.from(playertoquiz, playerName);
        }).collect(Collectors.toList());
    }
}
