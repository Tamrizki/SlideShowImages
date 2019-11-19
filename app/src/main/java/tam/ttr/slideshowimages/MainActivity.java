package tam.ttr.slideshowimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    // Deklarasi ViewFlipper [1]
    private ViewFlipper flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Inisialisasi ViewFlipper yang telah di deklarasikan di sebelumnya [2]
        flipper = findViewById(R.id.flipper);

//        Buat Array untuk menampung gambar yang akan ditampilkan [3]
        int images[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3};

//      memanggil methode yang telah dibuat dengan melakukan perulangan untuk mengganti gambar [5]
        for (int i =0; i<images.length; i++){
            SlideImages(images[i]);
        }
    }

    //    Buat methode untuk mengatur ViewFlipper [4]
    public  void  SlideImages(int images){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        flipper.addView(imageView);

//        Atur durasi perpindahan gambar
        flipper.setFlipInterval(4000);
        flipper.setAutoStart(true);

        flipper.setInAnimation(this,android.R.anim.slide_in_left);
        flipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }
}
