package br.ufc.quixada.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity6 extends AppCompatActivity {

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        gridView = findViewById(R.id.gridView);

        String[] NomeJogos = {"Doom", "Far CRy", "God Of War", "Horizon Zero Down", "Mario", "Shadow of The Colossus", "The Witcher", "Assassins Creed"};
        int[] imagemJogos = {R.drawable.d, R.drawable.fc, R.drawable.gow, R.drawable.hzd, R.drawable.m, R.drawable.soc, R.drawable.tw, R.drawable.ac};

        GridAdapter gridAdapter= new GridAdapter(MainActivity6.this,NomeJogos,imagemJogos);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity6.this, "Voce clicou no item " + NomeJogos[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}