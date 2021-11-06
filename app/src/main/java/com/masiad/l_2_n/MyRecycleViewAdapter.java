package com.masiad.l_2_n;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecycleViewAdapter
        extends RecyclerView.Adapter<MyRecycleViewAdapter.ViewHandel> {

    List<Country> countries;

    public MyRecycleViewAdapter(Context context, List<Country> countryList){
        countries = countryList;
    }

    @NonNull
    @Override
    public ViewHandel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHandel holder, int position) {

    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public Country getItem(int id){
        return countries.get(id);
    }

    class ViewHandel extends RecyclerView.ViewHolder implements View.OnClickListener {


        public ViewHandel(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
