package com.oxmar.ww.kalkulatorapp;

import android.app.Activity;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends Activity implements View.OnClickListener {

    Button bPlus, bMin, bMultiple, bDvide;
    EditText edtSatu, edtDua, out;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSatu = (EditText) findViewById(R.id.idEdtAngka1);
        edtDua = (EditText) findViewById(R.id.idEdtAngka2);
        out = (EditText) findViewById(R.id.idEdtHasil);
        bMin = (Button) findViewById(R.id.idBtnKurang);
        bPlus = (Button) findViewById(R.id.idBtnTambah);
        bMultiple = (Button) findViewById(R.id.idBtnKali);
        bDvide = (Button) findViewById(R.id.idBtnBagi);

        bPlus.setOnClickListener(this);
        bDvide.setOnClickListener(this);
        bMin.setOnClickListener(this);
        bMultiple.setOnClickListener(this);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

//


    @Override
    public void onClick(View v) {

        //Deklarasi variable
        String varAngka1, varAngka2;

        switch (v.getId()) {
            case R.id.idBtnTambah:
                varAngka1 = edtSatu.getText().toString();
                varAngka2 = edtDua.getText().toString();
                if (!varAngka1.equals("") && !varAngka2.equals("")) {
                    String hasil = penjumlahan(varAngka1, varAngka2);
                    out.setText(hasil);
                }
                break;
            case R.id.idBtnKurang:
                varAngka1 = edtSatu.getText().toString();
                varAngka2 = edtDua.getText().toString();
                if (!varAngka1.equals("") && !varAngka2.equals("")) {
                    String hasil = pengurangan(varAngka1, varAngka2);
                    out.setText(hasil);
                }
                break;
            case R.id.idBtnKali:
                varAngka1 = edtSatu.getText().toString();
                varAngka2 = edtDua.getText().toString();
                if (!varAngka1.equals("") && !varAngka2.equals("")) {
                    String hasil = perkalian(varAngka1, varAngka2);
                    out.setText(hasil);
                }
                break;
            case R.id.idBtnBagi:
                varAngka1 = edtSatu.getText().toString();
                varAngka2 = edtDua.getText().toString();
                if (!varAngka1.equals("") && !varAngka2.equals("")) {
                    String hasil = pembagian(varAngka1, varAngka2);
                    out.setText(hasil);
                }
                break;
        }
    }

    private String penjumlahan(String a, String b) {
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double dHasil = d1 + d2;
        String sHasil = String.valueOf(dHasil);
        return sHasil;
    }

    private String pembagian(String a, String b) {
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double dHasil = d1 / d2;
        String sHasil = String.valueOf(dHasil);
        return sHasil;
    }

    private String pengurangan(String a, String b) {
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double dHasil = d1 - d2;
        String sHasil = String.valueOf(dHasil);
        return sHasil;
    }

    private String perkalian(String a, String b) {
        Double d1 = Double.parseDouble(a);
        Double d2 = Double.parseDouble(b);
        Double dHasil = d1 * d2;
        String sHasil = String.valueOf(dHasil);
        return sHasil;
    }
}
