package com.wg.basics.mapper;

import com.wg.basics.entity.Menu;

import org.springframework.stereotype.Repository;


import java.util.List;

@Repository(value = "menuMapper1")
public interface MenuMapper{

    List<Menu> getAllMenus();
}