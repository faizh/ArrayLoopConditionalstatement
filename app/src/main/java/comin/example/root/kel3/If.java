package comin.example.root.kel3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class If extends AppCompatActivity {
    private Button submit;
    private EditText angka;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if);

        submit = findViewById(R.id.btnsubmitif);
        angka = findViewById(R.id.edtangkaif);
        hasil = findViewById(R.id.txtvif);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberr = angka.getText().toString();
                int number = Integer.parseInt(numberr);
                if (number%2 == 0){
                    hasil.setText(number+" adalah Angka Genap");
                }
            }
        });
    }
}
