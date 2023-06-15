package com.yorijori.foodcode.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yorijori.foodcode.jpa.entity.UserWishlist;

public interface UserWishlistRepository extends JpaRepository<UserWishlist, Integer> {

}
