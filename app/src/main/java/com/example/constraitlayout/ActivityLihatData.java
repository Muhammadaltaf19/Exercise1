package com.example.constraitlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityLihatData extends Activity {

    TextView tvnama, tvnomor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
        tvnama = (TextView) findViewById(R.id.NamaKontak);
        tvnomor = (TextView) findViewById(R.id.NomorTelepon);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch (nama){
            case "Fundik":
                tvnama.setText("Fundik J");
                tvnomor.setText("088809700501");
                break;
            case "Ilham":
                tvnama.setText("M Ilham");
                tvnomor.setText("08878801478");
                break;
            case "Lutfi":
                tvnama.setText("Lutfi H");
                tvnomor.setText("088211011592");
                break;
            case "Ali":
                tvnama.setText("Ali A");
                tvnomor.setText("0881025221787");
                break;
            case "Yoyok":
                tvnama.setText("Yoyok");
                tvnomor.setText("0881025221789");
                break;
            case "Syahra":
                tvnama.setText("Syahra Q");
                tvnomor.setText("08025331516");
                break;
            case "Rosa":
                tvnama.setText("Rosa D");
                tvnomor.setText("082122717100");
                break;
            case "Anna":
                tvnama.setText("Anna");
                tvnomor.setText("082122717148");
                break;
            case "Vian":
                tvnama.setText("Vian A");
                tvnomor.setText("088281191579");
                break;
            case "Windah":
                tvnama.setText("Windah B");
                tvnomor.setText("08818191429");
                break;
        }
    }
}
