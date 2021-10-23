package com.artesanoskuad.recyclerviewejemplo;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.artesanoskuad.recyclerviewejemplo.databinding.WordListItemBinding;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private List<String> mWordList;

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        WordListItemBinding binding =
                WordListItemBinding.inflate(
                        LayoutInflater.from(parent.getContext()),
                        parent,
                        false
                );
        return new WordViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        holder.bind(mWordList.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class WordViewHolder extends
            RecyclerView.ViewHolder {
        public TextView wordItemTv;

        public WordViewHolder(WordListItemBinding binding) {
            super(binding.getRoot());
            wordItemTv = binding.tvWordItem;
        }

        public void bind(String word){
            wordItemTv.setText(word);
        }
    }
}
