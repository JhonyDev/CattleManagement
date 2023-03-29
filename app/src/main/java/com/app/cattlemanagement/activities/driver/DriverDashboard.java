package com.app.cattlemanagement.activities.driver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.app.cattlemanagement.R;
import com.app.cattlemanagement.activities.auth.AuthLoginActivity;
import com.app.cattlemanagement.activities.consumer.ConsumerDashboard;
import com.google.firebase.auth.FirebaseAuth;

public class DriverDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_dashboard);
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(this, AuthLoginActivity.class));
        finish();
    }

    public void switchToBuyer(View view) {
        startActivity(new Intent(this, ConsumerDashboard.class));
        finish();
    }

    public void assignedTrashLocations(View view) {
        startActivity(new Intent(this, AssignedTrashLocationsActivity.class));

    }
}