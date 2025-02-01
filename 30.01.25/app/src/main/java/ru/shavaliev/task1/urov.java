package ru.shavaliev.task1;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class urov extends AppCompatActivity {

    TextView Otvetzad3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_urov);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Otvetzad3 = findViewById(R.id.Otvetzad3);
    }
    public void startNewActivity(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void Otvetzad3(View v) {
        double A = Double.parseDouble(String.valueOf(R.id.AEditText));
        double B = Double.parseDouble(String.valueOf(R.id.BEditText));
        double C = Double.parseDouble(String.valueOf(R.id.CEditText));
        double D = pow(B,2) - 4 * A * C;
        double x1 = (-B + sqrt(D))/(2 * A);
        double x2 = (-B - sqrt(D))/(2 * A);
        Otvetzad3.setText("x1 = " + x1 + "; x2 = " + x2);
    }
}