package com.example.uluujurt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
        */
public class DisclaimerFragment extends Fragment {

    ImageView imageViewFacebook;

    public DisclaimerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_disclaimer, container, false);

        imageViewFacebook = view.findViewById(R.id.image_view_facebook);

        imageViewFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/uluujurt/"));
                startActivity(intent);
            }
        });

/*        textView4.setText(SPRING_CODE);
        if (textView4 != null){
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
        }*/
        return view;
    }
}
