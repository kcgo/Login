package sample.tqi.com.br.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static sample.tqi.com.br.meuapp.R.string.my_name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // define este text como textView criado no ficheiro XML
        TextView text = findViewById(R.id.textNome);
        text.setText(getString(my_name));

        TextView text1 = findViewById(R.id.textDescricao);
        text1.setText(getString(R.string.my_description));

        FloatingActionButton fab =  findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // adicione sua ação

                Intent intent = new Intent(getApplicationContext(), Objetivos.class);
                startActivity(intent);

            }
        });


    }
}