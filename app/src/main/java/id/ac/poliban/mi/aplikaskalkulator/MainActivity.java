package id.ac.poliban.mi.aplikaskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText angka_pertama, angka_kedua;
    Button tambah, kurang, kali, bagi, bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama = (EditText) findViewById(R.id.etAngkaPertama);
        angka_kedua = (EditText) findViewById(R.id.etAngkaKedua);
        tambah = (Button) findViewById(R.id.btTambah);
        bagi = (Button) findViewById(R.id.btBagi);
        kurang = (Button) findViewById(R.id.btKurang);
        kali = (Button) findViewById(R.id.btKali);
        bersihkan = (Button) findViewById(R.id.btBersihkan);
        hasil = (TextView) findViewById(R.id.tvHasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
            {
                double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                double result = angka1 + angka2;
                hasil.setText(Double.toString(result));
            }
                else {
                Toast toast = Toast.makeText(MainActivity.this,"Mohon masukkan angka pertama & kedua", Toast.LENGTH_LONG);
                toast.show();
            }
        }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this,"Masukkan angka pertama & kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }

            });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this,"Masukkan angka pertama & kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((angka_pertama.getText().length()>0) && (angka_kedua.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }
            }
        });


}}
