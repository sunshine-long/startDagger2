package com.example.marlon.startdaggar;

import android.content.Context;

import dagger.Component;
import dagger.Provides;

/**
 * @author Marlon
 * @date 2017/12/1
 */

@Component(modules = AppModule.class)
public interface AppComponent {

    Context getContext();

}
