package com.example.marlon.startdaggar;

import android.content.Context;

import com.example.marlon.startdaggar.utils.LitePrefUtils;

import java.security.PublicKey;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Marlon
 * @date 2017/12/1
 */

@Module
public class AppModule {

    @Singleton
    @Provides
    public LitePrefUtils getSPre(Context context){
        return LitePrefUtils.getInstance(context);
    }
    @Singleton
    @Provides
    public Context getContext(){
        return new MyApplication().getApplicationContext();
    }
}
