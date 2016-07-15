package cogentdatasolutions.project1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Divya on 6/13/2016.
 */
public class Search extends Fragment {


    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.homepage,container,false);

        final TextView textView = (TextView)view.findViewById(R.id.txtviewsearch);

        final String[] array = {"Search Jobs...","Search Companies...","Search Salaries..."};
        textView.post(new Runnable() {
            int i = 0;
            @Override
            public void run() {
                textView.setText(array[i]);
                i++;
                if (i ==3)
                    i = 0;
                textView.postDelayed(this, 2000);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Nextpage.class);
                startActivity(intent);
            }
        });
        return view;

    }



}
