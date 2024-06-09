package com.firstproject.unitconverter;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView textView;
    String TAG=MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate::");
        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();

//                Converting a string into double
                double kilos = Double.parseDouble(inputText);

//                Converting kilos int pounds
                double pounds  =  makeConversion(kilos);


//                Displaying the conversion result
                textView.setText("" + pounds);
            }
        });
    }
    @Override
    protected void  onStart(){
        super.onStart();
        Log.d(TAG, "onStart:::");
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.d(TAG,"On Resume:::");
    }
    @Override
    protected void  onPause(){
        super.onPause();
        Log.d(TAG,"On Pause::::");
    }

    @Override
    protected void  onStop(){
        super.onStop();
        Log.d(TAG,"On Stop::::");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"On Destroy::::");
    }


    public double makeConversion(double kilos){
//         1 kilo = 2.20462

        return  kilos * 2.20462;
    }
}