package com.example.covidtracer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class LoggedInActivity extends AppCompatActivity {
    private TextView currentFamilyName;
    private TextView currentSurname;
    private TextView currentStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        currentFamilyName = findViewById(R.id.textCurrentFamilyName);
        currentSurname = findViewById(R.id.textCurrentSurname);
        currentStatus = findViewById(R.id.textCurrentStatus);

        SharedPreferences sharedPreferences = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE);
        String strCurrentFamilyName = sharedPreferences.getString(getString(R.string.familyName), "None");
        String strCurrentSurname = sharedPreferences.getString(getString(R.string.surname), "None");
        String strCurrentStatus = sharedPreferences.getString(getString(R.string.status), "None");

        currentFamilyName.setText(strCurrentFamilyName);
        currentSurname.setText(strCurrentSurname);
        currentStatus.setText(strCurrentStatus);
    }
}
