package com.gradesolutions.propositum.adapters;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;
import com.androidnetworking.widget.ANImageView;
import com.gradesolutions.propositum.R;
import com.gradesolutions.propositum.models.Advisor;

import java.util.List;

/**
 * Created by William on 13/07/2017.
 */

public class AdvisorsAdapter extends RecyclerView.Adapter<AdvisorsAdapter.ViewHolder>{
    private List<Advisor> advisors;

    @Override
    public AdvisorsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder( LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.content_advisors,parent,false));

    }

    @Override
    public void onBindViewHolder(AdvisorsAdapter.ViewHolder holder, int position) {

        holder.logoANImageView.setErrorImageResId(R.mipmap.ic_launcher);
        holder.logoANImageView.setDefaultImageResId(R.mipmap.ic_launcher);
        holder.nameTextView.setText(advisors.get(position).getName());
        holder.specialityTextView.setText(advisors.get(position).getSpeciality());
        holder.descriptionTextView.setText(advisors.get(position).getDescription());
        holder.priceTextView.setText(advisors.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return advisors.size();
    }
    public List<Advisor> getAdvisors() {
        return advisors;
    }

    public AdvisorsAdapter setAdvisors(List<Advisor> advisors) {
        this.advisors = advisors;
        return this;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ANImageView logoANImageView;
        TextView nameTextView;
        TextView specialityTextView;
        TextView descriptionTextView;
        TextView priceTextView;
        TextView currencyTextView;
         ViewHolder(View itemView) {
            super(itemView);
             logoANImageView = (ANImageView) itemView.findViewById(R.id.logoANImageView);
             nameTextView    = (TextView) itemView.findViewById(R.id.nameTextView);
             specialityTextView = (TextView) itemView.findViewById(R.id.specialityTextView);
             descriptionTextView = (TextView) itemView.findViewById(R.id.descriptionTextView);
             priceTextView    = (TextView) itemView.findViewById(R.id.priceTextView);
             currencyTextView = (TextView) itemView.findViewById(R.id.currencyTextView);

        }
    }
}
