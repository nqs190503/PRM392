package com.prm3.onlineshopping.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.prm3.onlineshopping.HomeAdapter;
import com.prm3.onlineshopping.HomeDatabase;
import com.prm3.onlineshopping.ItemClass;
import com.prm3.onlineshopping.MainActivity;
import com.prm3.onlineshopping.R;
import com.prm3.onlineshopping.myclass.LoadData;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    View view;
    ArrayList<ItemClass> homeArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        ListView listView = view.findViewById(R.id.listView);
        HomeDatabase homeDatabase = new HomeDatabase(requireActivity().getApplicationContext());
        homeArrayList = homeDatabase.getAllDataUser();
        if(homeArrayList.size()==0){
            LoadData data = new LoadData(requireActivity().getApplicationContext());
        }
        HomeAdapter homeAdapter = new HomeAdapter(requireActivity().getApplicationContext(), homeArrayList);
        listView.setAdapter(homeAdapter);

        return view;
    }
    public void onResume() {
        super.onResume();

        MainActivity activity = (MainActivity) requireActivity();
        TextView toolbarText = activity.findViewById(R.id.toolbarText);
        toolbarText.setText("Home");
    }
}