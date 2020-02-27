package com.trantan.demoapi.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.trantan.demoapi.R;
import com.trantan.demoapi.model.response.School;

import java.util.List;

public class SchoolAdapter extends RecyclerView.Adapter<SchoolAdapter.SchoolHolder> {
    private List<School> listSchool;
    private OnItemClickListener listener;


    public SchoolAdapter(List<School> listSchool, OnItemClickListener listener) {
        this.listSchool = listSchool;
        this.listener = listener;
    }

    @NonNull
    @Override
    public SchoolHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_school, parent, false);
        return new SchoolHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SchoolHolder holder, int position) {
        School school = listSchool.get(position);
        holder.txtName.setText(school.getmName());
        holder.txtShortName.setText(school.getmShortName());

        Glide.with(holder.itemView.getContext())
                .load(school.getmLogoUrl())
                .into(holder.imgLogo);
    }

    @Override
    public int getItemCount() {
        if (listSchool == null) {
            return 0;
        }
        return listSchool.size();
    }

    public class SchoolHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtName;
        TextView txtShortName;
        ImageView imgLogo;

        public SchoolHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtShortName = itemView.findViewById(R.id.txtShortName);
            imgLogo = itemView.findViewById(R.id.imgLogo);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClick(v, getAdapterPosition());
        }
    }
}
