package com.example.quiz.service;

import com.example.quiz.Player;
import com.example.quiz.dao.PlayerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Transactional
@Service
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;

    public List<Player> getAllPlayers() {
        return playerDao.findAll();
    }

    public Optional<Player> getPlayerById(UUID id) {
        return playerDao.findById(id);
    }

    public Player addPlayer(Player player) {
        return playerDao.save(player);
    }

    public void deletePlayer(UUID id) {
        playerDao.deleteById(id);
    }
}
