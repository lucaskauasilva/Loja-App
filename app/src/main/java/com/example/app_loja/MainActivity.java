package com.example.app_loja;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Produto> mListProduto;
    RecyclerView rvListagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mListProduto = new ArrayList<>();
        mListProduto.add(new Produto("Smart-phone", 1800f));
        mListProduto.add(new Produto("Tablet", 3600f));
        mListProduto.add(new Produto("Tv 50", 2100f));

        //instancia o RecyclerView
        rvListagem = findViewById(R.id.rvListagem);
        //define um tamanho fixo no layout
        rvListagem.setHasFixedSize(true);

        // Define como os itens serão exibidos no RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvListagem.setLayoutManager(layoutManager);

        // Adiciona uma linha entre cada item da listagem
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);

        //define adapter para recycler view
        Adaptador adaptador = new Adaptador();
        rvListagem.setAdapter(adaptador);

        //atualiza todos os itens para o adaptador
        adaptador.atualizarListagemCompleta(mListProduto);
    }
}