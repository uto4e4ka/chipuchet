package com.example.chipuchet.menu;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chipuchet.R;
import com.example.chipuchet.tools.CardsInfo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class cardsInfoMenuAdapter extends RecyclerView.Adapter<cardsInfoMenuAdapter.ViewHolder>{

    List<CardsInfo> all;

    public cardsInfoMenuAdapter(List<CardsInfo> all){
        this.all = all;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_info,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.textView.setText(all.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return all.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView,dateView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.typeName);
        }
        public TextView getTextView(){
            return textView;
        }
    }
}



