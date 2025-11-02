package com.example.app_loja;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.NossoViewHolder>{

    private List<Produto> mListProduto;

    @NonNull
    @Override
    public NossoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Declaramos um objeto View com o layout que será exibido para cada item
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itens, parent, false);
        // Declaramos um objeto NossoViewHolder e passamos como parâmetro o objeto View recém-criado
        NossoViewHolder viewHolder = new NossoViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NossoViewHolder holder, int position) {
        // Este método recebe dois parâmetros
        // O primeiro é um objeto NossoViewHolder que contém todas as referências do layout
        // O segundo é a posição de cada item da listagem

        // Se o RecyclerView conter dez objetos para serem exibidos, então este método será chamado automaticamente dez vezes para criar cada item da listagem.
    }

    @Override
    public int getItemCount() {
        // Este método retorna a quantidade de itens que deverá ser exibida na listagem
        return 0;
    }

    // Esta é a inner class
    public static class NossoViewHolder extends RecyclerView.ViewHolder {

        // Declaramos os objetos
        TextView mTextViewDescricao, mTextViewPreco;

        public NossoViewHolder(@NonNull View itemView) {
            super(itemView);
            // Aqui devem ser declarados todas as referências do arquivo itens.xml

            mTextViewDescricao = itemView.findViewById(R.id.textViewDescricao);
            mTextViewPreco = itemView.findViewById(R.id.textViewPreco);
        }
    }
}
