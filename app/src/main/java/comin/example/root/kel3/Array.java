package comin.example.root.kel3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Array extends AppCompatActivity {
    private EditText edtindex;
    private Button btnsubmit;
    private TextView txthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);

        edtindex = findViewById(R.id.edtindex);
        btnsubmit = findViewById(R.id.btnsubmit);
        txthasil = findViewById(R.id.txthasil);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String indexs = edtindex.getText().toString();
                int index = Integer.parseInt(indexs);
                String[] nama = {"Linda","Santi","Susan","Mila","Ayu"};

                if(index>4){
                    Toast.makeText(Array.this, "Hanya Ada 4 Nomor Index", Toast.LENGTH_SHORT).show();
                }else{
                    txthasil.setText("Index ke - "+index+" adalah " +nama[index]);
                }


            }
        });
    }
}
