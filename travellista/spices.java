package com.example.travellista;


import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class spices extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spicespage);
        lv=(ListView)findViewById(R.id.List);
        cutomadapter ad=new cutomadapter(this);
        lv.setAdapter(ad);
    }
}
class singleRow
{
    String title;
    String description;
    int image;
    singleRow(String title,String description,int image){
        this.title=title;
        this.description=description;
        this.image=image;

    }

}
class cutomadapter extends BaseAdapter {
    ArrayList<singleRow> list;
    Context context;

    public cutomadapter(Context c) {
        this.context = c;
        list = new ArrayList<singleRow>();
        String[] titles = {"Cardomom", "Coffee", "Ginger","Tea","Pepper"};
        String[] descriptions = {"Green cardomom", " commonly called coffee bean is a seed of the coffee plant, and is the source for coffee.  ", " A popular culinary item used in Kerala. ","Kerala's Idukki district is famous for its sprawling tea plantations that stretch across numerous hills in a carpet of greenery", "Pepper or black gold spice has earned Kerala transnational fame."};
        int[] images = {R.drawable.elam, R.drawable.kappi, R.drawable.inchi,R.drawable.tea,R.drawable.kuru};
        for (int i = 0; i < 5; i++) {
            singleRow s = new singleRow(titles[i], descriptions[i], images[i]);
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.spicespage, parent, false);
        TextView title = (TextView) row.findViewById(R.id.textView);
        TextView description = (TextView) row.findViewById(R.id.textView2);
        ImageView image = (ImageView) row.findViewById(R.id.image1);
        singleRow singleRow = list.get(position);
        title.setText(singleRow.title);
        description.setText(singleRow.description);
        image.setImageResource(singleRow.image);
        return row;
    }
}

