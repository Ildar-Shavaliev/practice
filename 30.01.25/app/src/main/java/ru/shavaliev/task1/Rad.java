package ru.shavaliev.task1;

import static java.lang.Math.*;

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

public class Rad extends AppCompatActivity {
    TextView Otvet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rad);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Otvet = findViewById(R.id.Otvet);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, urov.class);
        startActivity(intent);
    }

    public void FindOtvet(View v) {
        double L = Double.parseDouble(String.valueOf(R.id.VvodL));
        double R = L / (2 * PI);
        double S = PI * pow(R, 2);
        Otvet.setText("Радиус = " + R + "; Площадь = " + S);
    }
}