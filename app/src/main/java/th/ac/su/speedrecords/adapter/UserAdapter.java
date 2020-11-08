package th.ac.su.speedrecords.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import th.ac.su.speedrecords.R;
import th.ac.su.speedrecords.model.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

    private Context mContext;
    private User[] mUsers;

    public UserAdapter(Context context, User[] users) {
        this.mContext = context;
        this.mUsers = users;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //คำนวณตรงนี้
        final User user = mUsers[position];


    }

    @Override
    public int getItemCount() {
        return mUsers.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView MeterTextview;
        TextView SecondTextview;
        ImageView RedImageview;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.MeterTextview = itemView.findViewById(R.id.meter_textview);
            this.SecondTextview = itemView.findViewById(R.id.second_textview);
            this.RedImageview = itemView.findViewById(R.id.red_image_view);

        }
    }
}


