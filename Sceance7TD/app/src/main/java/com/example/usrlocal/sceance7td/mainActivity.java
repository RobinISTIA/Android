package com.example.usrlocal.sceance7td;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class mainActivity extends AppCompatActivity {

  private ArrayList<Button> tableDejeu;
  private Button commencer = null;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}