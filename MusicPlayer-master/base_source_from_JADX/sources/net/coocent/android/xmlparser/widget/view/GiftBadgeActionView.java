package net.coocent.android.xmlparser.widget.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.gift.GiftWithGameActivity;
import p391j.p392a.p393a.C8612e;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class GiftBadgeActionView extends FrameLayout {

    /* renamed from: g */
    private AppCompatTextView f36590g;

    /* renamed from: h */
    private AppCompatImageView f36591h;

    /* renamed from: net.coocent.android.xmlparser.widget.view.GiftBadgeActionView$a */
    class C9536a implements View.OnClickListener {
        C9536a() {
        }

        public void onClick(View view) {
            GiftBadgeActionView.this.getContext().startActivity(new Intent(GiftBadgeActionView.this.getContext(), GiftWithGameActivity.class));
        }
    }

    public GiftBadgeActionView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m50035a() {
        View inflate = FrameLayout.inflate(getContext(), C8615h.layout_toolbar_hot_app, this);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C8612e.gift_action_provider_size);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        this.f36591h = (AppCompatImageView) inflate.findViewById(C8614g.iv_gift);
        AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(C8614g.tv_gift);
        this.f36590g = appCompatTextView;
        appCompatTextView.setVisibility(C9502v.m49943n() <= 0 ? 8 : 0);
        AppCompatTextView appCompatTextView2 = this.f36590g;
        appCompatTextView2.setText(C9502v.m49943n() + BuildConfig.FLAVOR);
        inflate.setOnClickListener(new C9536a());
    }

    /* renamed from: b */
    private int m50036b(int i, int i2) {
        return View.MeasureSpec.getMode(i2) != 1073741824 ? i : View.MeasureSpec.getSize(i2);
    }

    /* renamed from: c */
    public void mo32801c() {
        AppCompatTextView appCompatTextView = this.f36590g;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(C9502v.m49943n() <= 0 ? 8 : 0);
            AppCompatTextView appCompatTextView2 = this.f36590g;
            appCompatTextView2.setText(C9502v.m49943n() + BuildConfig.FLAVOR);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C8612e.gift_action_provider_size);
        setMeasuredDimension(m50036b(dimensionPixelSize, i), m50036b(dimensionPixelSize, i2));
    }

    public void setBadgeEnable(boolean z) {
        this.f36590g.setVisibility(z ? 0 : 8);
    }

    @SuppressLint({"RestrictedApi"})
    public void setGiftColor(int i) {
        AppCompatImageView appCompatImageView = this.f36591h;
        if (appCompatImageView != null) {
            appCompatImageView.setSupportImageTintList(ColorStateList.valueOf(i));
        }
    }

    public void setGiftImage(int i) {
        AppCompatImageView appCompatImageView = this.f36591h;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i);
        }
    }

    public GiftBadgeActionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftBadgeActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50035a();
    }
}
