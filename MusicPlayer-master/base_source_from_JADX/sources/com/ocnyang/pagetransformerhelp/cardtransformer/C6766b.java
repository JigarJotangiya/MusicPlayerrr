package com.ocnyang.pagetransformerhelp.cardtransformer;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager.widget.C1184a;
import coocent.music.player.widget.CoocentTextView;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.b */
/* compiled from: BannerAdapter */
public class C6766b extends C1184a {

    /* renamed from: c */
    private int f30268c = 1;

    /* renamed from: d */
    private List<C6767c> f30269d;

    public C6766b(BannerViewPager bannerViewPager) {
        new LinkedList();
        new ArrayList();
    }

    /* renamed from: b */
    public void mo4039b(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((LinearLayout) obj);
    }

    /* renamed from: e */
    public int mo6295e() {
        List<C6767c> list = this.f30269d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: f */
    public int mo6296f(Object obj) {
        return -2;
    }

    /* renamed from: j */
    public Object mo4041j(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        linearLayout.setGravity(17);
        linearLayout.setLayoutParams(layoutParams);
        CoocentTextView coocentTextView = new CoocentTextView(viewGroup.getContext());
        coocentTextView.setGravity(1);
        coocentTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        coocentTextView.setSingleLine();
        coocentTextView.setSelected(true);
        coocentTextView.setFocusable(true);
        coocentTextView.setFocusableInTouchMode(true);
        coocentTextView.setText(this.f30269d.get(i % this.f30268c).f30271b);
        coocentTextView.setTextColor(C9332d.m49405b(C8345u.m46327h(), R.color.page_text_color));
        coocentTextView.setTextSize(14.0f);
        CoocentTextView coocentTextView2 = new CoocentTextView(viewGroup.getContext());
        coocentTextView2.setGravity(1);
        coocentTextView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        coocentTextView2.setSingleLine();
        coocentTextView2.setSelected(true);
        coocentTextView2.setFocusable(true);
        coocentTextView2.setFocusableInTouchMode(true);
        coocentTextView2.setText(this.f30269d.get(i % this.f30268c).f30272c);
        coocentTextView2.setTextColor(C9332d.m49405b(C8345u.m46327h(), R.color.page_text_color));
        coocentTextView2.setTextSize(10.0f);
        linearLayout.addView(coocentTextView);
        linearLayout.addView(coocentTextView2);
        viewGroup.addView(linearLayout);
        return linearLayout;
    }

    /* renamed from: k */
    public boolean mo4042k(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: v */
    public List<C6767c> mo26345v() {
        return this.f30269d;
    }

    /* renamed from: w */
    public void mo26346w(List<C6767c> list) {
        List<C6767c> list2 = this.f30269d;
        if (list2 != null) {
            list2.clear();
            this.f30269d.addAll(list);
            if (list != null && list.size() != 0) {
                this.f30268c = list.size();
            }
        }
    }

    /* renamed from: x */
    public void mo26347x(List<C6767c> list) {
        this.f30269d = list;
        if (list != null && list.size() != 0) {
            this.f30268c = this.f30269d.size();
        }
    }
}
