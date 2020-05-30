package com.goowia.swing.repository;

import com.goowia.swing.model.AlphabetModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlphabetRepository extends JpaRepository<AlphabetModel, Integer> {

}
