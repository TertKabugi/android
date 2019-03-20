package com.king.morningproject10;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    Button mBtnOne,mBtnTwo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        mBtnOne = root.findViewById(R.id.btnOne);
        mBtnTwo = root.findViewById(R.id.btnTwo);
        mBtnOne .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Btn One Clicked ", Toast.LENGTH_SHORT).show();
            }
        });
        mBtnTwo .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Btn Two Clicked ", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}
