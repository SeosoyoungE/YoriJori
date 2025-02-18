package com.yorijori.foodcode.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yorijori.foodcode.jpa.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {
	Board findByCommNo(int commNo);
}
