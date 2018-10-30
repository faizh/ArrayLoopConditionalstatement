package comin.example.root.kel3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SwCase extends AppCompatActivity {
    private Button submit;
    private EditText angka;
    private TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sw_case);

        submit = findViewById(R.id.btnsubmitifelse);
        angka = findViewById(R.id.edtangkaifelse);
        hasil = findViewById(R.id.txtvifelse);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nilai = angka.getText().toString();

                switch (nilai){
                    case "A":
                        hasil.setText("Sangat Baik");
                        break;
                    case "B":
                        hasil.setText("Baik");
                        break;
                    case "C":
                        hasil.setText("Cukup");
                        break;
                    case "D":
                        hasil.setText("Buruk");
                        break;
                    case "E":
                        hasil.setText("Sangat Buruk");
                        break;
                    default:
                        hasil.setText("Huruf yang anda masukan salah");
                }
            }
        });
    }
}
