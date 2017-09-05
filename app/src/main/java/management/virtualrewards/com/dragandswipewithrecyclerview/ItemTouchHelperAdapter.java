package management.virtualrewards.com.dragandswipewithrecyclerview;

/**
 * Created by facts on 9/5/17.
 */

public interface ItemTouchHelperAdapter {
    boolean onItemMove(int fromPostion, int toPosition);
    void onItemDismiss(int position);

}
