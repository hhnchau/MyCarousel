package info.kingpes.mycarousel;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;

public class CustomPageTransformer implements ViewPager.PageTransformer {

    private ViewPager viewPager;

    public CustomPageTransformer(Context context) {
    }

    public void transformPage(View view, float position) {
        if (viewPager == null) {
            viewPager = (ViewPager) view.getParent();
        }
        view.setScaleY(1 - Math.abs(position));
        view.setScaleX(1 - Math.abs(position));
    }

}