package com.example.myapplication2;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;


public class MobilAdapter1301184059 extends RecyclerView.Adapter<MobilAdapter1301184059.MyViewHolder>{

    string data1[], data2[];
    int images[];
    Context context;

    public MobilAdapter1301184059(Context ct,String s1[], string s2[]. int images[]){
        context = ct;
        data1 = s1;
        data2 = s2;
        images = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView){
                super(itemView);
        }
    }
}
