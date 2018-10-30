package comin.example.root.kel3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class While extends AppCompatActivity {
    private EditText awal, akhir;
    private TextView txtloop;
    private Button loop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_while);
        awal = findViewById(R.id.edtawal);
        akhir = findViewById(R.id.edtakhir);
        loop = findViewById(R.id.btnloop);
        txtloop = findViewById(R.id.txtloop);

        loop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String awals = awal.getText().toString();
                String akhirs = akhir.getText().toString();
                StringBuilder sb = new StringBuilder("");

                int awal = Integer.parseInt(awals);
                int akhir = Integer.parseInt(akhirs);

                int x = awal;
                while (x<akhir){
                    sb.append("Loop ke - " +x);
                    sb.append("\n");
                    x++;
                }
                txtloop.setText(sb.toString());



            }
        });
    }
}
