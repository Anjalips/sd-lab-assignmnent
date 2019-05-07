package com.example.travellista;



import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.travellista.R;

import java.util.ArrayList;

public class resort extends AppCompatActivity {
    ListView lv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resortpage);
        lv=(ListView)findViewById(R.id.list1);
        adapt aa=new adapt(this);
        lv.setAdapter(aa);
    }
}
class singlerow{
    String title;
    String dec;
    int image;
    singlerow(String title,String dec,int image){
        this.title=title;
        this.dec=dec;
        this.image=image;
    }
}
class adapt extends BaseAdapter{
    ArrayList <singlerow>list;
    Context context;

    public adapt(Context c) {
        this.context=c;
        list=new ArrayList<singlerow>();
        String[]title={"Vettoms Lakeview Resort","Dream Catcher Plantation Resort","Sterling Thekkady ","Holiday Vagamon","Blanket Hotel & Spa"};
        String[]dec={"Vettoms Lakeview Resort Kudayathoor P.O.,Thodupuzha Idukki District," +
                " Dream Catcher Plantation Resort Tea Company,Bisonvalley Road, Rathnagiri, Kerala 685565" +
                " Sterling Thekkady Mangaladevi Road, Thekkady, Idukki, Thekkady, Kumily, Kerala 685509" +
                " Pullikkanam - Elappara Road, Vagamon, Kerala 685503\n" +
                "Phone: 062350 06699" +
                " Blanket Hotel & Spa  Attukad Waterfalls, Aluva - Munnar Road, Pallivasal, Kerala 685565"

        };
        int[]image={R.drawable.a, R.drawable.g,R.drawable.d,R.drawable.e,R.drawable.f};
        for(int i=0;i<5;i++){
            singlerow s=new singlerow(title[i],dec[i],image[i]);
            list.add(s);
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.resortpage,parent,false);
        TextView title=(TextView)row.findViewById(R.id.t1);
        TextView dec=(TextView)row.findViewById(R.id.t2);
        ImageView image=(ImageView)row.findViewById(R.id.im1);
        singlerow singlerow=list.get(position);
        title.setText(singlerow.title);
        dec.setText(singlerow.dec);
        image.setImageResource(singlerow.image);
        return  row;}

}
