package com.example.marlon.startdaggar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    TextView mText;

    @Inject
    Cloth mCloth;

    @Inject
    Shoe mShoe;

    @Inject
    @Named("red")
    Clothes mClothes;

    @Inject
    @Named("blue")
    Cloth blueCloth;

    @Inject
    @RedCloth
    Cloth redCloth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        MainComponent build = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        build.inject(this);

//        mText.setText("我现在有" + mCloth +"和"+mShoe + "和" + mClothes);

        mText.setText("我 现在有" +
                redCloth +
                mClothes +"?" + (mClothes.getCloth().equals(redCloth)));
    }
}
