package com.example.amit.simple3;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by amit on 4/14/2017.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private static String[] mDataset;
    private Context context;
    Adapter(Context context,String[] myDataset) {
        mDataset = myDataset;
        this.context=context;
    }
    public Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view=LayoutInflater.from(context).inflate(R.layout.cccc,parent,false);
        return new MyViewHolder(view);




    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mTextView.setText(mDataset[position]);
    }


    @Override
    public int getItemCount() {
        return mDataset.length;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView mTextView;
        CardView cardView;
        public MyViewHolder(View itemView) {
            super(itemView);
            cardView=(CardView)itemView.findViewById(R.id.card_view);
            mTextView=(TextView) itemView.findViewById(R.id.info_text);
        }
    }


}
