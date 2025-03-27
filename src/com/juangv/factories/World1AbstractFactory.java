package com.juangv.factories;

import com.juangv.products.Daemon;
import com.juangv.products.Witch;
import com.juangv.worlds.World1Daemon;
import com.juangv.worlds.World1Witch;

public class World1AbstractFactory implements EnemyAbstractFactory {

    @Override
    public double getProbabilidadDaemon() {
        return 0.5; //50% de generar un demonio
    }

    @Override
    public double getProbabilidadWitch() {
        return 0.5; //50% de generar una bruja
    }

    @Override
    public Daemon createDaemon(){
        return new World1Daemon("com.juangv.products.Daemon");
    }

    @Override
    public Witch createWitch(){
        return new World1Witch("com.juangv.products.Witch");
    }
}