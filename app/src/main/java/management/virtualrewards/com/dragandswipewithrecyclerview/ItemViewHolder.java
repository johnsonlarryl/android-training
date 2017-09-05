package management.virtualrewards.com.dragandswipewithrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by facts on 9/5/17.
 */

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public final TextView textView;

    public ItemViewHolder(View itemView) {
        super(itemView);

        textView = (TextView) itemView;
    }
}
