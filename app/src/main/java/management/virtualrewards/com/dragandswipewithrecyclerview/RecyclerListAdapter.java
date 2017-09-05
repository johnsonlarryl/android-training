package management.virtualrewards.com.dragandswipewithrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by facts on 9/5/17.
 */

public class RecyclerListAdapter extends RecyclerView.Adapter<ItemViewHolder> implements ItemTouchHelperAdapter {
    private static final String[] STRINGS = new String[] {
            "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"
    };

    private final List<String> mItems = new ArrayList<>();

    public RecyclerListAdapter() {
        mItems.addAll(Arrays.asList(STRINGS));
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.textView.setText(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    @Override
    public boolean onItemMove(int fromPostion, int toPosition) {
        if (fromPostion < toPosition) {
            for (int i = fromPostion; i < toPosition; i++) {
                Collections.swap(mItems, i, i +1);
            }
        } else {
            for (int i = fromPostion; i > toPosition; i--) {
                Collections.swap(mItems, i, i - 1);
            }
        }

        notifyItemMoved(fromPostion, toPosition);
        return true;
    }

    @Override
    public void onItemDismiss(int position) {
        mItems.remove(position);
        notifyItemRemoved(position);
    }
}
