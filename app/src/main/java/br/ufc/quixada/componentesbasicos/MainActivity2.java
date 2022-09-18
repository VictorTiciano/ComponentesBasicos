package br.ufc.quixada.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private EditText texto;
    private Button botao;
    private Button botao2;
    private TextView opcao;
    private RadioGroup grupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        texto = findViewById(R.id.texto2);
        botao = findViewById(R.id.botao2);
        botao2 = findViewById(R.id.botao2_1);
        opcao = findViewById(R.id.textView3);
        grupo = findViewById(R.id.radioGroup);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto2  = texto.getText().toString();
                Toast.makeText(MainActivity2.this, texto2, Toast.LENGTH_SHORT).show();
                texto.setText("");
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                RadioButton op = findViewById(i);
                op.getText();
                opcao.setText(op.getText());

            }
        });

    }
}