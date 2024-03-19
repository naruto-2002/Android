package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.helloworld.R;

import java.util.List;

import DATABASE.SQLiteHelper;
import model.LoaiGD;

public class SpinerLSAdapter extends BaseAdapter {
    private List<LoaiGD> list;
    private Context context;

    public SpinerLSAdapter(List<LoaiGD> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position+1;
    }

    @Override
    public long getItemId(int position) {
        return position+1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = LayoutInflater.from(context).inflate(R.layout.spiner_loaigd,parent,false);
        ImageView image = item.findViewById(R.id.image);
        TextView text = item.findViewById(R.id.text);
        image.setImageResource(list.get(position).getSrcIcon());
        text.setText(list.get(position).getNameIcon());
        return item;
    }
}
