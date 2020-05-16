package com.example.uluujurt.WhoIsWho;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.uluujurt.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WhoIsWhoFragment extends Fragment /*implements View.OnClickListener*/ {

    LinearLayout cardVideo1;
    LinearLayout cardVideo2;
    LinearLayout cardVideo3;
    LinearLayout cardVideo4;
    LinearLayout cardVideo5;
    LinearLayout cardVideo6;
    LinearLayout cardVideo7;
    LinearLayout cardVideo8;
    LinearLayout cardVideo9;
    LinearLayout cardVideo10;

    public WhoIsWhoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_who_is_who, container, false);

        cardVideo1 = (LinearLayout) view.findViewById(R.id.card_who_is_who_1);
        //cardVideo1.setOnClickListener(this);
        cardVideo2 = (LinearLayout) view.findViewById(R.id.card_who_is_who_2);
        //cardVideo2.setOnClickListener(this);

        return view;
    }

    /*@Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.cardVideo1:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 0);
                intent.putExtra("tag", "##Сирия #джихад #Кыргызстан");
                intent.putExtra("title", "1 Ош, юг Кыргызстана ¦ Не от нашего имени");
                intent.putExtra("content", "\"Не от нашего имени\" – уникальный региональный ТВ-проект в Центральной Азии, где молодые люди обсуждают проблемы экстремизма. Первый выпуск (из десяти) посвящен южному региону Кыргызстана\n");
                intent.putExtra("url","https://www.facebook.com/watch/?v=365771697696798");
                startActivity(intent);

                break;
            case R.id.cardVideo2:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 1);
                intent.putExtra("tag", "#Араван #молодежь #ИГИЛ");
                intent.putExtra("title", "2 Ош, юг Кыргызстана ¦ Не от нашего имени");
                intent.putExtra("content", "Второй выпуск проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/watch/?v=2603142076371027");
                startActivity(intent);

                break;
            case R.id.cardVideo3:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 2);
                intent.putExtra("tag", "#Кыргызстан #Сирия #терроризм");
                intent.putExtra("title", "3 Ош, юг Кыргызстана ¦ Не от нашего имени");
                intent.putExtra("content", "Третий выпуск проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/watch/?v=337807680461318");
                startActivity(intent);

                break;
            case R.id.cardVideo4:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 3);
                intent.putExtra("tag", "#Казахстан #ИГИЛ #Сирия");
                intent.putExtra("title", "Не от нашего имени Казахстан. 2");
                intent.putExtra("content", "Четвертый выпуск проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/watch/?v=1327314164102016");
                startActivity(intent);

                break;
            case R.id.cardVideo5:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 4);
                intent.putExtra("tag", "#джихад #Казахстан #Сирия");
                intent.putExtra("title", "Не от нашего имени Казахстан. 3");
                intent.putExtra("content", "Пятый выпуск проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/watch/?v=940286299651470");
                startActivity(intent);

                break;
            case R.id.cardVideo6:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 5);
                intent.putExtra("tag", "#Алматы #Жезказган #Сирия");
                intent.putExtra("title", "Не от нашего имени Казахстан.");
                intent.putExtra("content", "Шестой выпуск (из 10) проекта \"Не от нашего имени\" – уникального регионального ТВ-проекта в Центральной Азии, где молодые люди обсуждают проблемы экстремизма.");
                intent.putExtra("url","https://www.facebook.com/watch/?v=2737798542905042");
                startActivity(intent);
                break;

            case R.id.cardVideo7:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 6);
                intent.putExtra("tag", "");
                intent.putExtra("title", "История матери изменило мое мировозрение");
                intent.putExtra("content","\"Это может коснуться каждого из нас. Никто от этого не застрахован. И это изменит всю остальную жизнь.\" - говорит участница ток-шоу \"Не от нашего имени\" из Таджикистана.");
                intent.putExtra("url","https://www.facebook.com/watch/?v=900905500267720");
                startActivity(intent);
                break;

            case R.id.cardVideo8:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 7);
                intent.putExtra("tag", "");
                intent.putExtra("title", "На это нельзя было смотреть без слёз");
                intent.putExtra("content", "Участница ток-шоу \"Не от нашего имени\" из Таджикистана Дильноза задается тем же вопросом, как многие другие: \"Что из натолкнуло на то, чтобы бросить все и уехать на войну?!\"");
                intent.putExtra("url","https://www.facebook.com/watch/?v=2349999371918556");
                startActivity(intent);
                break;

            case R.id.cardVideo9:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 8);
                intent.putExtra("tag", "");
                intent.putExtra("title", "Дети играют важную роль во время принятия решений");
                intent.putExtra("content", "- Моя знакомая решилась вернуться с пол-пути только потому, что подумала о будущем своих детей.");
                intent.putExtra("url","https://www.facebook.com/watch/?v=737890489965598");
                startActivity(intent);
                break;

            case R.id.cardVideo10:
                intent = new Intent(getContext(), ContentActivity.class);
                intent.putExtra("index", 9);
                intent.putExtra("tag", "#война #Азия #Сирия");
                intent.putExtra("title", "Проект Не от нашего имени Таджикистан");
                intent.putExtra("content", "Надо обсуждать эту тему открыто. Важно, чтобы все могли говорить на эту тему. Потому, что если диалога не будет, то мы не сможем понимать корни этой проблемы.");
                intent.putExtra("url","https://www.facebook.com/watch/?v=2337872703143778");
                startActivity(intent);
                break;
        }
    }*/
}
