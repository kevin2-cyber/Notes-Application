package notes.digerati.scribble.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import notes.digerati.scribble.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder>  {

    private Context context;
    private int[] mNoteList;

    public RecyclerViewAdapter(Context context, int[] mNoteList) {
        this.context = context;
        this.mNoteList = mNoteList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.save_area, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.mNote.getResources().getResourceName(R.id.card_view);

    }


    @Override
    public int getItemCount() {
        return mNoteList.length;
    }


}

class RecyclerViewHolder extends RecyclerView.ViewHolder {

    CardView mNote;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        mNote = itemView.findViewById(R.id.card_view);
    }
}
