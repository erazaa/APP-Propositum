package com.gradesolutions.propositum.adapters;

import android.app.Activity;
import android.content.Intent;

import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.gradesolutions.propositum.R;
import com.gradesolutions.propositum.models.Advisor;
import com.gradesolutions.propositum.activities.AdvisorsDetailActivity;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;


public class AdvisorsAdapter extends RecyclerView.Adapter<AdvisorsAdapter.ViewHolder>{
    private ArrayList<Advisor> pictures;
    private int resource;
    private Activity activity;

    public AdvisorsAdapter(ArrayList<Advisor> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Advisor advisor = pictures.get(position);
        holder.usernameCard.setText(advisor.getUserName());
        holder.descriptionCard.setText(advisor.getDescription());
        Picasso.with(activity).load(advisor.getPicture()).into(holder.pictureCard);

        holder.pictureCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, AdvisorsDetailActivity.class);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
                    Explode explode = new Explode();
                    explode.setDuration(1000);
                    activity.getWindow().setExitTransition(explode);
                    activity.startActivity(intent,
                            ActivityOptionsCompat.makeSceneTransitionAnimation(activity, view, activity.getString(R.string.transitionname_advisors)).toBundle());

                }else {
                    activity.startActivity(intent);
                }


            }
        });

    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView usernameCard;
        private TextView descriptionCard;


        public ViewHolder(View itemView) {
            super(itemView);

            pictureCard     = (ImageView) itemView.findViewById(R.id.pictureCard);
            usernameCard    = (TextView) itemView.findViewById(R.id.userNameCard);
            descriptionCard        = (TextView) itemView.findViewById(R.id.descriptionCard);

        }
    }
}
