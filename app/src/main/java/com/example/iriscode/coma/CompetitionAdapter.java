package com.example.iriscode.coma;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by IRISCODE on 04/10/2017.
 */

public class CompetitionAdapter extends RecyclerView.Adapter<CompetitionAdapter.CompetitionViewHolder>{

    private ArrayList<Competition> competitionList;

    public CompetitionAdapter(ArrayList<Competition> competitionList) {
        this.competitionList = competitionList;
    }

    @Override
    public CompetitionViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.competition_list_row, parent, false);
        return new CompetitionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CompetitionViewHolder holder, int position) {
        Competition competition = competitionList.get(position);
        holder.competitionName.setText(competition.getCompetitionName());
        holder.competitionDate.setText(competition.getDate());
        holder.competitionDescription.setText(competition.getDescription());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CompetitionViewHolder extends RecyclerView.ViewHolder {
        public TextView competitionName;
        public TextView competitionDate;
        public TextView competitionDescription;

        public CompetitionViewHolder(View view) {
            super(view);
            competitionName = (TextView) view.findViewById(R.id.competition_name);
            competitionDate = (TextView) view.findViewById(R.id.competition_date);
            competitionDescription = (TextView) view.findViewById(R.id.competition_description);
        }
    }
}
