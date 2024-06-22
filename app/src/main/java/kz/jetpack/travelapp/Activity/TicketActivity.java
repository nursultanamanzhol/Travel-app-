package kz.jetpack.travelapp.Activity;

import android.os.Bundle;

import kz.jetpack.travelapp.databinding.ActivityTicketBinding;

public class TicketActivity extends BaseActivity {
    ActivityTicketBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTicketBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}