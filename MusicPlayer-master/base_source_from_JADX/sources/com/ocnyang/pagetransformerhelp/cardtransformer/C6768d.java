package com.ocnyang.pagetransformerhelp.cardtransformer;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.C1184a;
import coocent.music.player.base.BaseApplication;
import coocent.musiclibrary.music.p292j.C7397j;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.d */
/* compiled from: BannerSmallAdapter */
public class C6768d extends C1184a {

    /* renamed from: c */
    private BannerViewPager f30274c;

    /* renamed from: d */
    private int f30275d = 1;

    /* renamed from: e */
    private List<C6767c> f30276e;

    public C6768d(BannerViewPager bannerViewPager) {
        new LinkedList();
        new ArrayList();
        this.f30274c = bannerViewPager;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void mo26351x(View view) {
        this.f30274c.mo26321a(view);
    }

    /* renamed from: b */
    public void mo4039b(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((LinearLayout) obj);
    }

    /* renamed from: e */
    public int mo6295e() {
        List<C6767c> list = this.f30276e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: f */
    public int mo6296f(Object obj) {
        return -2;
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: j */
    public Object mo4041j(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setTextDirection(5);
        linearLayout.setGravity(16);
        linearLayout.setPadding(0, 0, C8345u.m46323d(10), 0);
        linearLayout.setPaddingRelative(0, 0, C8345u.m46323d(10), 0);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(viewGroup.getContext());
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.setMarginStart(C8345u.m46323d(5));
        linearLayout2.setGravity(16);
        linearLayout2.setLayoutParams(layoutParams);
        TextView textView = new TextView(viewGroup.getContext());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        textView.setText(this.f30276e.get(i % this.f30275d).f30271b);
        textView.setTextColor(C9332d.m49405b(C8345u.m46327h(), R.color.page_text_color));
        textView.setTextSize(15.0f);
        TextView textView2 = new TextView(viewGroup.getContext());
        if (BaseApplication.f31142E) {
            textView2.setText(this.f30276e.get(i % this.f30275d).f30272c);
            textView2.setTextColor(C9332d.m49405b(C8345u.m46327h(), R.color.page_sub_text_color));
        } else if (C8287e.m45812V()) {
            textView2.setText(this.f30276e.get(i % this.f30275d).f30272c);
            textView2.setTextColor(C9332d.m49405b(C8345u.m46327h(), R.color.page_sub_text_color));
        } else if (C8287e.m45873v() == null) {
            textView2.setText(C8345u.m46333n(R.string.sliding_to_skip));
            textView2.setTextColor(C8343s.m46301i(R.color.small_swarp_tab_item_sub_title_color));
        } else if (C8287e.m45873v().mo9215k() == this.f30276e.get(i % this.f30275d).mo26348a()) {
            textView2.setText(C8345u.m46333n(R.string.sliding_to_skip));
            textView2.setTextColor(C8343s.m46301i(R.color.small_swarp_tab_item_sub_title_color));
        } else {
            textView2.setText(this.f30276e.get(i % this.f30275d).f30272c);
            textView2.setTextColor(C9332d.m49405b(C8345u.m46327h(), R.color.page_sub_text_color));
        }
        textView2.setTextSize(12.0f);
        textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop() + C7397j.m41731a(viewGroup.getContext(), 2), textView2.getPaddingRight(), textView2.getPaddingBottom());
        textView2.setPaddingRelative(textView2.getPaddingLeft(), textView2.getPaddingTop() + C7397j.m41731a(viewGroup.getContext(), 2), textView2.getPaddingRight(), textView2.getPaddingBottom());
        linearLayout2.addView(textView);
        if (!this.f30276e.get(i % this.f30275d).f30272c.trim().isEmpty()) {
            linearLayout2.addView(textView2);
        }
        linearLayout.addView(linearLayout2);
        viewGroup.addView(linearLayout);
        linearLayout.setOnClickListener(new C6765a(this));
        return linearLayout;
    }

    /* renamed from: k */
    public boolean mo4042k(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: v */
    public List<C6767c> mo26350v() {
        return this.f30276e;
    }

    /* renamed from: y */
    public void mo26352y(List<C6767c> list) {
        List<C6767c> list2 = this.f30276e;
        if (list2 != null) {
            list2.clear();
            this.f30276e.addAll(list);
            if (list != null && list.size() != 0) {
                this.f30275d = list.size();
            }
        }
    }

    /* renamed from: z */
    public void mo26353z(List<C6767c> list) {
        this.f30276e = list;
        if (list != null && list.size() != 0) {
            this.f30275d = this.f30276e.size();
        }
    }
}
