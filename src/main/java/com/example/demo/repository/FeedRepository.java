package com.example.demo.repository;

import com.example.demo.model.Feed;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface FeedRepository extends JpaRepository<Feed, Long> {
List<Feed> findByUsername(String username);
    

}
