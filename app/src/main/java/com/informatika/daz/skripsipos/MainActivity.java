package com.informatika.daz.skripsipos;

import android.content.pm.ActivityInfo;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends FragmentActivity {

    @BindView(R.id.menu) ImageButton btnMenu;
    @BindView(R.id.history) ImageButton btnHistory;
    Menu Menu;
    History history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @OnClick(R.id.menu)
    public void menu() {
        Menu = new Menu();
        FragmentTransaction ft =getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, Menu);
        ft.commit();
    }

    @OnClick(R.id.history)
    public void history() {
        history = new History();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, history);
        ft.commit();
    }





}
