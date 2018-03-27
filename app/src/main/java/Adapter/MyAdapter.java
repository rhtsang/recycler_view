package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recyclerviewapp.recyclerviewapp.DetailsActivity;
import com.example.recyclerviewapp.recyclerviewapp.R;

import java.util.List;

import Model.ListItem;

/**
 * Created by RaymondTsang on 12/23/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<ListItem> listItems;

    public MyAdapter(Context context, List listItems) {
        this.context = context;
        this.listItems = listItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ListItem item = listItems.get(position);

        holder.title.setText(item.getTitle());
        holder.description.setText(item.getDescription());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView title;
        public TextView description;

        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            title = (TextView) itemView.findViewById(R.id.titleId);
            description = (TextView) itemView.findViewById(R.id.descriptionId);


        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();

            ListItem item = listItems.get(position);

            //Toast.makeText(context, item.getTitle(), Toast.LENGTH_SHORT).show();

            Intent mainToDetails = new Intent(context, DetailsActivity.class);
            mainToDetails.putExtra("title", item.getTitle());
            mainToDetails.putExtra("description", item.getDescription());
            context.startActivity(mainToDetails);

        }
    }
}
