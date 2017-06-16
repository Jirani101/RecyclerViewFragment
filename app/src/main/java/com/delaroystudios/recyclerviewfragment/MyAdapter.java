package com.delaroystudios.recyclerviewfragment;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by delaroy on 2/13/17.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String[] mDatasetTitle;
    private int[] mDatasetImage;
    private String[] mDatasetData;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public CardView cardView;
        public TextView textViewTitle;
        public ImageView imageView;
        public TextView textViewData;
        public MyViewHolder(View v){
            super(v);

            cardView = (CardView) v.findViewById(R.id.card_view);
            textViewTitle = (TextView) v.findViewById(R.id.tv_text);
            imageView =(ImageView)v.findViewById(R.id.iv_image);
            textViewData = (TextView)v.findViewById(R.id.tv_blah);

        }

    }

    public MyAdapter(String[] myDataset, int[] ints, String[] strings){
        mDatasetTitle = myDataset;
        mDatasetImage = ints;
        mDatasetData = strings;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        holder.textViewTitle.setText(mDatasetTitle[position]);
        holder.imageView.setImageResource(mDatasetImage[position]);
        holder.textViewData.setText(mDatasetData[position]);

    }

    @Override
    public int getItemCount() { return mDatasetTitle.length; }

}
