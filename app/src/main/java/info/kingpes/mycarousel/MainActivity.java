package info.kingpes.mycarousel;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MyCarousel imageCarousel, textCarousel, mixCarousel;
    TextView tvSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageCarousel = (MyCarousel) findViewById(R.id.imageCarousel);
        textCarousel = (MyCarousel) findViewById(R.id.textCarousel);
        mixCarousel = (MyCarousel) findViewById(R.id.mixCarousel);
        tvSelected = (TextView) findViewById(R.id.tvSelectedItem);

        List<MyCarousel.PickerItem> imageItems = new ArrayList<>();
        imageItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name));
        imageItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name1));
        imageItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name2));
        imageItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name3));
        imageItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name));
        imageItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name1));
        imageItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name2));
        imageItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name3));
        imageItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name));
        MyCarousel.CarouselViewAdapter imageAdapter = new MyCarousel.CarouselViewAdapter(this, imageItems, 0);
        imageCarousel.setAdapter(imageAdapter);

        List<MyCarousel.PickerItem> textItems = new ArrayList<>();
        textItems.add(new MyCarousel.TextItem("hi", 20));
        textItems.add(new MyCarousel.TextItem("hi", 20));
        textItems.add(new MyCarousel.TextItem("hi", 20));
        textItems.add(new MyCarousel.TextItem("hi", 20));
        MyCarousel.CarouselViewAdapter textAdapter = new MyCarousel.CarouselViewAdapter(this, textItems, 0);
        textCarousel.setAdapter(textAdapter);

        List<MyCarousel.PickerItem> mixItems = new ArrayList<>();
        mixItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name3));
        mixItems.add(new MyCarousel.TextItem("hi", 20));
        mixItems.add(new MyCarousel.DrawableItem(R.drawable.ic_action_name2));
        mixItems.add(new MyCarousel.TextItem("hi", 20));

        MyCarousel.CarouselViewAdapter mixAdapter = new MyCarousel.CarouselViewAdapter(this, mixItems, 0);
        mixAdapter.setTextColor(getResources().getColor(R.color.colorPrimary));
        mixCarousel.setAdapter(mixAdapter);

        imageCarousel.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tvSelected.setText("Selected item in image carousel is  : "+position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        textCarousel.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tvSelected.setText("Selected item in text carousel is  : "+position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        mixCarousel.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tvSelected.setText("Selected item in mix carousel is  : "+position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
