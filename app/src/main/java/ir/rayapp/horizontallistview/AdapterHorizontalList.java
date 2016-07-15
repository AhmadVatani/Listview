package ir.rayapp.horizontallistview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AdapterHorizontalList extends RecyclerView.Adapter<AdapterHorizontalList.ViewHolder> {

    private ArrayList<String> items;

    public AdapterHorizontalList(ArrayList<String> items) {
        this.items = items;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;

        private ViewHolder(View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.img);
            txt = (TextView) view.findViewById(R.id.txtName);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_list, null);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String item = items.get(position);
        holder.txt.setText(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
