package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    // Declaraciones de las variables

    private EditText editText;
    private EditText  editText1;
    private ProgressBar progress;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Aqui llamo los elementos por id
        editText  =(EditText)findViewById(R.id.edit1);
        editText1 =(EditText)findViewById(R.id.edit2);
        progress  =(ProgressBar)findViewById(R.id.pb);
        button    =(Button)findViewById(R.id.btn);


       button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            new Task().execute(); // ejecuta mi tarea asíncrona.
        }
    });


        progress.setVisibility(View.INVISIBLE); // desaparece el elemento.
}


// Tarea Asíncrona.

class Task extends AsyncTask<String, Void, String> {

    @Override  // Vamos a darle la configuración inicial a la tarea
    protected void onPreExecute() {

        progress.setVisibility(View.VISIBLE);
    }


    @Override // vamos a emplear el proceso o tarea pesada en segundo plano.
    protected String doInBackground(String... strings) {

        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    @Override // finalizamos la tarea
    protected void onPostExecute(String s) {

        progress.setVisibility(View.INVISIBLE);

        Intent i = new Intent(getBaseContext(), home_act.class);
        startActivity(i);

    }
}
    public void Iniciarsession(View v) {
        if (editText.getText().toString().equals("Android") && editText1.getText().toString().equals("123")) {
            Intent i = new Intent(this, home_act.class);
            startActivity(i);
        }
        else if (editText.getText().toString().equals("android") && editText1.getText().toString().equals("123")) {

            Intent i = new Intent(this, home_act.class);
            startActivity(i);
        }
    }
}



