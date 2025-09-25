package com.example.smartfit2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class WorkoutsFragment extends Fragment {

    RecyclerView recyclerView;
    WorkoutAdapter adapter;
    List<Workout> workoutList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workouts, container, false);

        recyclerView = view.findViewById(R.id.recyclerViewWorkouts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // ✅ Workouts with custom drawable images
        workoutList = new ArrayList<>();
        workoutList.add(new Workout("Arms", R.drawable.arms));
        workoutList.add(new Workout("Legs", R.drawable.legs));
        workoutList.add(new Workout("Chest", R.drawable.chest));
        workoutList.add(new Workout("Back", R.drawable.back));
        workoutList.add(new Workout("Abs", R.drawable.abs));

        adapter = new WorkoutAdapter(workoutList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
