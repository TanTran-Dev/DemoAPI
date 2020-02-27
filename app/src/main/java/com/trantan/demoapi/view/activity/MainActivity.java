package com.trantan.demoapi.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.trantan.demoapi.R;
import com.trantan.demoapi.view.fragment.FragmentPage;

public class MainActivity extends AppCompatActivity{
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new FragmentPage())
                .commit();
    }

    private void initView() {
        drawerLayout = findViewById(R.id.drawer_layout);
    }

}
