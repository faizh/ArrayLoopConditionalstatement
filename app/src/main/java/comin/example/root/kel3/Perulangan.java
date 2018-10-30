package comin.example.root.kel3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Perulangan extends AppCompatActivity {
    private Button btnfor, btnwhile, btndowhile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perulangan);

        btnfor = findViewById(R.id.btnfor);
        btnwhile = findViewById(R.id.btnwhile);
        btndowhile = findViewById(R.id.btndowhile);

        btnfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Perulangan.this, For.class);
                Perulangan.this.startActivity(intent);
            }
        });

        btnwhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Perulangan.this, While.class);
                Perulangan.this.startActivity(intent);
            }
        });

        btndowhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Perulangan.this, DoWhile.class);
                Perulangan.this.startActivity(intent);
            }
        });


    }
}
