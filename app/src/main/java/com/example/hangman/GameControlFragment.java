package com.example.hangman;
//
//import android.app.Fragment;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GameControlFragment extends Fragment {
    public GameControlFragment( ) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState ) {
        return inflater.inflate( R.layout.fragment_game_control,
                container, false );
    }
}
