package comin.example.root.kel3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Percabangan extends AppCompatActivity {
    private Button btnif, btnifelse, btnifelse2, btnswitchcase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percabangan);

        btnif = findViewById(R.id.btnif);
        btnifelse = findViewById(R.id.btnifelse);
        btnifelse2 = findViewById(R.id.btnifelse2);
        btnswitchcase = findViewById(R.id.btnswcase);

        btnif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Percabangan.this, If.class);
                Percabangan.this.startActivity(intent);
            }
        });

        btnifelse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Percabangan.this, IfElse.class);
                Percabangan.this.startActivity(intent);
            }
        });

        btnifelse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Percabangan.this, IfElse2.class);
                Percabangan.this.startActivity(intent);
            }
        });

        btnswitchcase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Percabangan.this, SwCase.class);
                Percabangan.this.startActivity(intent);
            }
        });

    }
}
