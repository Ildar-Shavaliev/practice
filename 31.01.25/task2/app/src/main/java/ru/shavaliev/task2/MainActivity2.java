package ru.shavaliev.task2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView Otvet2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Otvet2.findViewById(R.id.Otvet2);
    }

    public void startNewActivity(View v) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void ubivaybe(View v) {
        int a = Integer.parseInt(String.valueOf(R.id.Azad2));
        int b = Integer.parseInt(String.valueOf(R.id.Bzad2));
        int c = Integer.parseInt(String.valueOf(R.id.Czad2));
        int d = Integer.parseInt(String.valueOf(R.id.Dzad2));
        int q = a * b;
        int w = a * c;
        int e = a * d;
        int min = Math.min(q, w);
        min = Math.min(min, e);
        int max = Math.max(q, w);
        max = Math.max(max, e);
        int sred = 0;
        if (q != max || q != min)
            sred = q;
        else if (w != max || w != min)
            sred = w;
        else
            sred = e;
        Otvet2.setText("Ответ: " + max + sred + min);
    }
}