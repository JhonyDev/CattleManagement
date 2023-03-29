package com.app.cattlemanagement.activities.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.app.cattlemanagement.R;
import com.app.cattlemanagement.activities.auth.AuthLoginActivity;
import com.google.firebase.auth.FirebaseAuth;

public class AdminDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);
    }

    public void SignUpRequests(View view) {
        startActivity(new Intent(this, UserRegistrationsActivity.class));
    }

    public void TrashRequests(View view) {
        startActivity(new Intent(this, TrashSourceRequestsActivity.class));
    }

    public void AssignTrashToDrivers(View view) {
        startActivity(new Intent(this, DriverAssignmentActivity.class));
    }

    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(this, AuthLoginActivity.class));
        finish();
    }
}