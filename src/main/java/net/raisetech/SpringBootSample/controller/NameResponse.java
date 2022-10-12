package net.raisetech.SpringBootSample.controller;

import lombok.Getter;
import net.raisetech.SpringBootSample.entity.Name;

@Getter
public class NameResponse {
    private int id;
    private String name;
    // NameからNameResponseに変換できるコンストラクタを⽤意
    public NameResponse(Name name) {
        this.id = name.getId();
        this.name = name.getName();
    }
}
