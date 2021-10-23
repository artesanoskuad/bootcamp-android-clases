package com.artesanoskuad.recyclerviewejemplo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.artesanoskuad.recyclerviewejemplo.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment implements PassElementSelected {

    private FragmentFirstBinding binding;
    private List<String> mWordList;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        wordListAutoGenerate();
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupRecyclerView();
        setupClickListener();
    }

    private void setupClickListener() {
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addWordItem();
            }
        });
    }

    private void addWordItem() {
        mWordList.add("valor desde Java");
        binding.rvWordList.getAdapter().notifyItemInserted(mWordList.size());
        binding.rvWordList.smoothScrollToPosition(mWordList.size());
    }

    private List<String> wordListAutoGenerate() {
        mWordList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mWordList.add("Word " + i);
        }
        return mWordList;
    }

    private void setupRecyclerView() {
        WordListAdapter wordListAdapter = new WordListAdapter(mWordList, this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        binding.rvWordList.setAdapter(wordListAdapter);
        binding.rvWordList.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void passElement(String element) {
        Toast.makeText(getContext(), element, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        binding = null;
    }

}