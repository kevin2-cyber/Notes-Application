package notes.digerati.scribble.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import notes.digerati.scribble.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>  {

    private Context context;
    private int[] mPlaceList;

    public RecyclerViewAdapter(Context context, int[] mPlaceList) {
        this.context = context;
        this.mPlaceList = mPlaceList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.save_area, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

    }


    @Override
    public int getItemCount() {
        return 0;
    }


}

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
    }
}
