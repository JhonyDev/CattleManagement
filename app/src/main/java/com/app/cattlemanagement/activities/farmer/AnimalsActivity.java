package com.app.cattlemanagement.activities.farmer;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.app.cattlemanagement.R;

public class AnimalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
    }

    public void back(View view) {
        finish();
    }

    public void animalInfo(View view) {
        Toast.makeText(this, "Update information screen for this animal", Toast.LENGTH_SHORT).show();
    }
}