package fauzi.hilmy.avergecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etIndo, etMatematika, etInggris, etKomputer;
    Button btnSubmit;
    TextView txtTotal, txtRata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //memanggil id widget
        etIndo = (EditText)findViewById(R.id.etIndo);
        etMatematika = (EditText)findViewById(R.id.etMatematika);
        etInggris = (EditText)findViewById(R.id.etInggris);
        etKomputer = (EditText)findViewById(R.id.etKomputer);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        txtTotal = (TextView)findViewById(R.id.txtTotal);
        txtRata = (TextView)findViewById(R.id.txtRata);

        //aksi ketika button di klik
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget editText dan memasukkan ke nilai string
                String nIndo = etIndo.getText().toString();
                String nMTK = etMatematika.getText().toString();
                String nInggris = etInggris.getText().toString();
                String nKomputer = etKomputer.getText().toString();

                //mengecek apakah editText kosong
                //kondisi ketika panjangnya kosong
                if(nIndo.isEmpty()){
                    //memberi warning berupa error
                    etIndo.setError("Nilai Tidak Boleh Kosong");
                }else if (nMTK.isEmpty()){
                    //kondisi ktika lebarnya kosong
                    etMatematika.setError("Nilai tidak boleh kosong");
                }else if (nInggris.isEmpty()){
                    //kondisi ktika lebarnya kosong
                    etInggris.setError("Nilai tidak boleh kosong");
                }else if (nKomputer.isEmpty()){
                    //kondisi ktika lebarnya kosong
                    etKomputer.setError("Nilai tidak boleh kosong");
                }else{
                    //mengubah nilai dari string k integer
                    int aIndo = Integer.parseInt(nIndo);
                    int aMTK = Integer.parseInt(nMTK);
                    int aInggris = Integer.parseInt(nInggris);
                    int aKomputer = Integer.parseInt(nKomputer);

                    //kondisi ktika panjang dan lebarnya tidak kosong
                    int hasilTotal = aIndo + aMTK + aInggris + aKomputer;
                    int hasilRataRata = (aIndo + aMTK + aInggris + aKomputer) / 4;

                    //menampilkan hasil hitung ke widget textView
                    txtTotal.setText("Total Nilai = " + hasilTotal);
                    txtRata.setText("Rata Rata = " + hasilRataRata);
                }
            }
        });
    }
}
