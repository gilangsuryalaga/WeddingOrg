package com.example.weddingorg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private List<Wedding> weddingList;
    private com.example.weddingorg.WeddingAdapter weddingAdapter;

    String[] wedding_name ={"Wedding1","Wedding2","Wedding3","Wedding4","Wedding5","Wedding6","Wedding7","Wedding8","Wedding9","Wedding10"};

    int[] pic = {
            R.drawable.wedding1,
            R.drawable.wedding2,
            R.drawable.wedding3,
            R.drawable.wedding4,
            R.drawable.wedding5,
            R.drawable.wedding6,
            R.drawable.wedding7,
            R.drawable.wedding8,
            R.drawable.wedding9,
            R.drawable.wedding10
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        if (mRecyclerView != null){
            mRecyclerView.setHasFixedSize(true);
        }
        mLayoutManager = new GridLayoutManager(this,2);

        mRecyclerView.setLayoutManager(mLayoutManager);

        weddingList = new ArrayList<>();

        for (int i = 0; i < wedding_name.length;i++){
            Wedding wedding = new Wedding(wedding_name[i],pic[i]);
            weddingList.add(wedding);
        }
        weddingAdapter = new com.example.weddingorg.WeddingAdapter(weddingList);

        mRecyclerView.setAdapter(weddingAdapter);
        weddingAdapter.notifyDataSetChanged();

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, new RecyclerItemClickListener.OnItemClickListener() {


            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MainActivity.this,"Card At " + position + " Is Clicked", Toast.LENGTH_SHORT).show();
            }
        }));
    }
}
