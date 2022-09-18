package br.ufc.quixada.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    private ListView lista;
    private ArrayList<Jogo> itens;
    private JogoAdapter adapter;
    private Button botao;
    private Button botao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        botao = findViewById(R.id.botao5);
        botao2 = findViewById(R.id.botao6);
        lista = findViewById(R.id.listView);
        itens = new ArrayList<Jogo>();
        itens.add(new Jogo("Halo", "Xbox"));
        itens.add(new Jogo("God Of War", "Playstation"));
        itens.add(new Jogo("Pokemon", "Nintendo Switch"));
        adapter = new JogoAdapter(MainActivity5.this, itens);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity5.this, itens.get(i).getNome(), Toast.LENGTH_SHORT).show();
            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity5.this, itens.get(i).getPlataforma(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                startActivity(intent);
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity5.this, MainActivity4.class);
                startActivity(intent);
            }
        });
    }
}