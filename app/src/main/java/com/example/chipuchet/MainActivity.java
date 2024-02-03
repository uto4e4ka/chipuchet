package com.example.chipuchet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

import com.example.chipuchet.authorization.Registration;
import com.example.chipuchet.menu.MainMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //OpenReg();
        Intent intent = new Intent(this, QRscan.class);
        startActivity(intent);
    }
    void Chipi(){

    }
    public void OpenReg(){
        Registration reg = new Registration();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.farmeLayout,reg);
        ft.commit();
    }
    public void OpenMenu(){
        MainMenu reg = new MainMenu();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.farmeLayout,reg);
        ft.commit();
    }
}