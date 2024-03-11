package com.example.firstapp2024;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btn ;
    Spinner spinner;
    String[] Cities={"Jerusalem", "Ramallah", "Nablus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_LONG).show();
            }
        });
       //------------------------------------First Method
//        spinner  = (Spinner) findViewById(R.id.spinner);
//        ArrayAdapter<String> adapter=
//                new ArrayAdapter<String>
//                        (this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Cities);
//        spinner.setAdapter(adapter);

        //------------------------------------Second Method

//        spinner  = (Spinner) findViewById(R.id.spinner);
//       List<String> data= new CitiesData().getCitiesName();
//        ArrayAdapter<String> adapter=
//                new ArrayAdapter<String>
//                        (this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,data);
//        spinner.setAdapter(adapter);

        //---------------------------------

    }
    public void onClickBtn2(View view) {
        Toast.makeText(MainActivity.this,"This is Other method",Toast.LENGTH_LONG).show();
    }


}