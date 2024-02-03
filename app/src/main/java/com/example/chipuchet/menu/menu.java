package com.example.chipuchet.menu;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chipuchet.R;
import com.example.chipuchet.tools.CardsInfo;

import java.util.ArrayList;
import java.util.List;


public class menu extends Fragment {

View view;
RecyclerView rw;
    public menu() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<CardsInfo> cInfo = new ArrayList<>();
        CardsInfo cards = new CardsInfo("чипикард","","");
        cInfo.add(cards);
        cardsInfoMenuAdapter cAdapter = new cardsInfoMenuAdapter(cInfo);
        rw.setAdapter(cAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view =  inflater.inflate(R.layout.fragment_menu, container, false);
        rw = view.findViewById(R.id.cardInfo);
        return view;
    }
}