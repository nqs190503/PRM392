package com.prm3.onlineshopping;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_order);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ImageView imageView = findViewById(R.id.imgQR);
        String url = "https://scontent.fhan15-2.fna.fbcdn.net/v/t1.15752-9/462578759_986587626409565_7330512181133743099_n.jpg?stp=dst-jpg_s1080x2048_tt6&_nc_cat=104&ccb=1-7&_nc_sid=9f807c&_nc_eui2=AeGUKru0rMTwkDpJDWQE94wyNHDRJMhOXb40cNEkyE5dvqx8JCtKDzNrJ3psf9nSIp_VTkvz4UWXSYXr-mwAt1DP&_nc_ohc=9BkCAQBsS_cQ7kNvgHSVK1V&_nc_oc=AdlWYkGQzu92cnSGdgosaXtr9c4Cu5h4VgRN-Qfjx6YRYZGk_5QEIwvBDxWMxGaPDV9PLtrKtfB3tajAh8u3aucl&_nc_zt=23&_nc_ht=scontent.fhan15-2.fna&oh=03_Q7cD1wHxCGHLzj31Wi_roWJcBoJ-h6K9mWeWyFlLrKGlP4nL_Q&oe=6807B0BF";
        Picasso.get()
                .load(url)
                .placeholder(R.drawable.baseline_account_circle_24) // Ảnh hiển thị khi đang tải
                .error(R.drawable.baseline_error_24) // Ảnh hiển thị nếu lỗi
                .into(imageView);
    }
}