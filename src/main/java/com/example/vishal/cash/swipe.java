package com.example.vishal.cash;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Vishal on 8/24/2017.
 */
public class swipe extends PagerAdapter
{
    private int[] imags={R.drawable.images,R.drawable.images2,R.drawable.images3,R.drawable.images4,R.drawable.images5};
    private LayoutInflater inflater;
    private Context ctx;
    public swipe(Context ctx)
    {
        this.ctx=ctx;
    }

    @Override
    public int getCount() {
        return imags.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v=inflater.inflate(R.layout.swipe,container,false);
        ImageView img=(ImageView)v.findViewById(R.id.imageView2);
        TextView tv=(TextView)v.findViewById(R.id.textView);
        img.setImageResource(imags[position]);
        tv.setText("Image:"+position);
        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
