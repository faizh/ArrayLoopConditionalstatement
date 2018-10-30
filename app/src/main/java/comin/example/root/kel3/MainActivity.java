package comin.example.root.kel3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button perulangan, percabangan, array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        perulangan = findViewById(R.id.btnperulangan);
        percabangan = findViewById(R.id.btnpercabangan);
        array = findViewById(R.id.btnarray);

        percabangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Percabangan.class);
                MainActivity.this.startActivity(intent);
            }
        });

        perulangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Perulangan.class);
                MainActivity.this.startActivity(intent);
            }
        });

        array.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Array.class);
                MainActivity.this.startActivity(intent);
            }
        });

    }
}
