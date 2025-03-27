package com.juangv.worlds;

public enum World {
    LEVEL1(1), LEVEL2(2);

    private Integer complexFactor;

    public Integer getComplexFactor() {
        return complexFactor;
    }

    //Constructor por defecto, no sería necesario el privado, es redundante para constructores
    private World(Integer complexFactor) {
        this.complexFactor = complexFactor;
    }
}