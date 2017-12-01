package com.example.marlon.startdaggar;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Marlon
 * @date 2017/12/1
 */

@Module
public class MainModule {
    @Provides
    public Cloth getCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Provides
    public Clothes getCloths() {
        Cloth cloth = new Cloth();
        cloth.setColor("黑色");
        Clothes clothes = new Clothes(cloth);
        return clothes;
    }


    @Provides
    @Named("red")
    public Clothes getRedCloths(@RedCloth Cloth cloth){
        return new Clothes(cloth);
    }


    @Singleton
    @RedCloth
    @Provides
    public Cloth redCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @Named("blue")
    @Provides
    public Cloth blueCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("黑色");
        return cloth;
    }

}
