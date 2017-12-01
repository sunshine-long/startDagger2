package com.example.marlon.startdaggar;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Marlon
 * @date 2017/12/1
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
