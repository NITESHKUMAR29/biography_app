package com.example.biography.BiographyAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.biography.BiographyModel.BiographyModel;
import com.example.biography.Classes.RecyclerItemClickListener;
import com.example.biography.R;

import java.util.ArrayList;

public class BiographyAdapter extends RecyclerView.Adapter<BiographyAdapter.viewHolder>{
    ArrayList<BiographyModel> list;
    Context context;
    OnItemClickListener onItemClickListener;
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener)
    {
        onItemClickListener=listener;
    }


    public BiographyAdapter(ArrayList<BiographyModel> list, Context context) {
        this.list = list;
        this.context = context;


    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.sample,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        BiographyModel model=list.get(position);
        holder.pic.setImageResource(model.getPic());
        holder.name.setText(model.getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView pic;
        TextView name;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            pic=itemView.findViewById(R.id.pic);
            name=itemView.findViewById(R.id.name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onItemClickListener!=null){
                        int position=getAdapterPosition();
                        if(position!=RecyclerView.NO_POSITION){
                            onItemClickListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
}
