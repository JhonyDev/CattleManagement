package com.app.cattlemanagement.activities.consumer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.app.cattlemanagement.R;
import com.app.cattlemanagement.activities.auth.AuthLoginActivity;
import com.app.cattlemanagement.activities.driver.DriverDashboard;
import com.google.firebase.auth.FirebaseAuth;

public class ConsumerDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_dashboard);
    }

    public void switchToSeller(View view) {
        startActivity(new Intent(this, DriverDashboard.class));
        finish();
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(this, AuthLoginActivity.class));
        finish();
    }

    public void addLocation(View view) {
        startActivity(new Intent(this, AddLocationActivity.class));

    }

    public void addTrashSources(View view) {
        startActivity(new Intent(this, AddTrashSourceActivity.class));

    }
}