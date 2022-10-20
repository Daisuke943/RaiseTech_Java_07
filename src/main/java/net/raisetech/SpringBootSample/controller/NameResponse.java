package net.raisetech.SpringBootSample.controller;

import lombok.Getter;
import lombok.Setter;
import net.raisetech.SpringBootSample.entity.Name;

@Getter
public class NameResponse {
    private int id;
    private String name;
    public NameResponse() {
    }
    // NameからNameResponseに変換できるコンストラクタを⽤意
    public NameResponse(Name name) {
        this.id = name.getId();
        this.name = name.getName();
    }
}
