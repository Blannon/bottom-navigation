package com.example.projectone.User;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.WindowManager;

import com.example.projectone.Helperclasses.HomeAdapter.FeaturedAdapter;
import com.example.projectone.Helperclasses.HomeAdapter.FeaturedHelperClass;
import com.example.projectone.R;
import com.example.projectone.R.layout;

import java.util.ArrayList;

public class UserDashboard extends AppCompatActivity {

    RecyclerView featureRecycler;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(layout.user_dashboard);

        //Hooks
        featureRecycler=findViewById(R.id.featured_recycler);

        featureRecycler();
    }

    private void featureRecycler() {

        featureRecycler.setHasFixedSize(true);
        featureRecycler.setLayoutManager(new LinearLayoutManager(this
        ,LinearLayoutManager.HORIZONTAL,false));


        ArrayList<FeaturedHelperClass>featuredServices = new ArrayList<>();

        featuredServices.add(new FeaturedHelperClass(R.drawable.canon,"Cannon Store","Finding legitimate services in a place you are new has never been that easy and we are here to help making it more convenient"));
        featuredServices.add(new FeaturedHelperClass(R.drawable.digitization,"Go Digital","Finding legitimate services in a place you are new has never been that easy and we are here to help making it more convenient"));
        featuredServices.add(new FeaturedHelperClass(R.drawable.electronics,"Electricals ","Finding legitimate services in a place you are new has never been that easy and we are here to help making it more convenient"));

        adapter= new FeaturedAdapter(featuredServices);
        featureRecycler.setAdapter(adapter);

    }
};