import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NumbersAdapter extends RecyclerView.Adapter<NumbersAdapter.NumberViewHolder> {

    private List<Integer> numbers;

    public NumbersAdapter(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberViewHolder holder, int position) {
        holder.textView.setText(String.valueOf(numbers.get(position)));
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }

    public void setFilteredList(List<Integer> filteredList) {
        this.numbers = filteredList;
        notifyDataSetChanged();
    }

    static class NumberViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(android.R.id.text1);
        }
    }
}
