package br.ufc.quixada.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    private TextView texto;
    private ToggleButton interruptor;
    private Button botao;
    private Button botao2;
    private Button botao3;
    private MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.textView);
        interruptor = findViewById(R.id.toggleButton1);
        botao = findViewById(R.id.botao1);
        botao2 = findViewById(R.id.botaoi);
        botao3 = findViewById(R.id.botaop);
        sound = MediaPlayer.create(this, R.raw.music);

        interruptor.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                texto.setText(converter(isChecked));

            }
        });

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }

    private String converter(boolean isChecked){

        return (isChecked) ? "Ligado" : "Delisgado";

    }

    public void showPopup (View v){
        PopupMenu popup =  new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "Item 1 selecionado", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item 2 selecionado", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Item 3 selecionado", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(this, "Item 4 selecionado", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }

    public void playMusic(View view) {
        sound.start();
    }

    public void stopMusic(View view) {
        sound.stop();
    }
}