package com.example.biography;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.biography.BiographyAdapters.BiographyAdapter;

public class MainActivity2 extends AppCompatActivity {
    TextView a;
    Button b;
    ImageView c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        int image=intent.getIntExtra("image",0);
        String text=intent.getStringExtra("text");
        String description=intent.getStringExtra("description");
        ImageView imageView=findViewById(R.id.imageView);
        TextView textView=findViewById(R.id.textView);
        TextView base=findViewById(R.id.description);
        imageView.setImageResource(image);
        textView.setText(text);
        base.setText(description);
        a=findViewById(R.id.description);
        b=findViewById(R.id.button2);
        c=findViewById(R.id.imageView);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=a.getText().toString();


                Intent intent1=new Intent();
                intent1.setAction(Intent.ACTION_SEND);
                intent1.setType("text/plain");

                intent1.putExtra(Intent.EXTRA_TEXT,s);

                startActivity(intent1);
            }
        });

    }
}