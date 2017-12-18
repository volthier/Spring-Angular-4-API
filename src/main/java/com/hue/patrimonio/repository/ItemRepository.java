package com.hue.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hue.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
