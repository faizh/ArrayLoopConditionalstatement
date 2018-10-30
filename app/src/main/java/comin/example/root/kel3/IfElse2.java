package comin.example.root.kel3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IfElse2 extends AppCompatActivity {
    private Button submit;
    private EditText huruf;
    private TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_if_else2);

        submit = findViewById(R.id.btnsubmitifelse);
        huruf = findViewById(R.id.edtangkaifelse);
        hasil = findViewById(R.id.txtvifelse);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String jk = huruf.getText().toString();
                if ((jk.equals("L"))){
                    hasil.setText("Jenis Kelamin Anda Laki-Laki");
                }else if ((jk.equals("P"))){
                    hasil.setText("Jenis Kelamin Anda Perempuan");
                }else {
                    hasil.setText("Anda Salah Memasukan Kode.");
                }
            }
        });


    }
}
