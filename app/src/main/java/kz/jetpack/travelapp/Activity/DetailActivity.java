package kz.jetpack.travelapp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.bumptech.glide.Glide;

import kz.jetpack.travelapp.Domain.ItemDomain;
import kz.jetpack.travelapp.databinding.ActivityDetailBinding;

public class DetailActivity extends BaseActivity {
    ActivityDetailBinding binding;
    private ItemDomain object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        getIntentExtra();
        if (object != null) {
            setVariable();
        } else {
            Log.e("DetailActivity", "Received null object");
            finish(); // Закрыть активность или показать сообщение об ошибке
        }
    }

    private void setVariable() {
        binding.titleTxt.setText(object.getTitle());
        binding.priceTxt.setText("$" + object.getPrice());
        binding.bedTxt.setText("" + object.getBed());
        binding.durationTxt.setText(object.getDuration());
        binding.descriptionTxt.setText(object.getDescription());
        binding.addressTxt.setText(object.getAddress());
        binding.distanceTxt.setText(object.getDistance());
        binding.ratingTxt.setText(object.getScore() + "Rating");
        binding.ratingBar.setRating((float) object.getScore());
        binding.backBtn.setOnClickListener(v -> finish());

        Glide.with(DetailActivity.this)
                .load(object.getPic())
                .into(binding.pic);

        binding.addToCartBtn.setOnClickListener(view -> {
            Intent intent = new Intent(DetailActivity.this, TicketActivity.class);
            intent.putExtra("object", object);
            startActivity(intent);
        });
    }

    private void getIntentExtra() {
        object = (ItemDomain) getIntent().getSerializableExtra("object");
        if (object == null) {
            Log.e("DetailActivity", "Intent object is null");
        }
    }
}
