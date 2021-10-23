package com.artesanoskuad.recyclerviewejemplo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.artesanoskuad.recyclerviewejemplo.databinding.WordListItemBinding;

import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private List<String> mWordList;
    private PassElementSelected listener;

    public WordListAdapter(List<String> mWordList, PassElementSelected listener) {
        this.mWordList = mWordList;
        this.listener = listener;
    }

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
        return mWordList.size();
    }

    public class WordViewHolder extends
            RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView wordItemTv;

        public WordViewHolder(WordListItemBinding binding) {
            super(binding.getRoot());
            wordItemTv = binding.tvWordItem;
            wordItemTv.setOnClickListener(this);
        }

        public void bind(String word) {
            wordItemTv.setText(word);
        }

        @Override
        public void onClick(View view) {
            int position = getLayoutPosition();
            String element = mWordList.get(position);
            mWordList.set(position, "Seleccionado " + element);
            notifyDataSetChanged();
            listener.passElement(element);
        }
    }
}
