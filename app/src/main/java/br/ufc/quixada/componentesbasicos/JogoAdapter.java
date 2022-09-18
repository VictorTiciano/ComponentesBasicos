package br.ufc.quixada.componentesbasicos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class JogoAdapter extends BaseAdapter {

    private Context contexto;
    private ArrayList<Jogo> itens;

    public JogoAdapter(Context contexto, ArrayList<Jogo> itens) {
        this.contexto = contexto;
        this.itens = itens;
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int i) {
        return itens.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View inflater = LayoutInflater.from(contexto).inflate(R.layout.jogo_linha, viewGroup, false);
        TextView txtNome = inflater.findViewById(R.id.nome);
        TextView txtPlataforma = inflater.findViewById(R.id.plataforma);
        txtNome.setText(itens.get(i).getNome());
        txtPlataforma.setText(itens.get(i).getPlataforma());

        return inflater;
    }
}
