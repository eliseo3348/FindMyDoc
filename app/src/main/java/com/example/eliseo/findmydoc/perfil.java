package com.example.eliseo.findmydoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class perfil extends AppCompatActivity {
    Button pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        pass= (Button) findViewById(R.id.actpass);
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent passs;
                passs = new Intent(perfil.this, pass.class);
                startActivity(passs);

            }
        });

    }
}
