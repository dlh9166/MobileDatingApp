package com.example.practical_1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

        public class ViewHolder extends RecyclerView.ViewHolder {
            private ImageView mImageHero;
            private TextView mTextName;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                mImageHero = itemView.findViewById(R.id.image_hero);
                mTextName = itemView.findViewById(R.id.text_name);
            }
        }
}
